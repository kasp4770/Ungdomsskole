import java.time.LocalDate;
/**
 * @author  Kasper F. Petersen
 * @version java    9.0
 * @since   java    9.0
 */
//Note: The reason this class is abstract and .... coming soon
public abstract class Person {
    /**
     * Parameters for Person.java
     */
    private int rollNo;
    private PersonType type;

    /**
     * Default constructor - Add's its objects to an ArrayList of PersonDAO.java and counts 1+ for each time
     * **/
    public Person(){
        PersonDAO.persons.add(this);
        PersonDAO.noOfUsers ++;
    }

    /**
     * Updates the status of the Person object
     * @param type of person ex. TEACHER or STUDENT
     */
    public void setRole(PersonType type){
        this.type = type;
    }

    /**
     * @return Returns a String of the role type
     */
    public String getRole(){
        return type.roleString();
    }

    /**
     * @return the number of Person objects
     */
    public int getNoOfUsers(){
        return PersonDAO.noOfUsers;
    }

    /**
     * @return the index of Person object in PersonDAO.persons ArrayList
     */
    public int getRollNo() {
        /*int index = 0;
        int i;
        for(i = 0; i < PersonDAO.persons.size(); i++){
            System.out.println(String.valueOf(index++)+": "+i);
        }*/
        return PersonDAO.persons.indexOf(this);
    }

    /**
     * @return the fName/front name
     */
    public abstract String getFName();

    /**
     * @return the lName/last name
     */
    public abstract String getLName();

    /**
     * @return the birthdate
     */
    public abstract LocalDate getBirthDate();

    public abstract int getAge();

    public abstract int getPhoneNo();

    public abstract String getAdress();

    public abstract String getUsername();

    public abstract String getPassword();
}
