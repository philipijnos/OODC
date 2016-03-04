package week4.les8.opdracht1;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
public class Main extends Application
implements EventHandler<ActionEvent> {
	@Override
	public void start(Stage primaryStage) {
		Button btn = new Button("Say 'Hello World'");
		btn.setOnAction(this);
		Button btn2 = new Button("Zeg nu wat anders");
		btn.setOnAction(e -> {
			btn.setVisible(false);
			btn2.setVisible(true);
		});
		btn2.setOnAction(e -> {
			btn2.setVisible(false);
			btn.setVisible(true);
		});
		StackPane root = new StackPane();
		root.getChildren().addAll(btn, btn2);
		Scene scene = new Scene(root, 300, 250);
		primaryStage.setTitle("Hello World!");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public void handle(ActionEvent event) {
		System.out.println("Hello World!");
	}
	public static void main(String[] args) {
		Application.launch(args);
	}
}