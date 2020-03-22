import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Person {

    public enum Sex {
        MALE, FEMALE
    }

    ArrayList<Person> listPeople = new ArrayList<>();
    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;


    public Person(){};

    public Person(String name, LocalDate birthday, Sex gender, String emailAddress) {

        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.emailAddress = emailAddress;
    }

    public ArrayList<Person> getListPeople(){

        return listPeople;
    }

    public void setListPeople(ArrayList<Person> listPeople) {

        this.listPeople = listPeople;
    }

    public String getName() {

        return this.name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public LocalDate getBirthday() {

        return birthday;
    }

    public void setBirthday(LocalDate birthday) {

        this.birthday = birthday;
    }

    public Sex getGender() {

        return gender;
    }

    public void setGender(Sex gender) {

        this.gender = gender;
    }

    public String getEmailAddress() {

        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {

        this.emailAddress = emailAddress;
    }

    public int getAge() {

        return Period.between(birthday, LocalDate.now()).getYears();
    }

    public void printPerson() {

        System.out.println(String.format("Person Object{ Name: %s, Birthday: %s, Gender: %s, EmailAddress: %s}\n", name, birthday, gender, emailAddress));
    }

    public static void printPersons(List<Person> roster, CheckPerson tester) {

        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }

}
