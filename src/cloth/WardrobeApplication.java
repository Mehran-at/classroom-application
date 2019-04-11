package cloth;

public class WardrobeApplication {
    public static void main(String[] args) {
        Person jack = new Person("Jack");
        Cloth jean = new Cloth("Jean");
        jack.sayWhatIWear(jean);

        Person david = new Person("David");
        Cloth cloth = new Cloth("T-Shirt");
        david.sayWhatIWear(cloth);

        Person jenny = new Person("Jenny");
        jenny.sayWhatIWear(cloth);
    }
}
