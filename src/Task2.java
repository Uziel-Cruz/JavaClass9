package com.company;

public class Task2 {

    public static void main(String[ ] args) {
        int[] cruz56329 = {1, 2, 3, 6 , 8 , 21};
        System.out.println(cruz56329[7]);


        try {
            cruz56329 = new int[]{1, 2, 3, 6 , 8 , 21};

            System.out.println(cruz56329[7]);
        } catch (Exception e) {
            System.out.println("Something is off.");
        } finally {
            System.out.println("The 'try catch' is finished.");
        }


    }
}