package ECommerce;
public class Product {
    public void getProductDetails() {
        System.out.println("Product details: Name - Laptop, Price - $1200");
    }

    protected void applyDiscount() {
        System.out.println("Applying a 10% discount...");
    }

    void updateStock() {
        System.out.println("Stock updated successfully.");
    }

    private void calculateProfit() {
        System.out.println("Calculating product profit...");
    }
}