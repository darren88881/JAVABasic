package com.atguigu.jdkproxy;

/**
 * @author darren
 * @create 2020-11-28 11:16
 */
public class UsbKingFactory implements UsbSell {
    @Override
    public Integer sell() {
        System.out.println("USB的工厂价格为85");
        return 85;
    }
}
