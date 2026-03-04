package collectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import java.util.*;

public class A57 {
    public static void main(String[] args) {
        // Create a HashMap to store Product ID (Integer) and Product Object
        HashMap<Integer, A57a> inventory = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        // 1. Adding 10 products to the inventory
        inventory.put(101, new A57a(101, "Mobile-Samsung", 5, 12000, "Samsung"));
        inventory.put(102, new A57a(102, "Mobile-Vivo", 10, 13500, "Vivo"));
        inventory.put(103, new A57a(103, "T-Shirt", 20, 500, "Levi's"));
        inventory.put(104, new A57a(104, "Laptop-HP", 3, 55000, "HP"));
        inventory.put(105, new A57a(105, "Headphones", 15, 2000, "Sony"));
        inventory.put(106, new A57a(106, "Watch", 8, 4500, "Titan"));
        inventory.put(107, new A57a(107, "Shoes", 12, 3000, "Nike"));
        inventory.put(108, new A57a(108, "Backpack", 10, 1500, "Wildcraft"));
        inventory.put(109, new A57a(109, "Tablet", 4, 18000, "Apple"));
        inventory.put(110, new A57a(110, "Charger", 50, 800, "Mi"));

        // Variables to track the purchase
        ArrayList<A57a> cart = new ArrayList<>();
        ArrayList<Integer> cartQtys = new ArrayList<>();
        int tShirtCount = 0;

        while (true) {
            // Display Products
            System.out.println("\n| Product ID | Product Name | Available Units | Unit Price | Brand |");
            for (A57a p : inventory.values()) {
                System.out.printf("| %-10d | %-12s | %-15d | %-10.2f | %-5s |\n", 
                                  p.id, p.name, p.quantity, p.price, p.brand);
            }
            System.out.println("| 100        | Exit         |                 |            |       |");

            System.out.print("\nEnter the product id you want to purchase: ");
            int choice = sc.nextInt();

            if (choice == 100) break;

            if (inventory.containsKey(choice)) {
                A57a p = inventory.get(choice);
                System.out.print("Enter units to purchase: ");
                int units = sc.nextInt();

                if (units <= p.quantity) {
                    p.quantity -= units; // Reduce stock
                    cart.add(p);
                    cartQtys.add(units);
                    
                    if(p.name.equalsIgnoreCase("T-Shirt")) {
                        tShirtCount += units;
                    }
                    System.out.println("Added to cart!");
                } else {
                    System.out.println("Insufficient stock!");
                }
            } else {
                System.out.println("Invalid Product ID.");
            }
        }

        // 2. Display Bill
        displayBill(cart, cartQtys, tShirtCount);
    }

    public static void displayBill(ArrayList<A57a> cart, ArrayList<Integer> qtys, int tShirtCount) {
        System.out.println("\n----------- FINAL BILL -----------");
        System.out.printf("| %-15s | %-10s | %-3s | %-8s |\n", "Product Name", "Price", "Qty", "Total");
        
        double subTotal = 0;
        for (int i = 0; i < cart.size(); i++) {
            A57a p = cart.get(i);
            int q = qtys.get(i);
            double lineTotal = p.price * q;
            subTotal += lineTotal;
            System.out.printf("| %-15s | %-10.2f | %-3d | %-8.2f |\n", p.name, p.price, q, lineTotal);
        }

        // Apply Discounts
        double discount = 0;
        
        // T-Shirt Rule
        if (tShirtCount >= 3) {
            System.out.println("> 10% T-Shirt Bulk Discount Applied!");
            discount += (subTotal * 0.10);
        }

        // Total Bill Rules
        if (subTotal > 25000) {
            discount = subTotal * 0.20; // 20%
        } else if (subTotal >= 15000) {
            discount = subTotal * 0.10; // 10%
        }

        System.out.println("----------------------------------");
        System.out.println("Total Discount: Rs. " + discount);
        System.out.println("Final Amount:   Rs. " + (subTotal - discount));
        System.out.println("----------------------------------");
  
    
    
    
    /*Output:
| Product ID | Product Name | Available Units | Unit Price | Brand |
| 101        | Mobile-Samsung | 5               | 12000.00   | Samsung |
| 102        | Mobile-Vivo  | 10              | 13500.00   | Vivo  |
| 103        | T-Shirt      | 20              | 500.00     | Levi's |
| 104        | Laptop-HP    | 3               | 55000.00   | HP    |
| 105        | Headphones   | 15              | 2000.00    | Sony  |
| 106        | Watch        | 8               | 4500.00    | Titan |
| 107        | Shoes        | 12              | 3000.00    | Nike  |
| 108        | Backpack     | 10              | 1500.00    | Wildcraft |
| 109        | Tablet       | 4               | 18000.00   | Apple |
| 110        | Charger      | 50              | 800.00     | Mi    |
| 100        | Exit         |                 |            |       |

Enter the product id you want to purchase: 103
Enter units to purchase: 1
Added to cart!

| Product ID | Product Name | Available Units | Unit Price | Brand |
| 101        | Mobile-Samsung | 5               | 12000.00   | Samsung |
| 102        | Mobile-Vivo  | 10              | 13500.00   | Vivo  |
| 103        | T-Shirt      | 19              | 500.00     | Levi's |
| 104        | Laptop-HP    | 3               | 55000.00   | HP    |
| 105        | Headphones   | 15              | 2000.00    | Sony  |
| 106        | Watch        | 8               | 4500.00    | Titan |
| 107        | Shoes        | 12              | 3000.00    | Nike  |
| 108        | Backpack     | 10              | 1500.00    | Wildcraft |
| 109        | Tablet       | 4               | 18000.00   | Apple |
| 110        | Charger      | 50              | 800.00     | Mi    |
| 100        | Exit         |                 |            |       |

Enter the product id you want to purchase: 
     * 
     */
    
    
    
    
    
    
    
    
    
    
    }
}         



