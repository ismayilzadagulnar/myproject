public abstract class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
    abstract double  calculateDiscountPrice();

}
