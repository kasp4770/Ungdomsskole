import java.util.ArrayList;

public class PersonDAO implements PersonDAOInterface {

    static ArrayList<Person> persons;
    static int noOfUsers;

    public PersonDAO(){
        persons = new ArrayList<>();
        noOfUsers = 0;
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
        noOfUsers --;
    }
}
