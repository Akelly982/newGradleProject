package newGradleProject;

//public class Main {
//
//}

// ----------------------------------

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			BorderPane bp = new BorderPane();
			
			Button myBtn = new Button("Do somthing");
			bp.setCenter(myBtn);
			
			myBtn.setOnAction( event -> {
				System.out.println("Hello I am the btn... 00oo00ooo Its a Ghost btn ");
			});
			
			
			Scene scene = new Scene(bp,400,400);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Testing javaFx with Gradle");
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}