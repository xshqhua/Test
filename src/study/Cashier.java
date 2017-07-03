package study;

import java.util.Scanner;

/**
 * Created by qinghan on 2017/7/2.
 */
public class Cashier {
    public static void main(String[] args){
        Scanner console=new Scanner(System.in);

        System.out.println("请输入购买商品的价格(¥)：");
        double commodityprice=console.nextDouble();

        System.out.println("请输入购买商品的数量：");
        int commodityNumber=console.nextInt();

        System.out.println("请输入收款金额(¥)：");
        double commodityMoney=console.nextDouble();

        console.close();
        //  计算商品总价
        double totalPrice=0.0;
        totalPrice=commodityprice*commodityNumber;
        if(totalPrice>=500){
            totalPrice=totalPrice*0.8;

        }
        //计算找零
        if(commodityMoney>=totalPrice){
            double change=commodityMoney-totalPrice;
            System.out.println("收款金额："+commodityMoney+" "+"商品总价："+totalPrice);
            System.out.println("商品找零(¥)："+change);
        }else {
            System.out.println("输入信息有误");
        }

    }
}
