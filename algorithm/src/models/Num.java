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

        StringBuilder sb = new StringBuilder();

        if (divisible.isEmpty()) {
            message = "The number " + num + " is prime";
        } else {
            for (int j = 0; j < divisible.size(); j++) {
                sb.append(divisible.get(j));

                if (j < divisible.size() - 1) {
                    sb.append(", ");
                }
            }

            String format = sb.toString();

            message = "The number " + num + " isn't prime, is divisible for: " + format;
        }

        return message;
    }
}