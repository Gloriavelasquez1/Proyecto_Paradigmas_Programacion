package Controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import application.Main;
import javafx.event.ActionEvent;

public class LoginController {
	@FXML
	private TextField txtUser;
	@FXML
	private TextField txtPass;
	

	// Event Listener on Button.onAction
	@FXML
	public void btnClick(ActionEvent event) {	

		try {
			
			String usuario = txtUser.getText();
            String pass = txtPass.getText();
			
			usuario = txtUser.getText();
			pass = txtPass.getText();
			
			if ((usuario == "") || (pass == "")) {
				Alert alert = new Alert(Alert.AlertType.ERROR);
		        alert.setHeaderText(null);
		        alert.setTitle("Acceso Denegado");
		        alert.setContentText("Debe llenar todos los campos");
		        alert.showAndWait();
			}
			else {
				
				 application.GlobalVariables.getInstance().setUsuario(usuario);
	             application.GlobalVariables.getInstance().setPass(pass);	               
				
				this.navigateToTopics();
			}
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Errors: " + e.getMessage());	
		}
		
		
		
		
		
	}
	
	
	
	@FXML
	private void navigateToTopics() {
	    try {
	    	
	    	 FXMLLoader loader = new FXMLLoader(getClass().getResource("/Views/Topics.fxml"));
	         Parent topics = loader.load();

	         // Obtén el controlador de la nueva vista
	         TopicsController topicsController = loader.getController();
	        
	        // Obtén la escena actual
	         Scene currentScene = txtUser.getScene();

	         // Crea una nueva escena con la vista cargada
	         Scene topicsScene = new Scene(topics);
	         
	         // Obtén el Stage (ventana) actual
	         Stage currentStage = (Stage) currentScene.getWindow();

	         // Establece la nueva escena en el Stage
	         currentStage.setScene(topicsScene);
	         currentStage.setTitle("Topics"); // Opcional: Cambia el título de la ventana

	         // Muestra la nueva escena
	         currentStage.show();
	        
	    } catch (Exception e) {
	    	e.printStackTrace();
			System.out.println("Errors: " + e.getMessage());		
	    }
	}

	
	
	
}
