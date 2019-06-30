package org.sergei.core.enums;

/**
 * @author Sergei Visotsky
 */
enum Cars {
    LAMBORGHINI, PORSCHE, AUDI, BMW
}

public class ValuesValueOfSample {

    public static void main(String[] args) {
        Cars[] cars = Cars.values();
        for (Cars car : cars) {
            System.out.println(car);
        }

        Cars carOne = Cars.valueOf("AUDI");
        System.out.println(carOne);
    }

}
