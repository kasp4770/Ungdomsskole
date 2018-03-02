import java.time.LocalDate;

public class Student extends Person{


    private String fName;
    private String lName;
    private LocalDate birthDate;
    private int phoneNo;
    private School school;
    private SchoolGrade grade;
    private String adress;
    private String username;
    private String password;

    public Student(/*int rollNo,*/ String fName, String lName, LocalDate birthDate, int phoneNo, School school, SchoolGrade grade, String adress, String username, String password) {
        //setRollNo(rollNo);
        this.fName = fName;
        this.lName = lName;
        this.birthDate = birthDate;
        this.phoneNo = phoneNo;
        this.school = school;
        this.grade = grade;
        this.adress = adress;
        this.username = username;
        this.password = password;

        setRole(PersonType.STUDENT);
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getAge(){
        LocalDate now = LocalDate.now();
        int age = now.getYear() - this.birthDate.getYear();
        return age;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public School getSchool() {
        return school;
    }

    public String getAdress() {
        return adress;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
