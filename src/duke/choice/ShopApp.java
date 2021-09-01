package duke.choice;

import java.util.Arrays;

public class ShopApp {
    public static void main(String[] args) {

        Customer customer = new Customer("Pinky", 3);

        customer.setSize("S");

        //System.out.println("Hello " + customer.getName());
        //System.out.println("Min price" + " " + Clothing.MINIMUM_PRICE);

        Clothing item1 = new Clothing("Blue Jacket", 20.9, "S");
        Clothing item2 = new Clothing("Orange T-Short", 10.5, "S");
        Clothing[] items = {item1, item2, new Clothing("Green Scarf", 5, "M"), new Clothing("Blue T-Short", 10.5, "S")};

        Arrays.sort(items);

        Arrays.stream(items).forEach(System.out::println);

        /*
        customer.addItems(items);
        customer.setSize(3);

        System.out.println("Total: " + customer.getTotalClothingCost());
        int total = 0;
        int count = 0;
        for (Clothing item : items) {
            if (item.getSize().equals("L")) {
                total += item.getPrice();
                count++;
            }
        }

        for (Clothing clothing : items) {
            System.out.println(clothing.toString());
        }
        */

        /*
        try{
            System.out.println("Average price = " + total / count);
        }catch(ArithmeticException e){
            System.out.println("Error dividing by ZERO!");
        }finally{
            System.out.println("FINAL");
        }
        System.out.println("Bye");

    }


     Gadget gadget1 = new Camera();
     Gadget gadget2 = new TV();
     gadget1.on();
     gadget1.off();

     gadget2.on();
     gadget2.off();
     */

    }
}

