package model;

public class Meat extends Food implements Discountable {

    // Конструктор для мяса
    public Meat(int amount, double price) {
        // Мясо не является вегетарианским, поэтому передаём false
        super(amount, price, false);
    }

    // По умолчанию скидка равна 0
    @Override
    public double getDiscount() {
        return 0;
    }
}