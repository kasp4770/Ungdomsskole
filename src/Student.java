import java.time.LocalDate;

public class Student extends Person{

    public Student(String fName, String lName, LocalDate birthDate, int phoneNo, School school, SchoolGrade grade, String address, String username, String password) {
        setfName(fName);
        setlName(lName);
        setBirthDate(birthDate);
        setPhoneNo(phoneNo);
        setSchool(school);
        setGrade(grade);
        setAddress(address);
        setUsername(username);
        setPassword(password);
        setRole(PersonType.STUDENT);
        /*if (getAge() < 13 || getAge() > 18) {
            throw new IllegalArgumentException("The student is either too old or too young to apply.");
        }*/
    }
}
