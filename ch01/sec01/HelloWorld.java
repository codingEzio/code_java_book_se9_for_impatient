package ch01.sec01;

import java.util.Random;

public class HelloWorld {
    public static void main(String[] args) {

        System.out.println("Hello Java!");
        System.out.println("Hello Java!".length());

        Random rand_gen = new Random();

        System.out.println("[Rand num]");
        System.out.println(rand_gen.nextInt());
        System.out.println(rand_gen.nextInt());
    }
}