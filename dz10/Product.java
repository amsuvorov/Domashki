import java.time.LocalDateTime;

public abstract class Product {
    private LocalDateTime productionDate;
    private LocalDateTime expirationDate;

    public Product(LocalDateTime productionDate, LocalDateTime expirationDate) {
        this.productionDate = productionDate;
        this.expirationDate = expirationDate;
    }

    public LocalDateTime getProductionDate() {
        return productionDate;
    }

    public LocalDateTime getExpirationDate() {
        return expirationDate;
    }
}