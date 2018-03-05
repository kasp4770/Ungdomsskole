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

    private String fName;
    private String lName;
    private LocalDate birthDate;
    private int phoneNo;
    private School school;
    private SchoolGrade grade;
    private String address;
    private String username;
    private String password;

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
    public PersonType getRole(){
        return type;
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

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getAge(){
        LocalDate now = LocalDate.now();
        LocalDate birth = birthDate;

        int year1 = now.getYear();
        int year2 = birth.getYear();
        int age = year1 - year2;

        int month1 = now.getMonthValue();
        int month2 = birth.getMonthValue();
        if(month2 > month1){ age--;
        }
        else if(month1 == month2){
            int day1 = now.getDayOfMonth();
            int day2 = birth.getDayOfMonth();
            if(day2 > day1){
                age--;
            }
        }
        return age;
    }
    
    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public SchoolGrade getGrade(){
        return grade;
    }

    public void setGrade(SchoolGrade grade){
        this.grade = grade;
    }

    public School getSchool(){
        return school;
    }

    public void setSchool(School school){
        this.school = school;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

