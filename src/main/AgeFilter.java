import java.util.List;

public class AgeFilter implements CheckPerson {

    public static void printPersonsOlderThan(List<Person> roster, int age) {

        for (Person p : roster) {
            if (p.getAge() >= age) {
                p.printPerson();
            }
        }
    }

    public static void printPersonsWithinAgeRange(List<Person> roster, int low, int high) {

        for (Person p : roster) {
            if (low <= p.getAge() && p.getAge() < high) {
                p.printPerson();
            }
        }
    }

    @Override
    public Boolean test(Person person) {
        if (person.getAge() >= 18) {
            person.printPerson();
            return true;
        }
        return false;
    }

}
