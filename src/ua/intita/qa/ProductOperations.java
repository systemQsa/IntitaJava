package ua.intita.qa;

public class ProductOperations {

    private final Product[] products;

    public ProductOperations(Product[] products) {
        this.products = products;
    }

    public Product[] findListOfProductsByName(String name) {
        int count = 0;
        for (Product product : products) {
            if (name.equals(product.getName())) {
                count++;
            }
        }
        Product[] newProducts = new Product[count];
        count = 0;
        for (Product product : products) {
            if (name.equals(product.getName())) {
                newProducts[count++] = product;
            }
        }
        return newProducts;
    }

    public void findListOfProductsByNameAndPrice(double price, String name) {
        for (Product product : products) {
            if (name.equals(product.getName()) && product.getPrice() <= price) {
                System.out.println(product);
            }
        }
    }

    public void listOfProducts(String name, int shelfLife) {
        for (Product product : products) {
            //System.out.println(product.getName());
            if (name.equals(product.getName())) {
                if (product.getShelfLife() > shelfLife) {
                    System.out.println(product.toString());
                }
            }
        }
    }

}
