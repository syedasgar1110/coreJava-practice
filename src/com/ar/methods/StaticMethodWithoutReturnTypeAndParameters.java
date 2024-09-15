package com.ar.methods;

public class StaticMethodWithoutReturnTypeAndParameters {
    public static void meth1(){
        System.out.println("Calling Static Method Without Return Type And Parameters");

    }
    public static void main(String[] args) {
        //StaticMethodWithoutReturnTypeAndParameters obj=new StaticMethodWithoutReturnTypeAndParameters();
        StaticMethodWithoutReturnTypeAndParameters.meth1();
        //obj.meth1();

    }
}
