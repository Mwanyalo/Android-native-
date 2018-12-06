package com.austine;

public class Loops {
    public static void main(String[] args) {
        int x, y;
        x = 0;
        y = 10;

        // While loop
        while (x < 5) {
            System.out.println(x);
            x++;
        }

        // Do while loop
        do {
            System.out.println(y);
            y++;
        } while (y<15);

        // For loop
        for (int z=20; z<25; z++){
            System.out.println(z);
        }
    }
}

