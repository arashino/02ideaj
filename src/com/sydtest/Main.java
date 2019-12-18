package com.sydtest;

import com.sydtest.model.Product;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String helloWorld = "Hello World";
        System.out.println(helloWorld);

        Product product = new Product("Desktop");

        System.out.println(product.getName());
    }
}
