package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class home extends Application {

    Button button = new Button();
    @FXML
    private AnchorPane ap;

    // one method which checks the id of all buttons
    @Override
    public void start(Stage primaryStage) throws IOException {
        
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
        Scene scene = new Scene(root);
        // button.setOnAction(event -> checkID(event, button));
        primaryStage.setTitle("Movies Database");
        primaryStage.setScene(scene);
        primaryStage.show();

        Button button = new Button();
        button.setId(value);
        
        if (button.getId().equals("movieadd")) {
            button.setOnAction(e -> {
                try {
                    // root = FXMLLoader.load(getClass().getResource("addMovie.fxml"));
                    Scene search =FXMLLoader.load(getClass().getResource("addMovie.fxml"));
                    primaryStage.setScene(search);
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }

            });
        }
        else{

        }

    }
    
    
	public static void main(String[] args) {
		launch(args);
	}

}
