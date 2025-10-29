package com.directi.training.srp.exercise;

import java.util.List;

public class CarNameFormatter {
    public String formatNames(List<Car> cars) {
        StringBuilder sb = new StringBuilder();
        for (Car car : cars) {
            sb.append(car.getBrand())
                    .append(" ")
                    .append(car.getModel())
                    .append(", ");
        }
        if (sb.length() >= 2) {
            sb.setLength(sb.length() - 2); // trim last ", "
        }
        return sb.toString();
    }
}