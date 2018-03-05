import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import java.time.format.DateTimeFormatter;

public class UserDataController implements Initializable {

    private Person selectedPerson;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
    @FXML
    private Label lblFName, lblLName, lblBirthdate, lblAdress, lblPhoneNo, lblSchool, lblSchoolGrade, lblUsername,
            lblPassword;

    public void initData(Person person) {
        selectedPerson = person;
        if (selectedPerson instanceof Student) {
            lblFName.setText(selectedPerson.getfName());
            lblLName.setText(selectedPerson.getlName());
            lblBirthdate.setText(selectedPerson.getBirthDate().format(formatter));
            lblAdress.setText(selectedPerson.getAddress());
            lblPhoneNo.setText(Integer.toString(selectedPerson.getPhoneNo()));
            lblSchool.setText(((Student) selectedPerson).getSchool().schoolString());
            lblSchoolGrade.setText(((Student) selectedPerson).getGrade().gradeString());
            lblUsername.setText(selectedPerson.getUsername());
            lblPassword.setText(selectedPerson.getPassword());
        }else if (selectedPerson instanceof Faculty) {
            lblFName.setText(selectedPerson.getfName());
            lblLName.setText(selectedPerson.getlName());
            lblBirthdate.setText(selectedPerson.getBirthDate().format(formatter));
            lblAdress.setText(selectedPerson.getAddress());
            lblPhoneNo.setText(Integer.toString(selectedPerson.getPhoneNo()));
            lblSchool.setText("");
            lblSchoolGrade.setText("");
            lblUsername.setText(selectedPerson.getUsername());
            lblPassword.setText(selectedPerson.getPassword());
        }
    }
}
