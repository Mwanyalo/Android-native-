package com.austine;

import java.util.Scanner;

public class Day2Lesson4 {
    public static void main(String[] args) {
        Double num1, num2, Answer;
        Scanner chukua;
        chukua = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        num1 = chukua.nextDouble();
        System.out.println("Enter the second number: ");
        num2 = chukua.nextDouble();
        Answer = num1 * num2;
        System.out.println("Your answer is: " + Answer);
    }
}
