package com.ar.methods;

public class WithReturnTypeAndWithoutParameters {


    public int meth1() {
        System.out.println("Calling Instance Method with Return type and Without Parameters");
        return 100;
    }

    public static void main(String[] args) {
        WithReturnTypeAndWithoutParameters obj1 = new WithReturnTypeAndWithoutParameters();
        int i= obj1.meth1();
        System.out.println(i);
    }
}
