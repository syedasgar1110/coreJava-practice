package com.ar.methods;

public class StaticMethodWithReturnTypeAndWithoutParameters {

    public static int meth1(){
        System.out.println("Calling Static Method With Return Type And Without Parameters");
        System.out.println("----------------------------------------------------------------");
        return 1000;

    }

    public static void main(String[] args) {
        int a=StaticMethodWithReturnTypeAndWithoutParameters.meth1();
        System.out.println(a);
    }
}
