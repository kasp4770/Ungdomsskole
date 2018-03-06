package Application;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

import java.time.LocalDate;

public class LoginController {

    @FXML
    private TextField txtUsername, txtPassword;
    @FXML
    private Button btnLogIn, btnNewUser;



    /*private static PersonDAO database = new PersonDAO();

    public void getAuthorization() {
        try {
            String username = txtUsername.getText();
            String password = txtPassword.getText();

            for (int i = 0; i < database.getAllPersons().size(); i++) {
                if (database.getPerson(i).getUsername() == username && database.getPerson(i).getPassword() == password) {
                    System.out.println("\n--LOGIN SUCCESSFUL!--");

                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("\n--Login failed--");
        }
    }
    public void attachCode(){
        btnLogIn.setOnAction(e -> btnCode(e));
        btnNewUser.setOnAction(e -> btnCode(e));
    }

    public void btnCode(ActionEvent e) {
        if(e.getSource() == btnLogIn){
            getAuthorization();
        }
        else if(e.getSource() == btnNewUser){

        }
    }*/
}
