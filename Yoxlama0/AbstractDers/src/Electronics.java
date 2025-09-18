public class Electronics extends Product {
    int warrantyMonth;

    public Electronics(String name, double price, int warrantyMonth) {
        super(name, price);
        this.warrantyMonth = warrantyMonth;
    }

    double discountRule1() {
        if (price > 1000) {
            return price * 10 / 100;
        } else {
            return price * 5 / 100;
        }
    }
    public double calculateDiscountPrice(){
        return price - discountRule1();
    }
}
