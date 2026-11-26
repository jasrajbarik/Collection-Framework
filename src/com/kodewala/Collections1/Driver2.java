package com.kodewala.Collections1;

public class Driver2 {
    public static void main(String[] args) {
        int i = 0;
        int[] name = new int[5];
        try {
            for ( i = 0; i <= 5; i++) {
                name[i] = i;
                System.out.println(name[i]);
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bound ");
            e.printStackTrace(System.out);
        }
    }
}
