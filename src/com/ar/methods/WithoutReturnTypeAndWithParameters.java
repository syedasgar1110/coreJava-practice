package com.ar.methods;

public class WithoutReturnTypeAndWithParameters {

    public void meth1(int a, String b) {
        System.out.println("Calling Instance Method without Return type and With Parameters");
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        WithoutReturnTypeAndWithParameters obj1 = new WithoutReturnTypeAndWithParameters();
        obj1.meth1(10, "asgar");

    }
}
