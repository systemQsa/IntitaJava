package ua.intita.qa;

public class Main {
    public static void main(String[] args) {
            Product[] products = new Product[5];
            products[0] = new Product(1,"pineapple",12345678,7,"orange company",12.5F,2);
            products[1] = new Product(2,"pineapple",34567890,14,"pineapple company",24.3F,1);
            products[2] = new Product(3,"lemon",12563478,10,"lemon company",15.6F,3);
            products[3] = new Product(4,"avocado",89674523,21,"avocado company",86.7F,4);
            products[4] = new Product(5,"watermelon",67891234,3,"melon company",56.7F,1);
        /*
            products[0] = new Product(1,"pineapple",12345678,7);
            products[0] = new Product("orange company",12.5F,2);
            products[1] = new Product(2,"pineapple",23456781,14);
            products[1] = new Product("pineapple company",24.3F,1);
            products[2] = new Product(3,"lemon",34567812,10);
            products[2] = new Product("lemon company",15.6F,3);
            products[3] = new Product(4,"avocado",89123456,21);
            products[3] = new Product("avocado company",86.7F,4);
            products[4] = new Product(5,"watermelon",67894523,3);
            products[4] = new Product("melon company",56.7F,1);
           */

            ProductOperations productOperations = new ProductOperations();
            productOperations.listOfProducts(products,"pineapple");
            //productOperations.listOfProducts(products,24.3F,"pineapple");
            //productOperations.listOfProducts(products,"pineapple",7);
    }
}
