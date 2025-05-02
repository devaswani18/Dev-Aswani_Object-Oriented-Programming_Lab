package CustomerPortal;
import ECommerce.Product;

public class CustomerCart {
    public CustomerCart(){
    } 
    public static void main(String[] args) {
        Product product = new Product();

        product.getProductDetails();
        
        // product.applyDiscount();  //Not Accessible (protected)
        // product.updateStock();    //Not Accessible (default/package-private)
        // product.calculateProfit(); //Not Accessible (private)
    }
}


