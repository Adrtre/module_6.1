package com.kodilla.patterns;

public class Fibonacci {
    public static long fibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            long prevPrev = 0;
            long prev = 1;
            long current = 0;
            for (int i = 2; i <= n; i++) {
                current = prev + prevPrev;
                prevPrev = prev;
                prev = current;
            }
            return current;
        }
    }

    public static void main(String[] args) {
        int n = 15;
        System.out.println("Fibonacci sequence " + n + " :");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
