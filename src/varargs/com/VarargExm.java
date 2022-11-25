package com.varargs.com;
public class VarargExm {
    public int sumNumber(int ...args){
        System.out.println("argument length :"+args.length);
        int sum=0;
        for(int x:args){
            sum+=x;
        }
        return sum;
    }
    public static void main(String[] args) {
    VarargExm obj=new VarargExm();
    int sum1= obj.sumNumber(89);
        System.out.println(sum1);
    int sum2=obj.sumNumber(21,32);
        System.out.println(sum2);
    int sum3= obj.sumNumber(34,44,45);
        System.out.println(sum3);
    int sum4 = obj.sumNumber(32,43,54,65);
        System.out.println(sum4);
    }
}
