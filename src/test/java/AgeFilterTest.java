import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;

public class AgeFilterTest {

    private ArrayList<Person> crowd;


    @Before
    public void setup() {

        crowd = new ArrayList<>();

        Person person1 = new Person("Connor", LocalDate.of(1993, 7, 29), Person.Sex.MALE, "con@internet.com");
        crowd.add(person1);
        Person person2 = new Person("Amanda", LocalDate.of(1990, 9, 2), Person.Sex.FEMALE, "Adam@internet.com");
        crowd.add(person2);
        Person person3 = new Person("Zolio", LocalDate.of(1802, 3, 19), Person.Sex.MALE, "Zolio@internet.com");
        crowd.add(person3);
        Person person4 = new Person("Barb", LocalDate.of(1980, 1, 9), Person.Sex.FEMALE, "Bob@internet.com");
        crowd.add(person4);
        Person person5 = new Person("Xander", LocalDate.of(2001, 7, 22), Person.Sex.MALE, "Xander@internet.com");
        crowd.add(person5);
        Person person6 = new Person("Adam", LocalDate.of(1950, 3, 27), Person.Sex.MALE, "Adam@internet.com");
        crowd.add(person6);
    }


    @Test
    public void printPersonsOlderThanTest(){


    }

}
