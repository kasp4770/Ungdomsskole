import java.time.LocalDate;
import java.util.GregorianCalendar;

public class Test {
    public static void main(String[] args) {

        Person person = new Student("lala", "lala", LocalDate.of(1991,5,2),
                61408507, School.lille_nastved,"Ejlersvej 44", "lala", "lala") {
        };

        System.out.println(person.getAge());
    }
}
