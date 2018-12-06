package com.austine;

public class Day2Lesson2 {
    public static void main(String[] args) {
    //Length, toUpperCase, Trim, toLowerCase, concat(concatenate)
        String x;
        int y = 10;
        String z = "Years";
        String w, p;
        x = "       Hello King     ";
        w = "Hello";
        p = "hey";

        System.out.println(x.length());
        System.out.println(x.toUpperCase());
        System.out.println(x.trim());
        System.out.println(x.toLowerCase());
        System.out.println(y + " " + z);
        System.out.println(z.concat(String.valueOf(y)));

        if(w.equals(p)){
            System.out.println("Congrats");
        } else {
            System.out.println("Umeshindwa");
        }
    }
}
