import java.time.LocalDate;
import java.util.GregorianCalendar;

public class Test {
    public static void main(String[] args) {

        PersonDAO List = new PersonDAO();

        Person person1 = new Student("lala", "lala", LocalDate.of(1991,5,2),
                61408507, School.lille_nastved,"Ejlersvej 44", "lala", "lala");
        Person person2 = new Student("Whala", "Hula", LocalDate.of(2005, 12, 2),
                58963257, School.ellebaeksskolen, "Kildemarksvej 188", "barekoman", "fuckdig");


        System.out.println(person1.getAge());



        System.out.println(List.getPerson(0).getRollNo());
        System.out.println((List.getAllPersons()));
    }
}
