package com.driver;

public class Main {
    public static class Product{


        public int product(int x, int y) {
            return x*y;
        }

        // Overloading method
        public int product(int x, int y, int z) {
            return x*y*z;
        }

        // Overloading method
        public double product(double x, double y) {
            return x*y;
        }
    }

    public static void main(String[] args) {
        Product p = new Product();

        System.out.println(p.product(10,20));

        // calling overloaded method
        System.out.println(p.product(10,20,30));

        System.out.println(p.product(10.20,20.65));
    }
    }
