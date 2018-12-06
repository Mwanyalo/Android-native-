package com.austine;

public class Day1Lesson2 {
    public static void main(String[] args) {
        double weight = 109;
        double height = 1.8;

        double bmi = weight / (height*height);
        System.out.println(bmi);

        if (bmi < 15){
            System.out.println("Very severely underweight");
        }
        else if (bmi >= 15 && bmi < 16){
            System.out.println("Severely underweight");
        }
        else if (bmi >= 16 && bmi < 18.5){
            System.out.println("Underweight");
        }
        else if (bmi >= 18.5 && bmi < 25){
            System.out.println("Normal (healthy weight)");
        }
        else if (bmi >= 25 && bmi < 30){
            System.out.println("Overweight");
        }
        else if (bmi >= 30 && bmi < 35){
            System.out.println("Obese Class I (Moderately obese)");
        }
        else if (bmi >= 35 && bmi < 40){
            System.out.println("Obese Class II (Severely obese)");
        }
        else if (bmi >= 40 && bmi < 45){
            System.out.println("Obese Class III (Very severely obese)");
        }
        else if (bmi >= 45 && bmi < 50){
            System.out.println("Obese Class IV (Morbidly Obese)");
        }
        else if (bmi >= 50 && bmi < 60){
            System.out.println("Obese Class V (Super Obese)");
        }
        else {
            System.out.println("Obese Class  VI (Hyper Obese)");
        }



    }
}
