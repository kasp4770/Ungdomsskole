import java.time.LocalDate;

public class Faculty extends Person{

    public Faculty(String fName, String lName, LocalDate birthDate, int phoneNo, String adress, String username, String password) {
        setfName(fName);
        setlName(lName);
        setBirthDate(birthDate);
        setPhoneNo(phoneNo);
        setAdress(adress);
        setUsername(username);
        setPassword(password);
        setRole(PersonType.FACULTY);
    }

    public SchoolGrade getGrade(){}
    public void setGrade(SchoolGrade grade){}
    public School getSchool(){}
    public void setSchool(School school){}
}
