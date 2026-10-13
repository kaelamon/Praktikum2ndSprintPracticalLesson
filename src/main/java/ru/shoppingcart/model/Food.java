package ru.shoppingcart.model;

import ru.shoppingcart.model.constants.Discount;

public abstract class Food implements Discountable {
    //Количество продукта
    protected int amount;
    //Цена за единицу
    protected double price;
    //Флаг вегетарианский
    protected boolean isVegetarian;

    //Конструктор для еды.
    public Food(int amount, double price, boolean isVegetarian){
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    @Override
    public double getDiscount() {
        return Discount.DISCOUNT_DEFAULT;
    }

    public int getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }
}
