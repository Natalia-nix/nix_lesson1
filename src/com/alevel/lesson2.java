package com.alevel;

public class lesson2 {
    public static void main(String[] args) {
        int num = 678764335;
        int digit;
        while (num > 0) {
            digit = num % 10;
            num = num / 10;
            if (digit % 2 == 0) {
                System.out.println(digit + " fizz");
                {
                    if (digit % 3 == 0) {
                        System.out.println(digit + " buzz"); {
                            if (digit % 2 == 0 && digit % 3 == 0)
                                System.out.println(digit + " fizzbuzz");
                        }
                    }
                }
            }

        }
    }
}
