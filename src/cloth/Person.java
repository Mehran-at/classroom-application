package cloth;

public class Person {
    private String personName;
    private Cloth cloth;

    Person(String personName) {
        this.personName = personName;
    }

    void sayWhatIWear(Cloth cloth) {
        System.out.println(personName + " is wearing " + cloth.getClothName());
    }
}
