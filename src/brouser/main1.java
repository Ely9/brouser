package brouser;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
 
public class main1 extends Application{
 
	@Override
	public void start(Stage primaryStage) {
		try {
 
			WebView root = new WebView();
			WebEngine engine = root.getEngine();
			Scene scene = new Scene(root,800,600);
			primaryStage.setScene(scene);
			primaryStage.show();
 
			engine.load("https://www.google.co.jp/");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
 
	public static void main(String[] args) {
		launch(args);
	}
}