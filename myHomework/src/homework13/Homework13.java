package homework13;

/**
 * Java Prof. Homework #13
 *
 * @author Dzmitry Kryvialeu
 * @version 12.12 - 13.12
 */

import java.util.*;

public class Homework13 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.addAll(Arrays.asList("hello", "welcom", "java", "bye", "day"));
        System.out.println(stringList);
        Set<String> treeSet = new TreeSet<>(stringList);
        System.out.println(treeSet);

        List<Person> personList = new ArrayList<>();
        personList.addAll(Arrays.asList(new Person("John", 25),
                new Person("Nike", 35), new Person("Aike", 27)));
        System.out.println(personList);
        Set<Person> personSet = new TreeSet<>(personList);
        System.out.println(personSet);

        CompareAge compareAge = new CompareAge();
        Set<Person> ageSort = new TreeSet<>(compareAge);
        ageSort.addAll(personList);
        System.out.println(ageSort);
    }
}
