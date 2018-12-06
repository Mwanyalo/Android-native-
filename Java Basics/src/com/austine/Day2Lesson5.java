package com.austine;

import java.util.Scanner;

public class Day2Lesson5 {
    public static void main(String[] args) {
        Double radius, height, answer;
        Scanner ingiza;
        ingiza = new Scanner(System.in);
        System.out.println("Enter the Radius");
        radius = ingiza.nextDouble();
        System.out.println("Enter the Height");
        height = ingiza.nextDouble();
        answer = Math.PI*Math.pow(radius, 2)*height;
        System.out.println("Volume = " +answer);
    }
}
