package org.example;
import java.util.Scanner;

public class WhatMultiple {
    // declares an Array of integers.
    double[] myDoubleArray = new double[]{10000, 20073, 5, 3, 15, 567, 7262};
    double number;

    public String result;

    public String WhatDoesItReturn(Integer number) {

            if (number % 15 == 0) {
                result = "FizzBuzz";
            } else if (number % 5 == 0) {
                result = "Buzz";

            } else if (number % 3 == 0) {
                result = "Fizz";

            } else {
                result = number.toString();
            }


        return result;


    }
}

