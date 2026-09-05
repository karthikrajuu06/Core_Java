package com.patternproblems;

public class Lowertraingle {

    public static void main(String[] args) {

        int n = 5;
        int star = n;
        int space = 0;

        while (star >= 1) {

            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= star; k++) {
                System.out.print("*");
            }

            System.out.println();

            star -= 2;
            space++;
        }
    }
}