import java.util.ArrayList;

public class PersonDAO implements PersonDAOInterface {

    static ArrayList<Person> persons;
    static int rollNo;

    public PersonDAO(){
        persons = new ArrayList<>();
        rollNo = 0;
    }

    @Override
    public ArrayList<Person> getAllPersons() {
        return persons;
    }

    public Person getPerson(int rollNo){
        return persons.get(rollNo);
    }

    public void updatePerson(Person person){} //----------------------

    public void deletePerson(Person person){
        persons.remove(person.getRollNo());
    }
}
