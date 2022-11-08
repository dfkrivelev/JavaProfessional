package homework3;

/**
 * Java Prof. Homework #3
 *
 * @author Dzmitry Kryvialeu
 * @version 07.11 - 08.11
 */
public class SportsAnimals {
    public static void main(String[] args) {
        Dog dog = new Dog(500, 10);
        Cat cat = new Cat(200);

        Animal[] animals = {dog, cat};
        for (Animal animal : animals) {
            animal.run(350);
            animal.swim(15);
        }

        System.out.println("Количество животных - " + (Animal.numberOfCats + Animal.numberOfDogs));
        System.out.println("Количество котов - " + Animal.numberOfCats);
        System.out.println("Количество собак - " + Animal.numberOfDogs);
    }
}
