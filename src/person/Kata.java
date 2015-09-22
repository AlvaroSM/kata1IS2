package Person;

import java.util.Date;

public class Kata {
    public static void main(String[] args) {

        Person person = new Person("Álvaro ", "Suarez ", new Date(95, 11, 23));

        System.out.println(person.getFullName());
        System.out.println(person.getDate());
        System.out.println(person.getAge());
    }
}
