package layout;

import javafx.scene.layout.BorderPane;

public class TesteBorderPane extends BorderPane {

	public TesteBorderPane() {
		Caixa c1 = new Caixa().texto("Topo");
		setTop(c1);

		Caixa c2 = new Caixa().texto("Esquerda");
		setLeft(c2);

		Caixa c3 = new Caixa().texto("Direita");
		setRight(c3);

		Caixa c4 = new Caixa().texto("Footer");
		setBottom(c4);
		
		Caixa c5 = new Caixa().texto("Area Central");
		setCenter(c5);

	}
}
