package layout;

import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;

public class TesteGridPane extends GridPane {
	
	public TesteGridPane() {
		
		Caixa c1 = new Caixa().texto("1");
		Caixa c2 = new Caixa().texto("2");
		Caixa c3 = new Caixa().texto("3");
		Caixa c4 = new Caixa().texto("4");
		Caixa c5 = new Caixa().texto("5");
		Caixa c6 = new Caixa().texto("6");
		
		setGridLinesVisible(true);
		setVgap(5);
		setHgap(5);
		
		getColumnConstraints().addAll(columConstrains(), columConstrains(), columConstrains(), columConstrains(), columConstrains());
		getRowConstraints().addAll(rowConstrains(), rowConstrains(), rowConstrains(), rowConstrains(), rowConstrains());
		
		add(c1, 0, 0, 2, 2);
		add(c2, 1, 1, 2, 2);
		add(c3, 2, 2, 2, 2);
		add(c4, 4, 0);
		add(c5, 0, 4);
		add(c6, 3, 3, 2, 2);
	}
	
	private ColumnConstraints columConstrains() {
		ColumnConstraints coluna = new ColumnConstraints();
		coluna.setPercentWidth(20);  // Percentual da largura de cada coluna
		coluna.setFillWidth(true);  // Preenche a largura
		 
		return coluna;
	}
	
	private RowConstraints rowConstrains() {
		RowConstraints linha = new RowConstraints();
		linha.setPercentHeight(20);  // Percentual da altura de cada linha
		linha.setFillHeight(true);  // Preenche a Altura
		
		return linha;
	}

}
