package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PrimeiroFX extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		Button botaoA = new Button("A");
		Button botaoB = new Button("B");
		Button botaoC = new Button("C");
		
		botaoA.setOnAction(e -> System.out.println("A"));
		botaoB.setOnAction(e -> System.out.println("B"));
		botaoC.setOnAction(e -> System.exit(0));

		// Primeiro exemplo: Organiza os Elementos na Vertical
		VBox box = new VBox();
		box.setAlignment(Pos.CENTER);
		box.setSpacing(10);
		box.getChildren().add(botaoA);
		box.getChildren().add(botaoB);
		box.getChildren().add(botaoC);
		
		//Scene cena = new Scene(box, 100, 150);

		// Segundo exemplo: Organiza os Elementos na Horizontal
		HBox box2 = new HBox();
		box2.setAlignment(Pos.CENTER);
		box2.setSpacing(10);
		box2.getChildren().add(botaoA);
		box2.getChildren().add(botaoB);
		box2.getChildren().add(botaoC);
		
		Scene cena2 = new Scene(box2, 150, 100);
		
		primaryStage.setScene(cena2);
		
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
