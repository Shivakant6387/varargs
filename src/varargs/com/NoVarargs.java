package com.varargs.com;

public class NoVarargs {
    public int sumNumber(int a,int b){
        return a+b;
    }
    public int sumNumber(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
    NoVarargs obj =new NoVarargs();
   int num= obj.sumNumber(10,20);
   int nums= obj.sumNumber(20,30,40);
        System.out.println(nums);
        System.out.println(num);
    }
}
