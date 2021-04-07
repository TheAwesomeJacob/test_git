package ZapisOdczyt;


import java.io.Serializable;

public class Company implements Serializable {
    public static final int MAX_EMPLOYEES = 3;
    private static final long serialVersionUID = 3812017177088226528L;
    Employee[] company = new Employee[MAX_EMPLOYEES];
    int index = 0;
    public void addEmployee(Employee employee){
        company[index] = employee;
        index++;
        }
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Employee employee : company) {
            builder.append(employee.toString());
            builder.append("\n");
        }
        return builder.toString();
    }
}
