package model;

public abstract class Food {
    protected int amount;          // Количество продукта в килограммах
    protected double price;        // Цена за единицу
    protected boolean isVegetarian; // Флаг вегетарианского продукта

    public Food(int amount, double price, boolean isVegetarian) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
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
