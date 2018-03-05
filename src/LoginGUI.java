import javafx.application.Application;
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

public class LoginGUI extends Application implements EventHandler<ActionEvent>{

    private TextField userNameField, passwordField;
    private Label userNameLbl, passwordLbl;
    private Button login, newUser, cancel;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        //create textfields, labels and buttons
        userNameField = new TextField();
        passwordField = new TextField();
        userNameLbl = new Label("Brugernavn");
        passwordLbl = new Label("Adgangskode");
        login = new Button("Login");
        newUser = new Button("Ny bruger");
        cancel = new Button("Afslut");

        //Create window/Stage
        GridPane root = new GridPane();
        //Stage appear TOP_LEFT
        root.setAlignment(Pos.TOP_LEFT);
        //space between controls in the grid
        root.setHgap(10);
        root.setVgap(10);
        //space from stage to controls
        root.setPadding(new Insets(20,20,0,20));
        //Grid
        root.add(userNameField, 1,0);
        root.add(passwordField, 1, 1);
        root.add(userNameLbl, 0, 0);
        root.add(passwordLbl, 0, 1);
        root.add(login, 2, 0);
        root.add(newUser, 2, 1);

        setWidths();
        attachCode();

        primaryStage.setTitle("Login");
        Scene scene = new Scene(root, 370, 150);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

        //Widths for controls
    public void setWidths(){
        userNameField.setPrefWidth(150);
        passwordField.setPrefWidth(150);
        userNameLbl.setPrefWidth(80);
        passwordLbl.setPrefWidth(80);
        login.setPrefWidth(70);
    }

    public void attachCode(){


    }

    @Override
    public void handle(ActionEvent event) {
        if(event.getSource()==login){
            PersonDAO persons = new PersonDAO();

            try{
                String username = userNameField.getText();
                String password = passwordField.getText();

                for(int i = 0; i < persons.getAllPersons().size(); i++){
                    if(persons.getPerson(i).getUsername() == username && persons.getPerson(i).getPassword() == password){
                        System.out.println("LOGIN SUCCESSFUL!");
                    }
                }

            }catch(){}
        }
    }

}
