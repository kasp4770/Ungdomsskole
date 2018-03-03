import java.time.LocalDate;

public class Faculty extends Person{

    private String fName;
    private String lName;
    private LocalDate birthDate;
    private int phoneNo;
    private String adress;
    private String username;
    private String password;

    public Faculty(String fName, String lName, LocalDate birthDate, int phoneNo, String adress, String username, String password) {
        this.fName = fName;
        this.lName = lName;
        this.birthDate = birthDate;
        this.phoneNo = phoneNo;
        this.adress = adress;
        this.username = username;
        this.password = password;

        setRole(PersonType.FACULTY);
    }

    public String getFName() {
        return fName;
    }

    public String getLName() {
        return lName;
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
