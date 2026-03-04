/*
 * Hashmap : Maintain Product Inventory in flipkart
===============================================

Product : Product ID, Product Name, Price, Brand, Quantity.
Create a hashmap & have 10 different products in that. 
Not needed : The program shoud give option for multiple users to purchase. 

Create the following methods:
1) Display Products() : this should display the following menu:

| Product ID | Product Name	| Available Units | Unit Price | Brand |
| 101	     | Mobile-Samsung	|  2		  |  12000     |       |		
| 102	     | Mobile-Vivo	|  5		  |  13500     |
| 103	     | Exit		|		  |	       |

Enter the product id you want to purchase : 101
Enter the number of units you want to purchase : 1
Note : display the above product list(with modified number of units) again until the user selects 103 : Exit

2) Display the bill to the purchaser. 
| Product Name   | Unit Price | Qty | Total | 
| Mobile-Samsung |	      | 1   |  	
| T-Shirt	 |   450      | 2   | 	 
| Total Discount
| Final Amount

Discounts & Offers:
-------------------
If the bill is more than Rs. 25000/-, 20% discount on  the total bill.
If the bill is between 15,000/- and 25000/- 10% discount on  the total bill.
If 3 t-shirts are purchased, 10% discount. 

3) Display the below details: ( Not needed)
3.1) The product which has highest number of units sold. 
3.2) The product that has generated highest revenue.
3.3) The brand that has generated highest revenue.


 */
package collectionFramework;

public class A57a {
    int id;
    String name;
    int quantity;
    double price;
    String brand;

    // Constructor to initialize product details
    public A57a(int id, String name, int quantity, double price, String brand) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.brand = brand;
    }
}

