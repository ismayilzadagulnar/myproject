public class CommissionEmployee extends Employee {
    double baseSalary;
    double totalSales;
    double commissionRate;

    public CommissionEmployee(String id, String name, double baseSalary, double totalSales, double commissionRate) {
        super(id, name);
        this.baseSalary = baseSalary;
        this.totalSales = totalSales;
        this.commissionRate = commissionRate;
    }

    @Override
    double calculateSalary() {
        return baseSalary + (totalSales * commissionRate);
    }

    @Override
    public String toString() {
        return "CommissionEmployee: " + super.toString() +
                "Salary: " + calculateSalary();
    }
}
