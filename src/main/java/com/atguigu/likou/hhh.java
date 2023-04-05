import java.util.Scanner;
public class hhh {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        String[] spliInput = in.nextLine().split(",");

        long[] ints = new long[spliInput.length];
        for (int i = 0; i < spliInput.length; i++) {
            ints[i] = Long.parseLong(spliInput[i]);
        }

        long resAnswer = 0;
        for (int i = 0; i < spliInput.length; i++) {
            for (int j = i + 1; j < spliInput.length; j++) {
                long areaRegion = Math.min(ints[i], ints[j]) * (j - i);
                if (areaRegion > resAnswer) resAnswer = areaRegion;
            }
        }

        System.out.println(resAnswer);
    }

}
