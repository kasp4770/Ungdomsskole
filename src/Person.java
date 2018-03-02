import java.time.LocalDate;

public abstract class Person {

    private int rollNo;
    private PersonType type;

    public Person(){
        PersonDAO.persons.add(this);
        PersonDAO.noOfUsers ++;
    }

    public void setRole(PersonType type){
        this.type = type;
    }

    public String getRole(){
        return type.roleString();
    }

    public int getNoOfUsers(){
        return PersonDAO.noOfUsers;
    }

    public int getRollNo() {
        /*int index = 0;
        int i;
        for(i = 0; i < PersonDAO.persons.size(); i++){
            System.out.println(String.valueOf(index++)+": "+i);
        }*/
        return PersonDAO.persons.indexOf(this);
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
