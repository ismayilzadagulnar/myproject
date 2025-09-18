public class Company {
    Employee[] employees = new Employee[10];
    int count;

    public Company() {
        count = 0;
    }
    void addEmployee(Employee employee) {
        if (employee == null || count >= employees.length) return;
        for (int i = 0; i < employees.length; i++) {
            employees[i] = employee;
            count++;

        }
    }

}
