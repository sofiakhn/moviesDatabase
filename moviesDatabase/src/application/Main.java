package application;
import javafx.stage.*; 
import javafx.scene.layout.*; 
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

// this Main.java is the backbone of the JavaFX launching. 
// *************************DO NOT MODIFY **********************


public class Main extends Application {
	
	Stage window; 
	Scene homeScene, addScene; 
	
	@Override
	public void start(Stage primaryStage) {
		try {
			
			
			
			window = primaryStage; //don't delete this. window is easier to understand. 
			
			// THE HOME SCREEN //
			
			//Button one & label
				Label homelabel = new Label("Home - Movie Magic. Click to Add Movie."); 
				Button goToAddScreen = new Button("GO TO ADD SCREEN.");
				goToAddScreen.setOnAction(e -> window.setScene(addScene)); //the key to switching scnenes
				//Layout 1 - children laid out in vertical col 
				VBox homeLayout = new VBox(80); 
				homeLayout.getChildren().addAll(homelabel, goToAddScreen); 
				homeScene = new Scene(homeLayout, 800, 400);
			
			// THE ADD MOVIE SCREEN//
			
				//Button two 
				Label addLabel = new Label("Add Movie Page"); 
				Button goHomeButton = new Button("Go back home.");
				goHomeButton.setOnAction(e -> window.setScene(homeScene));//the key to switching scnenes
				//Layout 2
				StackPane addLayout = new StackPane();
				addLayout.getChildren().addAll(addLabel, goHomeButton); 
				addScene = new Scene(addLayout, 800, 400);

			
			
			//SET THE INITIAL SCENE OF APP. SHOW THE WINDOW. Don't alter!
			window.setScene(homeScene);
			window.setTitle("Movie Magic Database");
			window.show(); 
			////////

		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
		

	}
	
	
}
