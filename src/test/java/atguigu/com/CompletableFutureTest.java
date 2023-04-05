package atguigu.com;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * thenApply        :然后应用，      用不同线程， 有参，有返回值
 * thenApplyAsync   :然后应用同步，   用一个线程，有参，有返回值
 *
 * thenAccept       :然后接受，      用不同线程，  有参，无返回值
 * thenAcceptAsync  :然后接受同步，    用一个线程，有参，无返回值
 *
 * thenRun          :然后运行，      用不同线程，无参，无返回值
 * thenRunAsync     :然后运行，      用一个线程，无参，无返回值
 *
 * whenComplete     :完成时，       用不同线程， 有参，无返回值
 * whenCompleteAsync:完成时，       用一个线程， 有参，无返回值
 *
 * handle           :处理，        用不同线程， 有参，有返回值
 * handleAsync      :处理，        用一个线程， 有参，有返回值
 *
 * 只有两个任务都正常完成时，才进行下阶段任务。
 * thenCombine      :然后合并，       两个入参，有返回值
 * thenAcceptBoth   :然后接收两者，    两个入参，无返回值
 * runAfterBoth     :在两者之后运行，  无参，无返回值
 *
 * 当有一个任务正常完成时，就会进行下阶段任务。
 * applyToEither    :适用任何一个，有参，有返回值
 * acceptEither     :接受任何一个，有参，无返回值
 * runAfterEither   :运行任何一个，无参，无返回值
 *
 * anyOf            :获取一个
 * allOf            :执行所有
 * @author darren
 * @create 2023-04-05 10:03
 */
public class CompletableFutureTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> cf1 = CompletableFuture.supplyAsync(() -> {
            try {
                System.out.println(Thread.currentThread() + " cf1 do something....");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("cf1 任务完成");
            return "cf1 任务完成";
        });

        CompletableFuture<String> cf2 = CompletableFuture.supplyAsync(() -> {
            try {
                System.out.println(Thread.currentThread() + " cf2 do something....");
                //int a = 1/0;
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("cf2 任务完成");
            return "cf2 任务完成";
        });

        CompletableFuture<String> cf3 = CompletableFuture.supplyAsync(() -> {
            try {
                System.out.println(Thread.currentThread() + " cf2 do something....");
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("cf3 任务完成");
            return "cf3 任务完成";
        });

        CompletableFuture<Void> cfAll = CompletableFuture.allOf(cf1, cf2, cf3);
        System.out.println("cfAll结果->" + cfAll.get());

    }
}
