package ru.shoppingcart;

import ru.shoppingcart.model.Apple;
import ru.shoppingcart.model.Food;
import ru.shoppingcart.model.Meat;
import ru.shoppingcart.model.constants.Colour;
import ru.shoppingcart.service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(5, 100); //Создается объект мясо 5кг со стоимостью 100 рублей за кило
        Apple redApples = new Apple(10, 50, Colour.COLOUR_RED); //Создается объект красных яблок 10кг со стоимостью 50 рублей за кило
        Apple greenApples = new Apple(8, 60, Colour.COLOUR_GREEN); //Создается объект зеленых яблок 8кг со стоимостью 60 рублей за кило
        Food[] foods = {meat, redApples, greenApples}; //Массив всех объектов
        ShoppingCart cart = new ShoppingCart(foods); //Помещаем их в корзинку для товаров

        System.out.println("Общая сумма без скидки: " + cart.totalPrices());
        System.out.println("Общая сумма товаров со скидкой: " + cart.discountedPrices());
        System.out.println("Сумма всех вегетарианских продуктов без скидки: " + cart.totalVegPrice());
    }
}