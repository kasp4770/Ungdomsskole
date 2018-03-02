import java.util.ArrayList;

public interface PersonDAOInterface {

    public ArrayList<Person> getAllPersons();
    public Person getPerson(int rollNo);
    public void updatePerson(Person person);
    public void deletePerson(Person person);
}
