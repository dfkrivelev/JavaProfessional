package homework2;

public class Cat extends Animal {
    public Cat(String name, String color, int age, double growth) {
        super(name, color, age, growth);
    }

    @Override
    public void voice() {
        System.out.println("meow - meow");
    }
}
