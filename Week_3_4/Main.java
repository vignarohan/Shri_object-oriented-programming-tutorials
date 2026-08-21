public class Main {

    public static void main(String[] args) {

        Person p = new Person("Person", "P001");
        Person p1 = new Student("Shri", "S001");
        Person p2 = new Lecturer("Dr Ahmad", "L001");

        p.introduce();
        p1.introduce();
        p2.introduce();
    }
}
