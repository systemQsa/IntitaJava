package duke.choice;

public class ShopApp {
    public static void main(String[] args) {

        Customer c1 = new Customer("Pinky",3);

        c1.setSize("S");

        System.out.println("Hello " + c1.getName());
        System.out.println(Clothing.MINIMUM_PRICE);

        Clothing item1 = new Clothing("Blue Jacket",20.9,"M");
        Clothing item2 = new Clothing("Orange T-Short",10.5,"S");
        Clothing[] items = {item1, item2, new Clothing("Green Scarf",5,"S"), new Clothing("Blue T-Short",10.5,"S")};


        c1.addItems(items);
        c1.setSize(3);


        for (Clothing item : items) {
            System.out.println("Item: " + item.getDescription() + ", " + item.getPrice() + ", " + item.getSize());
        }
        System.out.println("Total: " + c1.getTotalClothingCost());
    }
}


