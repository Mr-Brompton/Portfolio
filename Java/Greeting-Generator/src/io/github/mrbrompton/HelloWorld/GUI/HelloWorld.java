package io.github.mrbrompton.HelloWorld.GUI;
import io.github.mrbrompton.HelloWorld.app.GreetingGenerator;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
 
public class HelloWorld extends Application {
	//Set layout style - controls how items are displayed
	//VBox Stacks items vertically
		static VBox layout = new VBox(10);	
		Button button;
    public static void main(String[] args) {
    	//Set up application
      launch(args);
    }

	@Override
	public void start(Stage primaryStage) throws Exception {
		/*Builds the main elements*/
			//Stage (Window) Title
			primaryStage.setTitle("Hello World");
			//Label adds text to the window
			Label label = new Label("Welcome to my Greetings Generator.");
			//initialises button object with button text.
			button = new Button("Don't Press Me");
			//When the button is clicked, the code to run is inside this class
			button.setOnAction(e -> {
				//done this way to avoid accidentally removing button
				layout.getChildren().clear();
				layout.getChildren().add(button);
				ButtonPress.windowPrint(GreetingGenerator.getGreeting());
				});
			
		/*Set Layouts and add button to layout*/

			layout.getChildren().add(label);
			layout.getChildren().add(button);
			
		
		/*Puts it all together*/
			//Build scene, everything inside the stage. pass Layout as argument with pixel width and height.
			Scene scene = new Scene(layout, 600, 300);
			//inside the primary stage (main window), use the scene passed as an argument.
			primaryStage.setScene(scene);
			//display the primary stage
			primaryStage.show();
	}

	
}