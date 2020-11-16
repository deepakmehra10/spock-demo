package com.deepak;

public class Driver {
    public static void main(String[] args) {
        Demo demo = new Demo();
        String greeting = demo.sayHello("Deepak");
        System.out.println(greeting);
        int result = demo.add(100, 100);
        System.out.println(result);
    }
}
