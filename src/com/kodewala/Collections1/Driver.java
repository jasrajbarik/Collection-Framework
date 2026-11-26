package com.kodewala.Collections1;

public class Driver {
    public static void main(String[] args) {

        //1. store the price --> container(box) which holds integer value
        int[] price = {200, 5000, 100, 200, 300, 700, 2300, 5600}; //Memory --> Heap

        //2. process --> find the price value above 1000
        for (int index = 0; index < price.length; index++) {
            int currentPrice = price[index];
            if (currentPrice > 1000) {
                System.out.println(currentPrice);
            }
        }
    }
}
            /* Enhanced for:
            for (int currentPrice : price) {
            if (currentPrice > 1000) {
                System.out.println(currentPrice);
            }
            */
