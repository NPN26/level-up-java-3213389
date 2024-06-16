package com.linkedin.javacodechallenges;

import java.util.List;

public class App {
    public static double calculateAverageChangeInvested(List<Double> purchases) {
        double sum = 0.0;
        for (Double purchase : purchases) {
            sum += Math.ceil(purchase)-purchase;
        }
        return sum/Math.max(purchases.size(),1);
    }

    public static void main(String[] args) {
        List<Double> purchases = List.of(12.38, 38.29, 5.27, 3.21);
        System.out.println(calculateAverageChangeInvested(purchases));
    }
}
