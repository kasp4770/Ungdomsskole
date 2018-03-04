import java.util.ArrayList;

public class Course extends ArrayList implements PersonDAOInterface{

    private CourseType type;
    private int personMax;
    private Classroom room;
    private ArrayList<Person> classMembers;
    private Person faculty;

    public Course(CourseType type, int studentMax, Classroom room) {
        this.type = type;
        this.personMax = studentMax;
        this.room = room;

        classMembers = new ArrayList<>();
    }

    public Course(CourseType type, int personMax, Classroom room, Person faculty) {
        this.type = type;
        this.personMax = personMax;
        this.room = room;
        this.faculty = faculty;
    }

    public CourseType getType() {
        return type;
    }

    public int getStudentMax() {
        return personMax;
    }

    public Classroom getRoom() {
        return room;
    }

    public boolean isFacultyOnCourse(){
        for(Person c : this.classMembers){
            if(c instanceof Faculty)
                return true;
        }
        return false;
    }

    public void setFaculty(Person faculty){
        this.faculty = faculty;
    }

    public Person getFaculty(){
        return faculty;
    }

    public void addPerson(Person person){
        if(classMembers.size() < personMax){
        classMembers.add(person);}else{
            System.out.println("Der er ikke plads på holdet.");
        }
    }

    public ArrayList<Person> getAllPersons() {
        return classMembers;
    }

    public Person getPerson(int rollNo){
        return classMembers.get(rollNo);
    }

    public void updatePerson(Person person){ //...............................................

    }

    public void deletePerson(Person person){
        classMembers.remove(person.getRollNo());
    }
}
