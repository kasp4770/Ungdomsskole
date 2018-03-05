import javafx.fxml.FXMLLoader;

public class AppNavigator {

    public static final String MAIN = "MainScreen.fxml";
    public static final String USER_DATA = "UserDataScreen.fxml";

    private static MainScreenController mainScreenController;

    public static void setMainScreenController(MainScreenController mainScreenController){
        AppNavigator.mainScreenController = mainScreenController;
    }

    public static void loadScreen(String fxml){
        try{
            mainScreenController.set
        }
    }

}
