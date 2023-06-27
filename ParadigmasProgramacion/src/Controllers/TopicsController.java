package Controllers;

import java.awt.Button;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;

public class TopicsController {
		 
		@FXML
		public void btnPaises(ActionEvent event) {	

			try {								
				Alert alert = new Alert(Alert.AlertType.ERROR);
		        alert.setHeaderText(null);
		        alert.setTitle("Acceso Denegado");
		        alert.setContentText("Hola" + application.GlobalVariables.getInstance().getUsuario());
		        alert.showAndWait();
			}
			catch(Exception e) {
				e.printStackTrace();
				System.out.println("Errors: " + e.getMessage());	
			}
			
		}
		
		
		@FXML
		public void btnDeportes(ActionEvent event) {	

			try {								
				
			}
			catch(Exception e) {
				e.printStackTrace();
				System.out.println("Errors: " + e.getMessage());	
			}
			
		}
		

}
