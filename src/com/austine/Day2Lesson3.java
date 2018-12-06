package com.austine;

public class Day2Lesson3 {
    public static void main(String[] args) {
    // Data type Conversion
        String x, y;
        x = "10";
        y = "20";
        int xc, yc;
        xc = Integer.parseInt(x);
        yc = Integer.parseInt(y);
        System.out.println(xc + yc);
        System.out.println(x + y);

        String one, two;
        Double oneC, twoC;
        one = "10.5";
        two = "67.30";

        oneC = Double.parseDouble(one);
        twoC = Double.parseDouble(two);

        System.out.println("The answer is: " + oneC * twoC);

    }
}

