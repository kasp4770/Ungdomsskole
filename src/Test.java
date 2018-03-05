import java.time.LocalDate;
import java.util.GregorianCalendar;

public class Test {
    public static void main(String[] args) {

        PersonDAO List = new PersonDAO();

        Person person1 = new Student(/*0,*/"lala", "lala", LocalDate.of(2004,5,2),
                61408507, School.lille_nastved, SchoolGrade.tenth,"Ejlersvej 44", "lala", "lala");
        Person person2 = new Student(/*1,*/"Whala", "Hula", LocalDate.of(2002, 12, 2),
                58963257, School.ellebaeksskolen, SchoolGrade.seventh,"Kildemarksvej 188",  "barekoman", "fuckdig");
        Person person3 = new Student(/*2,*/ "Halløj", "Med dig", LocalDate.of(2003, 8, 17),
                69825869, School.kalbyrisskolen, SchoolGrade.ninth, "Fagotvej 5", "vildunoget?", "såKom!");
        Person person4 = new Faculty("Brian", "Plovman", LocalDate.of(1967, 6, 5), 58482156,
                "Hejsavej 33", "BrianP", "Brian1234");
        Person person5 = new Faculty("Brian2", "Plovman2", LocalDate.of(1967, 1, 5), 58482156,
                "Hejsavej 33", "BrianP", "Brian1234");
        System.out.println(person1.getAge());



        System.out.println(List.getAllPersons().indexOf(person3));
        System.out.println(List.getAllPersons());

        List.deletePerson(person1);
        System.out.println(List.getAllPersons().indexOf(person3));

        System.out.println(List.getPerson(1).getNoOfUsers());

        System.out.println(List.getAllPersons());

        System.out.println("Navn: " + person1.getfName() + person1.getlName() + "\n" +
                "Fødselsdag: " + person1.getBirthDate() + "\n");

        System.out.println("\n" + person4.getBirthDate() + " " + person4.getAge());
        System.out.println(person5.getBirthDate() + " " + person5.getAge());

        Course course1 = new Course(CourseType.FRENCH, 2, Classroom.CLASSROOM1);

        course1.addPerson(person1);
        course1.addPerson(person2);
        course1.addPerson(person3);

        System.out.println(course1.getAllPersons());
        course1.setFaculty(person5);
        System.out.println(course1.getFaculty().getfName());
        course1.setFaculty(person4);
        System.out.println(course1.getFaculty().getfName());
    }
}
