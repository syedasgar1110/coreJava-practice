package com.ar.methods;

public class StaticMethodWithoutReturnTypeAndWithParameters {
    public static void meth1(int a, String s){
        System.out.println("Calling Static Method Without Return Type And Parameters");
        System.out.println("----------------------------------------------------------");
        System.out.println(s+" scored "+a+" marks in the finals");
    }

    public static void main(String[] args) {



        StaticMethodWithoutReturnTypeAndWithParameters.meth1(90, "Abbas");


    }
}
