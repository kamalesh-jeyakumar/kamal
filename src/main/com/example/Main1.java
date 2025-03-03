package com.example;

public class Main1 {
    public String greet() {
        return "Hello, Jenkins!"; 
    }

    public static void main(String[] args) {
        System.out.println(new Main().greet()); 
    }
}