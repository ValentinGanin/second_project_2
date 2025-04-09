package model;

import model.constants.Colour;
import model.constants.Discount;

public class Apple extends Food implements Discountable {

    private String colour; // Цвет яблок

    // Конструктор для яблок
    public Apple(int amount, double price, String colour) {
        // Яблоки вегетарианские, поэтому передаём true
        super(amount, price, true);
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    // Если цвет "red", возвращаем 60%, иначе 0%
    @Override
    public double getDiscount() {
        if (Colour.RED.equalsIgnoreCase(colour)) {
            return Discount.RED_APPLE_DISCOUNT;
        }
        return Discount.NO_DISCOUNT;
    }
}
