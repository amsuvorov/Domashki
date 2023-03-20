import java.time.LocalDateTime;
public class FoodProduct extends Product {
    public FoodProduct(LocalDateTime productionDate, LocalDateTime expirationDate) {
        super(productionDate, expirationDate);
    }
}