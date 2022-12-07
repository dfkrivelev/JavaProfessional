package homework11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Database {
    List<Employee> employeeList;
    Map<Integer, Employee> indexMap;

    public Database(List<Employee> employeeList) {
        //create list
        this.employeeList = new ArrayList<>();
        this.employeeList.addAll(employeeList);
        //create map (index)
        this.indexMap = new HashMap<>();
        for (Employee employee : employeeList) {
            indexMap.put(employee.getId(), employee);
        }
    }

    public void create() {
        Employee employee = DataUtil.getEmployee("create: ");
        employeeList.add(employee);
        indexMap.put(employee.getId(), employee);
    }

    public void read() {
        System.out.println(employeeList);
    }

    public void find() {
        String name = DataUtil.getString("find: ");
        List<Employee> found = new ArrayList<>();
        for (Employee employee : employeeList) {
            if (employee.getName().contains(name)) {
                found.add(employee);
            }
        }
        DataUtil.print(found);
    }

    private Employee findById(int id) {
        return indexMap.get(id);
    }

    public void update() {
        int id = DataUtil.getInt("update, find by id: ");
        Employee employee = findById(id);
        if (employee != null) {
            Employee tmp = DataUtil.getEmployeePart("update (position, salary, age): ");
            employee.update(tmp.getPosition(), tmp.getSalary(), tmp.getAge());
            System.out.println("Updated " + employee);
        }
    }

    public void delete() {
        int id = DataUtil.getInt("remove, find by id: ");
        Employee employee = findById(id);
        if (employee != null) {
            employeeList.remove(employee);
            indexMap.remove(employee.getId());
            System.out.println("Deleted: " + employee);
        }
    }
}
