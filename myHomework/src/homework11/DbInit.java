package homework11;

import java.util.ArrayList;
import java.util.List;

public class DbInit {
    public static List<Employee> init() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Big", "boss", 5000, 45));
        employees.add(new Employee("Gina", "assistent", 1500, 21));
        employees.add(new Employee("Bill", "engineer", 1050, 35));
        employees.add(new Employee("john", "engineer", 1100, 35));
        return employees;
    }
}
