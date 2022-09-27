import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class RadioButtonsAndCheckBoxes extends Application {
	private BorderPane main;
	private Pane pane;
	
	@Override // Override the start method in the Application class
    public void start(Stage primaryStage) {

		// Part 1 - Complete TODO's 1-4
		
		// TODO #1 instantiate the BorderPane and Pane (ie, create the objects)
		// set pane in the Center section of main;
		
		// TODO #2 - create the scene with the BorderPane main as the parent and a size of 1000x800

		
		// TODO #3	
		// Create three RadioButtons - label them red, green and blue
		// Create a VBox and place the 3 RadioButtons in the VBox, and add the VBox to the Left section of main.
		
		// TODO #4 
		// Create a Text shape - with whatever text you want, and place it in pane (not main!) at (100,200)...
		// Set the text font to Tahoma - Bold - 24 points...
		// Write setOnAction for the RadioButtons to update the text fill color IF the button is selected...
		
		// Part2 - implement 1-hot selection... per instructions... 
		// TODO #5 
		// Create a ToggleGroup, add radio Buttons to group. Notice the difference in behavior
		
		
		// Part3 - implement Check boxes...
		// TODO #6 
		// Create a circle, rectangle and ellipse. Customize and specify x,y location.
		// Add the shapes to the pane and run...
		
		// TODO #7 - create a VBox to hold a checkbox for each shape and place it in the right section of main...
		
		// TODO #8 - create a checkbox for each shape above and setSelected(true) to match the current state...
		//           add the checkbox to the VBox....          

		// TODO #9 - write the handler to control the visibility (setVisible()) of each shape          
		//           based upon the Selected state of the corresponding checkbox...

		
		primaryStage.setTitle("JavaFX RadioButtons and Checkboxes"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
  
  public static void main(String[] args) { 
    launch(args);
  }
}

