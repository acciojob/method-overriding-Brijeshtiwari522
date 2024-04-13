package com.driver;

public class Main {
    class A {
        public String meth(){
            return "Invoking method from class A";
        }
    }

    class B extends A {
        public String meth(){
            return "Method is overridden in Extended class B";
        }
    }
    public static void main(String[] args) {
        B objB =new B();
        String resultAMethod = objB.meth() ;
        System.out.println(resultAMethod);

        String resultBMethod = objB.meth();
        System.out.println(resultBMethod);
    }
}