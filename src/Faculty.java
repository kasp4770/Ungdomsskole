import java.time.LocalDate;

public class Faculty extends Person{

    public Faculty(String fName, String lName, LocalDate birthDate, int phoneNo, String address, String username, String password) {
        setfName(fName);
        setlName(lName);
        setBirthDate(birthDate);
        setPhoneNo(phoneNo);
        setAddress(address);
        setUsername(username);
        setPassword(password);
        setRole(PersonType.FACULTY);
    }
}
