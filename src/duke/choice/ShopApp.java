package duke.choice;

public class ShopApp {
    public static void main(String[] args) {

        Customer customer = new Customer("Pinky",3);

        customer.setSize("S");

        System.out.println("Hello " + customer.getName());
        System.out.println("Min price" + " " + Clothing.MINIMUM_PRICE);

        Clothing item1 = new Clothing("Blue Jacket",20.9,"M");
        Clothing item2 = new Clothing("Orange T-Short",10.5,"S");
        Clothing[] items = {item1, item2, new Clothing("Green Scarf",5,"S"), new Clothing("Blue T-Short",10.5,"S")};

        customer.addItems(items);
        customer.setSize(3);

        for (Clothing clothing:items) {
            System.out.println(clothing.toString());
        }
        System.out.println("Total: " + customer.getTotalClothingCost());
    }
}


