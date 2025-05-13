package com.example.service1;

import com.example.lib1.Helper1;
import com.example.lib2.Helper2;
import com.example.lib3.Helper3;

public class Main {
    public static void main(String[] args) {
        System.out.println(Helper1.sayHi());
        System.out.println(Helper2.sayHello("Service 1"));
        System.out.println(Helper3.sayYo());
    }
}
