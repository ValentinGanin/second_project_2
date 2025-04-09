import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {

        // 1) Мясо в количестве 5 кг по цене 100 рублей за кг
        Meat meat = new Meat(5, 100);

        // 2) Яблоки красные: 10 кг по цене 50 рублей
        Apple redApple = new Apple(10, 50, Colour.RED);

        // 3) Яблоки зелёные: 8 кг по цене 60 рублей
        Apple greenApple = new Apple(8, 60, Colour.GREEN);

        // Массив продуктов
        Food[] products = { meat, redApple, greenApple };

        // Создаём корзину
        ShoppingCart cart = new ShoppingCart(products);

        // Считаем и выводим:
        // 1) Общую сумму товаров без скидки
        double totalWithoutDiscount = cart.getTotalPriceWithoutDiscount();
        System.out.println("Общая сумма товаров без скидки: " + totalWithoutDiscount);

        // 2) Общую сумму товаров со скидкой
        double totalWithDiscount = cart.getTotalPriceWithDiscount();
        System.out.println("Общая сумма товаров со скидкой: " + totalWithDiscount);

        // 3) Сумму всех вегетарианских продуктов без скидки
        double vegetarianTotal = cart.getTotalVegetarianPriceWithoutDiscount();
        System.out.println("Сумма вегетарианских продуктов без скидки: " + vegetarianTotal);
    }
}
