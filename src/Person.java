import java.time.LocalDate;

public abstract class Person {

    // private int rollNo;
    private PersonType type;

    public Person(){
        PersonDAO.persons.add(this);
        PersonDAO.rollNo ++;
    }

    public void setRole(PersonType type){
        this.type = type;
    }

    public String getRole(){
        return type.roleString();
    }

    public int getRollNo(){
        return PersonDAO.rollNo;
    }

    public abstract String getfName();

    public abstract String getlName();

    public abstract LocalDate getBirthDate();

    public abstract int getAge();

    public abstract int getPhoneNo();

    public abstract String getAdress();

    public abstract String getUsername();

    public abstract String getPassword();
}
