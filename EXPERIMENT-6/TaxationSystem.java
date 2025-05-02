class TaxCalculator
 {
    final double GST_RATE = 18.0;  

    final void displayGST() 
    {
        System.out.println("GST Rate: " + GST_RATE + "%");
    }
}
class Invoice extends TaxCalculator
 {
    double calculateTotalWithTax(double amount) 
    {
        return amount + (amount * GST_RATE / 100);
    }
    /*
    void displayGST() {
        System.out.println("Overriding attempt"); 
    }
    */
    /*
    void modifyGST() {
        GST_RATE = 20.0;  // Compilation error: Cannot assign a value to final variable 'GST_RATE'
    }
    */
}
public class TaxationSystem 
{
    public static void main(String[] args) 
    {
        Invoice invoice = new Invoice();
        invoice.displayGST();

        double amount = 1000.0; 
        double totalAmount = invoice.calculateTotalWithTax(amount);
        System.out.println("Total amount after applying GST: " + totalAmount);
    }
}