package homework17;

/**
 * Java Prof. Homework #17
 *
 * @author Dzmitry Kryvialeu
 * @version 12.01 - 15.01
 */


import homework12.DbInit;
import homework12.Employee;
import homework12.Position;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Homework17 {
    public static void main(String[] args) {
        List<Employee> employees = DbInit.init();

        List<Employee> enginners = employees.stream()
                .filter(e -> e.getPosition() == Position.ENGINEER).
                collect(Collectors.toList());
        System.out.println(enginners);

        Set<Position> positionSet = employees.stream()
                .map(e -> e.getPosition())
                .collect(Collectors.toSet());
        System.out.println(positionSet);

        Map<Integer, Employee> employeeMap = employees.stream()
                .collect(Collectors.toMap(e -> e.getId(), e -> e));
        System.out.println(employeeMap);
    }

    static void firstMeeting() {
        List<Employee> employees = DbInit.init();

        long count = 0;
        for (Employee employee : employees) {
            if (employee.getPosition() == Position.ENGINEER) {
                count++;
            }
        }
        System.out.println(count);

        count = 0;
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employee.getPosition() == Position.ENGINEER) {
                count++;
            }
        }
        System.out.println(count);

        count = employees.stream()
                .filter(e -> e.getPosition() == Position.ENGINEER)
                .count();
        System.out.println(count);
    }
}
