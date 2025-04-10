package service;

import model.Food;
import model.Discountable;

public class ShoppingCart {

    private Food[] items; // Массив продуктов в корзине

    // Конструктор принимает массив продуктов
    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    // Общая сумма товаров без скидки
    public double getTotalPriceWithoutDiscount() {
        double total = 0;
        for (Food item : items) {
            total += item.getAmount() * item.getPrice();
        }
        return total;
    }

    // Общая сумма товаров со скидкой
    // Считаем скидку для каждого товара (если класс реализует Discountable),
    // цена со скидкой: price * (1 - discount/100).
    public double getTotalPriceWithDiscount() {
        double total = 0;
        for (Food item : items) {
            double cost = item.getAmount() * item.getPrice();
            double discount = 0;
            if (item instanceof Discountable) {
                discount = ((Discountable) item).getDiscount(); // % скидки
            }
            total += cost * (1 - discount / 100);
        }
        return total;
    }

    // Сумма всех вегетарианских продуктов без скидки
    public double getTotalVegetarianPriceWithoutDiscount() {
        double total = 0;
        for (Food item : items) {
            if (item.isVegetarian()) {
                total += item.getAmount() * item.getPrice();
            }
        }
        return total;
    }
}
