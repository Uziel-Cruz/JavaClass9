package com.company;


class Cruz56329{
    static String hey() {
        String hey = null;
        return hey;
    }
}


public class Main {

    public static void main(String[] args) {
        Cruz56329 ref= null;
        //

        try{
            ref.toString();

        }
        catch (Exception e){
            System.out.println("Error");
            System.out.println(e);
            e.printStackTrace();

        }
    }
}