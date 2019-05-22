package application;

import entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter product data: ");

        System.out.println("Name: ");
        String name = sc.nextLine();
        

        System.out.println("Price: ");
        double price = sc.nextDouble();

        System.out.println("Quantity in stock: ");
        int quantity = sc.nextInt();
        
        Product product = new Product(name, price, quantity);
        
        System.out.println();
        System.out.println("product data: " + product);

        System.out.println();
        System.out.println("Enter de number of products to be added in stock");
        quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Update data: " + product);

        System.out.println();
        System.out.println("Enter de number o0f products to be removed from stock");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Update data: " + product);

        sc.close();
    }

}
