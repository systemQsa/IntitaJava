package ua.intita.qa;

public class ProductOperations {
    public void listOfProducts(Product[] products,String name){
        for (Product product:products) {
            if (name.equals(product.getName())){
                System.out.println(product.toString());
            }
        }
    }

    public void listOfProducts(Product[] products,double price,String name){
        for (Product product:products) {
            if (name.equals(product.getName())){
                if (product.getPrice() <= price){
                    System.out.println(product.toString());
                }
            }
        }
    }

     public void listOfProducts(Product[] products,String name,int shelfLife){
         for (Product product: products) {
             if (name.equals(product.getName())){
                 if (product.getShelfLife() > shelfLife){
                     System.out.println(product.toString());
                 }
             }
         }
     }

}
