package com.company.code;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

class Calculations {
    static double input() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    static int square(double num) {
        return (int) Math.pow(num, 2);
    }

    static double squareRoot(double num) {
        return new BigDecimal(Math.sqrt(num)).setScale(4, RoundingMode.UP).doubleValue();
    }
}
