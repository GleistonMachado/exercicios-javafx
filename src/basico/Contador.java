package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Contador extends Application {

	private int contador = 0;
	
	private void atualizarLabelNumero(Label label) {
		label.setText(Integer.toString(contador));
		label.getStyleClass().remove("verde");
		label.getStyleClass().remove("vermelho");
		
		if(contador < 0) {
			label.getStyleClass().add("vermelho");
		} else if(contador > 0){ 
			label.getStyleClass().add("verde");
		}
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		Label labelTitulo = new Label("Contador");
		labelTitulo.getStyleClass().add("label");

		Label labelNumero = new Label("0");
		labelNumero.getStyleClass().add("label");

		Button botaoDecremento = new Button("-");
		botaoDecremento.getStyleClass().add("botoes");

		Button botaoIncremento = new Button("+");
		botaoIncremento.getStyleClass().add("botoes");

		botaoDecremento.setOnAction(event -> {
			contador--;
			atualizarLabelNumero(labelNumero);
		});

		botaoIncremento.setOnAction(event -> {
			contador++;
			atualizarLabelNumero(labelNumero);
		});

		HBox boxBotoes = new HBox();
		boxBotoes.setSpacing(10);
		boxBotoes.setAlignment(Pos.CENTER);
		boxBotoes.getChildren().add(botaoDecremento);
		boxBotoes.getChildren().add(botaoIncremento);

		VBox container = new VBox();
		container.getStyleClass().add("conteudo");
		container.setAlignment(Pos.CENTER);
		container.setSpacing(10);
		container.getChildren().add(labelTitulo);
		container.getChildren().add(labelNumero);
		container.getChildren().add(boxBotoes);

		String pathCss = getClass().getResource("/basico/Contador.css").toExternalForm();

		Scene cenaPrincipal = new Scene(container, 300, 200);

		// Importando o CSS
		cenaPrincipal.getStylesheets().add(pathCss);

		// Importando a Fonte
		cenaPrincipal.getStylesheets().add("https://fonts.googleapis.com/css2?family=Oswald");

		primaryStage.setScene(cenaPrincipal);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
