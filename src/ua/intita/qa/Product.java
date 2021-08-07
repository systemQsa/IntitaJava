package ua.intita.qa;

public class Product {
    private int id;
    private String name;
    private long UPC;
    private int shelfLife;
    private String manufacturer;
    private float price;
    private int amount;

    public Product(int id,String name,long UPC,int shelfLife,String manufacturer,float price,int amount){
        this.id = id;
        this.name = name;
        this.UPC = UPC;
        this.shelfLife = shelfLife;
        this.manufacturer = manufacturer;
        this.price = price;
        this.amount = amount;

    }

     public Product(String name,int shelfLife){
        this.name = name;
        this.shelfLife = shelfLife;
     }

     public Product(String name,float price){
        this.name = name;
        this.price = price;
     }

     public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getUPC() {
        return UPC;
    }

    public void setUPC(long UPC) {
        this.UPC = UPC;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", UPC=" + UPC +
                ", shelfLife=" + shelfLife +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setId(int id) {
        this.id = id;
    }
}
