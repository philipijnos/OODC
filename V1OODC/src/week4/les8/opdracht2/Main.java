package week4.les8.opdracht2;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.stage.Stage;
public class Main extends Application
implements EventHandler<ActionEvent> {
	@Override
	public void start(Stage primaryStage) {
		Button btn = new Button("Say 'Hello World'");
		btn.setOnAction(this);
		Button btn2 = new Button("Zeg nu wat anders");
		Label l1 = new Label("Wow een label");
		btn.setOnAction(e -> {
			btn.setVisible(false);
			btn2.setVisible(true);
			l1.setText("Knop 1");
		});
		btn2.setOnAction(e -> {
			btn2.setVisible(false);
			btn.setVisible(true);
			l1.setText("Knop 2");
		});
		VBox root = new VBox();
		root.setPrefWidth(50);
		root.getChildren().addAll(btn, btn2, l1);
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