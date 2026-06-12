
class Product {
   
 private String productName;
 private int quantity;
 private int threshold;


public Product(String productName, int quantity, int threshold) {
this.productName = productName;
this.quantity = quantity;
this.threshold = threshold;
}

public String getProductName() {
return productName;
}

public int getQuantity() {
return quantity;
}

public int getThreshold() {
return threshold;
}

public boolean isLowStock() {
return quantity < threshold;
}
}

class InventoryManager {

private Product[] products;

public InventoryManager(Product[] products) {
this.products = products;
 }

    
public void displayInventory() {
System.out.println("\n===== INVENTORY DETAILS =====");
for (Product p : products) {
String status = p.isLowStock()
                    ? "LOW STOCK ALERT!"
                    : "STOCK OK";

System.out.println("Product: " + p.getProductName());
System.out.println("Quantity: " + p.getQuantity());
System.out.println("Threshold: " + p.getThreshold());
System.out.println("Status: " + status);
System.out.println("-----------------------------");
        }
    }

public void checkLowStock() {
System.out.println("\n===== LOW STOCK REPORT =====");
boolean found = false;
for (Product p : products) {
if (p.isLowStock()) {
 System.out.println("⚠ ALERT: " +
p.getProductName() +
" is low on stock!");
found = true;
        }
        }

        if (!found) {
            System.out.println("All products have sufficient stock.");
        }
    }
}

public class WarehouseInventoryTracker {
public static void main(String[] args) {
Product p1 = new Product("Laptop", 25, 10);
Product p2 = new Product("Mouse", 5, 10);
Product p3 = new Product("Keyboard", 15, 10);
Product p4 = new Product("Monitor", 4, 8);
Product p5 = new Product("Printer", 12, 5);

       
    Product[] products = {p1, p2, p3, p4, p5};
          InventoryManager manager =
                new InventoryManager(products);
    System.out.println("Checking Inventory...");
        manager.displayInventory();
        manager.checkLowStock();
    }
}