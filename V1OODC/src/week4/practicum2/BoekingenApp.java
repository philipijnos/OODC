package week4.practicum2;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
public class BoekingenApp extends Application implements EventHandler<ActionEvent> {
	@Override
	public void start(Stage primaryStage) {
		
		Label headerLabel = new Label("Voer uw gegevens in:");
		headerLabel.setPrefWidth(350);
		Label naamLabel = new Label("Naam:");
		naamLabel.setPrefWidth(115);
		Label adresLabel = new Label("Adres:");
		adresLabel.setPrefWidth(115);
		Label aankomstLabel = new Label("Aankomstdatum:");
		aankomstLabel.setPrefWidth(115);
		Label vertrekLabel = new Label("Vertrekdatum:");
		vertrekLabel.setPrefWidth(115);
		Label kamerLabel = new Label("Kamertype:");
		kamerLabel.setPrefWidth(115);
		TextField naamField = new TextField();
		naamField.setPrefWidth(215);
		TextField adresField = new TextField();
		adresField.setPrefWidth(215);
		DatePicker aankomstPicker = new DatePicker();
		aankomstPicker.setPrefWidth(215);
		DatePicker vertrekPicker = new DatePicker();
		vertrekPicker.setPrefWidth(215);
		//ComboBox<KamerType> kamerBox = new ComboBox<KamerType>();
		//kamerbox.setPrefWidth(215);
		Button resetButton = new Button("Reset");
		Button boekButton = new Button("Boek");
		
		HBox buttonBox = new HBox(10);
		buttonBox.setPrefWidth(350);
		buttonBox.setAlignment(Pos.CENTER_RIGHT);
		buttonBox.getChildren().addAll(resetButton, boekButton);
		
		FlowPane root = new FlowPane();
		root.setPadding(new Insets(10, 10, 10, 10));
		root.setHgap(10);
		root.setVgap(10);
		root.getChildren().addAll(headerLabel, naamLabel, naamField, adresLabel,
				adresField, aankomstLabel, aankomstPicker, vertrekLabel, vertrekPicker,
				kamerLabel, /*kamerbox,*/buttonBox);
		Scene scene = new Scene(root, 350, 225);
		primaryStage.setTitle("Tweepersoonsboekingen");
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();
	}
	public void handle(ActionEvent event) {
		System.out.println("Hello World!");
	}
	public static void main(String[] args) {
		Application.launch(args);
	}
}