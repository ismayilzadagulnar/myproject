public class SalariedEmployee extends Employee {
    double monthlySalary;

    public SalariedEmployee(String id, String name, double monthlySalary) {
        super(id, name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public String toString() {
        return "MonthlySalariedEmployee: " + super.toString() +
                "monthlySalary=" + calculateSalary();
    }

    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}
