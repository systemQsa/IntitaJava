package duke.choice;

public class Clothing implements Comparable<Clothing>{

        public static double MINIMUM_PRICE = 10;
        public static double TAX_RATE = 0.2;

        private String description;
        private double price;

    @Override
    public int compareTo(Clothing o) {
        return this.description.compareTo(o.getDescription());
    }

    private String size = "M";


        public Clothing(String description, double price, String size){
            this.description = description;
            this.price = price;
            this.size = size;
        }
        public String getDescription() {
            return description;
        }


        public double getPrice() {
            return price + price * TAX_RATE;
        }

        public void setPrice(double price) {
            this.price = (price < MINIMUM_PRICE) ? MINIMUM_PRICE : price;
        }

        public String getSize() {
            return size;
        }

        @Override
        public String toString() {
            return "Clothing{" +
                    "description='" + description + '\'' +
                    ", price=" + price +
                    ", size='" + size + '\'' +
                    '}';
        }

}



