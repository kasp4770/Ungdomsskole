package Application;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.layout.BorderPane;

public class MainScreenController {

    @FXML private BorderPane screenHolder;

    public void setScreen(Node node){
        screenHolder.setCenter(node);
    }
}
