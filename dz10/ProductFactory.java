import java.time.LocalDateTime;
public class ProductFactory {
    private static int foodProductCount;
    private static int nonFoodProductCount;

    public static FoodProduct createFoodProduct(LocalDateTime productionDate, LocalDateTime expirationDate) {
        foodProductCount++;
        return new FoodProduct(productionDate, expirationDate);
    }

    public static NonFoodProduct createNonFoodProduct(LocalDateTime productionDate, LocalDateTime expirationDate) {
        nonFoodProductCount++;
        return new NonFoodProduct(productionDate, expirationDate);
    }

    public static int getFoodProductCount() {
        return foodProductCount;
    }

    public static int getNonFoodProductCount() {
        return nonFoodProductCount;
    }

    public static int getTotalProductCount() {
        return foodProductCount + nonFoodProductCount;
    }
}
