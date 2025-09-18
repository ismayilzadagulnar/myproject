public abstract class Employee {
    String id;
    String name;

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }


    abstract double calculateSalary();

    @Override
    public String toString() {
        return "ID: " + id +
                ", Name: " + name;
    }

}
