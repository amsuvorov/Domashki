import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        FoodProduct foodProduct1 = ProductFactory.createFoodProduct(LocalDateTime.now(), LocalDateTime.now().plusDays(7));
        FoodProduct foodProduct2 = ProductFactory.createFoodProduct(LocalDateTime.now(), LocalDateTime.now().plusDays(10));
        NonFoodProduct nonFoodProduct1 = ProductFactory.createNonFoodProduct(LocalDateTime.now(), LocalDateTime.now().plusYears(1));
        NonFoodProduct nonFoodProduct2 = ProductFactory.createNonFoodProduct(LocalDateTime.now(), LocalDateTime.now().plusYears(2));

        System.out.println("Фабрика виготовила " + ProductFactory.getFoodProductCount() + " продуктових товарів");
        System.out.println("Фабрика виготовила " + ProductFactory.getNonFoodProductCount() + " непродуктових товарів");
        System.out.println("Загалом створено " + ProductFactory.getTotalProductCount() + " товарів");
    }
}