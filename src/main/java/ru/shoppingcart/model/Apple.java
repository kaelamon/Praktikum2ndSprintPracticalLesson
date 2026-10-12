package ru.shoppingcart.model;

import ru.shoppingcart.model.constants.Colour;
import ru.shoppingcart.model.constants.Discount;

import java.util.Objects;


public class Apple extends Food {
    private final String colour;

    public Apple (int amount, double price, String colour) {
        super(amount, price, true);
        this.colour = colour;
    }
    @Override
    public double getDiscount() {
        if (Objects.equals(colour, Colour.COLOUR_RED)) {
            return Discount.DISCOUNT_RED;
        }
        return Discount.DISCOUNT_DEFAULT;
    }
}
