package JavaPractice;

public class ProductMain {
    public static void main(String[] args) {
        Product p1=new Product();
        Product p2=new Product(2, "Colgate");
        Product p3=new Product(7,"Amul Butter", 250);

        p1.displayProduct();
        p2.displayProduct();
        p3.displayProduct();
    }
}
