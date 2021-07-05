package com.alevel;

public class lesson2task2 {
    public static void main (String [] args){
        Long number = 2223372036L;
        String numberBinary=Long.toBinaryString(number);
        int count=0;
        for (int i=0; i<= numberBinary.length()-1; i++){
            char character = numberBinary.charAt(i);
            if (character == '1') count++;
        }
        System.out.println(count);
    }

}
