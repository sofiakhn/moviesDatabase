package application;

import java.net.URL;
import java.util.HashMap;
import java.util.ResourceBundle;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

public class ScreenController implements Initializable{

    @FXML
    private Button movieadd,addmoviebutton;

    @FXML
    private void handleButtonAction (ActionEvent event) throws Exception {
        Stage stage;
        Parent root;
       
        if(event.getSource()==movieadd){
            stage = (Stage) btn1.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("addMovie.fxml"));
        }
        else{
            stage = (Stage) btn2.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("home.fxml"));
        }
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    // private AnchorPane window;

    // public ScreenController()
    // {
    //     super();
    // }
    // public ScreenController(AnchorPane window)
    // {
    //     setWindow(window);
    // }

    // public void setWindow(AnchorPane window)
    // {
    //     this.window = window;
    // }

    // public void setScreen(String screen)
    // {
    //     try
    //     {
    //         Parent root = FXMLLoader.load(getClass().getResource(screen + ".fxml"));
    //         window.getChildren().setAll(root);
    //     }
    //     catch (Exception e)
    //     {
    //         e.printStackTrace();
    //     }
    // }

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
    }
    
}