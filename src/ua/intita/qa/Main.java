package ua.intita.qa;

public class Main {
    public static void main(String[] args) {

            Product[] products = new Product[5];
           /*
            products[0] = new Product(1,"pineapple",12345678,7,"orange company",12.5F,2);
            products[1] = new Product(2,"pineapple",34567890,14,"pineapple company",24.3F,1);
            products[2] = new Product(3,"lemon",12563478,10,"lemon company",15.6F,3);
            products[3] = new Product(4,"avocado",89674523,21,"avocado company",86.7F,4);
            products[4] = new Product(5,"watermelon",67891234,3,"melon company",56.7F,1);
            */

            products[0] = new Product(1,"pineapple",12345678,7,"orange company",12.5F,2);
            products[1] = new Product("avocado",45.7F);
            products[2] = new Product("orange",9);
            products[3] = new Product("tomato",12.2F);
            products[4] = new Product("orange",5);


            ProductOperations productOperations = new ProductOperations();
            // productOperations.listOfProducts(products,"avocado");
            //productOperations.listOfProducts(products,24.3F,"orange");
            productOperations.listOfProducts(products,"orange",7);

    }
}
