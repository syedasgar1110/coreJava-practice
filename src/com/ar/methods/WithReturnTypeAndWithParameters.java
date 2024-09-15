package com.ar.methods;

public class WithReturnTypeAndWithParameters {

    public int meth1(int a, int b) {
        System.out.println("Calling Instance Method with Return type and With Parameters");
        System.out.println(a+b);
return 0;
    }

    public static void main(String[] args) {
        WithReturnTypeAndWithParameters obj1 = new WithReturnTypeAndWithParameters();
        int i= obj1.meth1(10,20);
        System.out.println(i);
    }
}
