package com.varargs.com;

public class VarargsOverload {
    public static void main(String[] args) {
    VarargsOverload obj=new VarargsOverload();
        obj.test(1,2,3);
        obj.test(true,"Hello","world");
    }
    private void test (int ...args){
        int sum=0;
        for(int x:args){
            sum+=x;
        }
        System.out.println("sum= "+sum);

    }
    private void test(boolean p,String ...args){
        boolean negate=! p;
        System.out.println("negate ="+negate);
        System.out.println("args.length="+args.length);
    }
}
