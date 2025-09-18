public class HourlyEmployee extends Employee{
    double hourlyRate;
    double hoursWorked;

     HourlyEmployee(String id, String name, double hourlyRate, double hoursWorked) {
        super(id, name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String toString() {
        return "hourlyEmployee=" + super.toString() +
                ", Salary: " + calculateSalary();
    }

    double calculateSalary() {
        if (hoursWorked <= 160) {
            return hourlyRate * hoursWorked;
        } else {
            double overtime = hoursWorked - 160;
            return (hourlyRate * 160) + (overtime * hourlyRate * 1.5);
        }
    }

}
