package application;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

import javafx.event.ActionEvent;

public class LoginController {
	@FXML
	private TextField txtUser;
	@FXML
	private TextField txtPass;

	// Event Listener on Button.onAction
	@FXML
	public void btnClick(ActionEvent event) {		
		
		Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText(null);
        alert.setTitle("Acceso Denegado");
        alert.setContentText("Por se una guguito sopenca");
        alert.showAndWait();
		
		
	}
}
