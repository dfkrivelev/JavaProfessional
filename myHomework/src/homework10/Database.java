package homework10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Database {
    List<Employee> employeeList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void init(List<Employee> employees) {
        employeeList.addAll(employees);
    }

    public void create() {
        System.out.println("create: ");
        String name = scanner.next();
        String position = scanner.next();
        int salary = scanner.nextInt();
        int age = scanner.nextInt();
        employeeList.add(new Employee(name, position, salary, age));
    }

    public void read() {
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    private Employee findByName(String name) {
        for (Employee employee : employeeList) {
            if (employee.getName().equalsIgnoreCase(name)) {
                return employee;
            }
        }
        return null;
    }

    private Employee findById(int id) {
        for (Employee employee : employeeList) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    public void update() {
        System.out.print("find by id: ");
        int id = scanner.nextInt();
        Employee employee = findById(id);
        if (employee != null) {
            System.out.print("update (position, salary, age): ");
            String position = scanner.next();
            int salary = scanner.nextInt();
            int age = scanner.nextInt();
            employee.update(position, salary, age);
            System.out.println("update " + employee);
        }
    }

    public void delete() {
        System.out.print("findById: ");
        int id = scanner.nextInt();
        Employee employee = findById(id);
        if (employee != null) {
            employeeList.remove(employee);
            System.out.println("delete: " + employee);
        }
    }
}
