package homework2;

public class Animal {
    protected String name;
    protected String color;
    protected int age;
    protected double growth;

    public Animal(String name, String color, int age, double growth) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.growth = growth;
    }

    public void voice() {
        System.out.println("Unknown");
    }

    @Override
    public String toString() {
        return "{name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
