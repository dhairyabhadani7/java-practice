package JavaPractice;

public class Product {
    private int id;
    private String name;
    private double price;
    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public Product(int id, String name) {
        this.id = id;
        this.name = name;
        this.price=0.0;
    }
    public Product() {
        this.id=0;
        this.name="unknown";
        this.price=0.0;
    }
    public void displayProduct(){
        System.out.println("Product ID: " + id);
        System.out.println("Product Name: " + name);
        System.out.println("Product Price: " + price);
        System.out.println("---------------------");
    }

    
}
