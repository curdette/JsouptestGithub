package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Testclasse extends Application{public void start(Stage primaryStage) {
		
	Button b1=new Button("clique moi");
	StackPane root = new StackPane();
	root.getChildren().add(b1);
	Scene scene = new Scene(root, 300, 200);
	primaryStage.setTitle("Changement sur git");
	primaryStage.setScene(scene);
	primaryStage.show();
	
}
	public static void main(String[] args) {
		launch(args);
	}

}
