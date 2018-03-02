package auto_java.basis_part3;

public class CreatePerson {
    public static void main(String[] args) {
        Person p1 = new Person("Olha", "Ivanova", "olha@i.ua");
        Person p2 = new Person("Ivan", "Petrov", "ivan@i.ua");

        System.out.println(p1.toString());
        System.out.println(p2.toString());

    }
}
