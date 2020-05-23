package io.pragra.learning;

public class EmployeeManager {
    private Employee [] employees ;

    public EmployeeManager() {
        employees = new Employee[10];
    }

    public void addEmployee(Employee employee){
        this.employees[0] = employee;
    }

    public Employee getEmployee(){
        return this.employees[0];
    }

}
