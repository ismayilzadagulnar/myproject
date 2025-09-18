public class Clothing extends Product {
    String size;

    public Clothing(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    double discountRule2() {
        if (size == "L" || size == "XL") {
           return price * 10 / 100;
        } else {
            return price * 5 / 100;
        }
    }

    public double calculateDiscountPrice() {
        return price - discountRule2();
    }

}
