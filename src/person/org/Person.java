package person.org;
import java.util.Date;

public class Person {

    private final String name;
    private final String surname;
    private final Date birthday;

    public Person(String name, String surname, int edad, Date birthday) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Date getBirthday() {
        return birthday;
    }

}
