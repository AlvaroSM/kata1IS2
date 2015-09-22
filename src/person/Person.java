package Person;

import java.util.Date;

public class Person {

    private final String name;
    private final String surname;
    private final Date date;
    private static final long MILLIS_PER_YEAR = (long) (1000*60*60*24*365.25);

    public Person(String name, String surname, Date date) {
        this.name = name;
        this.surname = surname;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public String getFullName() {
        return name+" "+surname;
    }

    public String getSurname() {
        return surname;
    }

    public Date getDate() {
        return date;
    }

    public int getAge(){
        return ageCalculatorByMillis(new Date().getTime()-date.getTime());
    }

    private int ageCalculatorByMillis(long millis){
        return (int) (millis/MILLIS_PER_YEAR);
    }


}
