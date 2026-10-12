package ru.shoppingcart.service;

import ru.shoppingcart.model.Food;

import java.util.Arrays;

public class ShoppingCart {
    private final Food[] foods;

    public ShoppingCart(Food[] foods) {
        this.foods = foods;

    }
    //Общая стоимость без скидки
    public double totalPrices() {
        return Arrays.stream(foods)
                .mapToDouble(item -> item.getPrice() * item.getAmount())
                .sum();
    }

    //Общая стоимость с учетом скидки
    public double discountedPrices() {
        return Arrays.stream(foods)
                .mapToDouble(item -> {
                    double discountMultiplier = (100. - item.getDiscount()) / 100.;
                    return item.getPrice() * item.getAmount() * discountMultiplier;
                })
                .sum();
    }

    //Общая стоимость только вегетарианских продуктов
    public double totalVegPrice() {
        return Arrays.stream(foods)
                .filter(Food::isVegetarian)
                .mapToDouble(item -> item.getPrice() * item.getAmount())
                .sum();
    }
    //Для написания этого кода мне помог Gemini, я попросил его объяснить принцип работы Stream API
}
