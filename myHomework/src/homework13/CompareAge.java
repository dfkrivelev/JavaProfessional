package homework13;

import java.util.Comparator;

public class CompareAge implements Comparator<Person> {
    @Override
    public int compare(homework13.Person o1, homework13.Person o2) {
        return o1.getAge() - o2.getAge();
    }
}
