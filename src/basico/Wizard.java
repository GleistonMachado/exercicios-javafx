package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Wizard extends Application {

	private Stage janela;
	private Scene cena1;
	private Scene cena2;
	private Scene cena3;

	@Override
	public void start(Stage primaryStage) throws Exception {
		janela = primaryStage;
		criarCena1();
		criarCena2();
		criarCena3();

		janela.setTitle("Wizard");
		janela.show();
	}

	public void criarCena1() {
		Label labelTitulo = new Label("Primeira Cena");
		Button proximoPasso = new Button("Ir para proximo");

		proximoPasso.setOnAction(e -> {
			janela.setScene(cena2);
		});

		HBox box = new HBox();
		box.setAlignment(Pos.CENTER);
		box.getChildren().add(labelTitulo);
		box.getChildren().add(proximoPasso);

		VBox box_container = new VBox();
		box_container.setAlignment(Pos.CENTER);
		box_container.setSpacing(30);
		box_container.getChildren().add(labelTitulo);
		box_container.getChildren().add(box);

		cena1 = new Scene(box_container, 300, 300);
		janela.setScene(cena1);
	}

	public void criarCena2() {
		Label labelTitulo = new Label("Segunda Cena");
		Button proximoPasso = new Button("Ir para proximo");
		proximoPasso.setOnAction(e -> {
			janela.setScene(cena3);
		});

		Button voltar = new Button("Voltar");
		voltar.setOnAction(e -> {
			janela.setScene(cena1);
		});

		HBox box = new HBox();
		box.setAlignment(Pos.CENTER);
		box.setSpacing(10);
		box.getChildren().add(voltar);
		box.getChildren().add(proximoPasso);

		VBox box_container = new VBox();
		box_container.setAlignment(Pos.CENTER);
		box_container.setSpacing(30);
		box_container.getChildren().add(labelTitulo);
		box_container.getChildren().add(box);

		cena2 = new Scene(box_container, 300, 300);

	}

	public void criarCena3() {
		Label labelTitulo = new Label("Terceira Cena");

		Button voltar = new Button("Voltar");
		voltar.setOnAction(e -> janela.setScene(cena2));

		Button sair = new Button("Sair");
		sair.setOnAction(e -> System.exit(0));

		HBox box = new HBox();
		box.setAlignment(Pos.CENTER);
		box.setSpacing(10);
		box.getChildren().add(voltar);
		box.getChildren().add(sair);

		VBox box_container = new VBox();
		box_container.setAlignment(Pos.CENTER);
		box_container.setSpacing(30);
		box_container.getChildren().add(labelTitulo);
		box_container.getChildren().add(box);

		cena3 = new Scene(box_container, 300, 300);

	}

	public static void main(String[] args) {
		launch(args);
	}
}
