package layout;

import javafx.application.Platform;
import javafx.scene.layout.StackPane;

public class TesteStackPane extends StackPane {

	public TesteStackPane() {

		Caixa c1 = new Caixa().texto("Caixa 1");
		Caixa c2 = new Caixa().texto("Caixa 2");
		Caixa c3 = new Caixa().texto("Caixa 3");
		Caixa c4 = new Caixa().texto("Caixa 4");
		Caixa c5 = new Caixa().texto("Caixa 5");
		Caixa c6 = new Caixa().texto("Caixa 6");

		getChildren().addAll(c2, c3, c4, c5, c6, c1);
		
		setOnMouseClicked(e -> {
			// Verifica se o click foi do lado esquerdo ou direito da tela
			if(e.getSceneX() > getScene().getWidth() / 2 ) {
				getChildren().get(0).toFront(); // Se o click for do lado direito, exibira a proxima tela.
			} else {
				getChildren().get(5).toBack(); // Se o click for do lado esquerdo, exibira a tela anterior.
			}
		});
		
		// Modifica a exibição da tela automaticamente
		Thread thread = new Thread(() -> {
			while (true) {
				try {
					Thread.sleep(3000);
					Platform.runLater(() -> getChildren().get(0).toFront());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		thread.setDaemon(true);  //  Mata a thread quando a aplicação for fechada.
		thread.start();         // Inicia a thread
	}

}
