package com.ar.methods;

public class StaticMethodWithReturnTypeAndWithParameters {

    public static int meth1(String s, int a){

        System.out.println("Calling Static Method With Return Type And Without Parameters");
        System.out.println("---------------------------------------");
        System.out.println(s+" won the match by "+a+" wickets");

        return 0;
    }

    public static void main(String[] args) {
        int i=StaticMethodWithReturnTypeAndWithParameters.meth1("INDIA",7);
        System.out.println(i);
    }
}
