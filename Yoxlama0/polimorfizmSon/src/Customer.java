public class Customer {
    String name;
    int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public boolean equals(Object obj) {
        if (!(obj instanceof Customer)) {
            return false;
        }
            Customer customer = (Customer) obj;

            return this.name == customer.name && this.age == customer.age;
        }

    }

