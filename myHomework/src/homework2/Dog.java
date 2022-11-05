package homework2;

public class Dog extends Animal {
    public Dog(String name, String color, int age, double growth) {
        super(name, color, age, growth);
    }

    @Override
    public void voice() {
        System.out.println("gaf - gaf");
    }
}
