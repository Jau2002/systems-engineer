package models;

import java.util.ArrayList;

public class Num {

    public String isPrime(int num) {
        ArrayList<Integer> divisible = new ArrayList<>();

        double equation = Math.sqrt(Math.round(num));

        for (int i = 2; i <= equation; i++) {
            if (num % i == 0) {
                divisible.add(i);
            }
        }

        String message;

        if (divisible.isEmpty()) {
            message = "The number " + num + " is prime";
        } else {
            message = "The number " + num + " isn't prime";
        }
        return message;
    }
}