package com.company.code;

import static com.company.code.Calculations.*;


public class Runner {
    private double num = input();
    private int square = square(num);
    private double squareRoot = squareRoot(num);


    public void run() {
        System.out.println(square);
        System.out.println(squareRoot);
        System.out.println(checkNum(square, squareRoot));
    }

    private boolean checkNum(int square, double squareRoot) {
        int[] arrInt = convert(square);
        int[] arrDouble = convert(squareRoot);
        for (int i : arrInt) {
            for (int j : arrDouble) {
                if (i == j) {
                    return true;
                }
            }
        }
        return false;
    }

    private int[] convert(int num) {
        String number = Integer.toString(num);
        return getInts(number);
    }

    private int[] convert(double num) {
        String number = Double.toString(num);
        return getInts(number);
    }

    private int[] getInts(String number) {
        int[] arrayInt = new int[number.length()];
        for (int i = 0; i < number.length(); i++) {
            arrayInt[i] = number.charAt(i) - '0';
        }
        return arrayInt;
    }

}
