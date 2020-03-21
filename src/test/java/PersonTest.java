import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

    public class PersonTest {


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

        @After()
        public void tearDown(){
            crowd.clear();
        }

//        @Test
//        public void createTest(){
//
//            Person person7 = new Person();
//            Person person8 = new Person();
//
//            person7.create("Bobby", LocalDate.of(2002, 4, 22), Person.Sex.MALE, "bobby@internet.com");
//            person8.create("Reggy", LocalDate.of(1984, 2, 16), Person.Sex.FEMALE, "reggy@internet.com");
//            crowd.add(person7);
//            crowd.add(person8);
//
//            String expected7 = "bobby@internet.com";
////            String expected8 = 1984-2-16;
//
//
//            Assert.assertEquals(crowd.get(6).getEmailAddress(),expected7);
//        }

        @Test
        public void personListSizeTest() {

            Assert.assertEquals(crowd.size(), 6);
        }

        @Test
        public void personListAddTest() {

            crowd.add(new Person());
            Assert.assertEquals(crowd.size(), 7);
        }

        @Test
        public void personListRemoveTest() {

            crowd.remove(crowd.get(0));
            Assert.assertEquals(crowd.size(), 5);
        }

        @Test
        public void getName() {

            Person person3 = new Person();
            Assert.assertEquals(person3.getName(), "Connor");
        }

        @Test
        public void setName() {
            Person person2 = new Person();
            person2.setName("Jim");
            Assert.assertEquals(person2.getName(), "Jim");

        }

        @Test
        public void getBirthday() {

            Person person2 = new Person();
            Assert.assertEquals(person2.getBirthday(), LocalDate.of(1993, 7, 29));
        }

        @Test
        public void setBirthday() {

            Person person2 = new Person();
            person2.setBirthday(LocalDate.of(2000, 1, 1));
            Assert.assertEquals(person2.getBirthday(), LocalDate.of(2000, 1, 1));
        }

        @Test
        public void getGender() {

            Person person2 = new Person();
            Assert.assertEquals(person2.getGender(), Person.Sex.MALE);
        }

        @Test
        public void setGender() {
            Person person2 = new Person();
            person2.setGender(Person.Sex.MALE);
            Assert.assertEquals(person2.getGender(), Person.Sex.MALE);
        }

        @Test
        public void getEmailAddress() {

            Person person2 = new Person();
            Assert.assertEquals(crowd.get(1).getEmailAddress(), "Adam@internet.com");
        }

        @Test
        public void setEmailAddress() {

            Person person2 = new Person();
            person2.setEmailAddress("conboul@yahoo.com");
            Assert.assertEquals(person2.getEmailAddress(), "conboul@yahoo.com");
        }

        @Test
        public void getAge() {

            Person person2 = new Person();
            Assert.assertEquals(crowd.get(2).getAge(), 218);
        }

    }
