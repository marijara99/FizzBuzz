package org.example;

import java.util.Scanner;

public class WhatMultiple {
    private Integer number;
    public String result;

    public WhatMultiple(int number) {
        this.number = number;
    }

    public String WhatDoesItReturn() {

        number = -1;
        while (number < 0 || number > 100) {
            System.out.println("Introduce un numero entre 0 y 100");
            Scanner sc = new Scanner(System.in);
            number = sc.nextInt();


        }

        if (number % 15 == 0) {
            result = "FizzBuzz";
        } else if (number % 5 == 0) {
            result = "Buzz";

        } else if (number % 3 == 0) {
            result = "Fizz";

        } else {
            result = "LightYear";
        }

        return result;

    }
}

