package fxml;

import org.controlsfx.control.Notifications;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;

public class LoginController {

	@FXML
	private TextField email;

	@FXML
	private TextField senha;

	public void entrar() {
		boolean emailValido = email.getText().equals("admin@gmail.com");
		boolean senhaValida = senha.getText().equals("12345");
		
		if(emailValido && senhaValida) {
			Notifications.create()
				.position(Pos.TOP_RIGHT)
				.title("Login FXML")
				.text("Login efetuado com sucesso!")
				.showInformation();
		} else {
			Notifications.create()
			.position(Pos.TOP_RIGHT)
			.title("Login FXML")
			.text("Usuário e/ou senha inválidos!")
			.showError();
		}

	}
}
