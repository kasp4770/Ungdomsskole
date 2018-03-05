import java.time.LocalDate;

public class Student extends Person{

    private School school;
    private SchoolGrade grade;

    public Student(String fName, String lName, LocalDate birthDate, int phoneNo, School school, SchoolGrade grade, String adress, String username, String password) {
        setfName(fName);
        setlName(lName);
        setBirthDate(birthDate);
        setPhoneNo(phoneNo);
        this.school = school;
        this.grade = grade;
        setAdress(adress);
        setUsername(username);
        setPassword(password);
        setRole(PersonType.STUDENT);
        /*if (getAge() < 13 || getAge() > 18) {
            throw new IllegalArgumentException("The student is either too old or too young to apply.");
        }*/
    }

    public School getSchool() {
        return school;
    }

    @Override
    public void setSchool(School school) {
        this.school = school;
    }

    public SchoolGrade getGrade() {
        return grade;
    }

    @Override
    public void setGrade(SchoolGrade grade) {
        this.grade = grade;
    }
}
