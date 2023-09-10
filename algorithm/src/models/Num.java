package models;

import java.util.ArrayList;

public class Num {
    private StringBuilder sb = new StringBuilder();
    private ArrayList<Integer> divisible = new ArrayList<>();
    private int i;
    private int j;
    private String message;

    public String isPrime(int num) {
        double equation = Math.sqrt(Math.round(num));

        for (i = 2; i <= equation; i++) {
            if (num % i == 0) {
                this.divisible.add(i);
            }
        }
        if (divisible.isEmpty()) {
            message = "The number " + num + " is prime";
        } else {
            for (j = 0; j < divisible.size(); j++) {
                this.sb.append(divisible.get(j));

                if (j < divisible.size() - 1) {
                    this.sb.append(", ");
                }
            }
            String format = this.sb.toString();

            message = "The number " + num + " isn't prime, is divisible for: " + format;
        }
        return message;
    }
}