package application.Browser;
	

/**
 * Version 0.2
 * @author htha9587
 * 6-5-16
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;



public class BrowserMain extends Application {
	/**
	 * Grabs FXML and CSS and uses them in conjunction to open up the scene.
	 */
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Browser.fxml"));
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("BrowserFX(Maximize Window)");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * Launches the program.
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
