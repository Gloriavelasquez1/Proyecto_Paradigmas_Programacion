package Controllers;

import java.awt.Button;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import javafx.scene.control.Label;

public class TopicsController {
	
	@FXML
	private Label lblInicio;
		 
	
		@FXML
		public void btnPaises(ActionEvent event) {				
			
			try {				
				String topics = "Paises";
				application.GlobalVariables.getInstance().setTopic(topics);		
				navigator();
			}
			catch(Exception e) {
				e.printStackTrace();
				System.out.println("Errors: " + e.getMessage());	
			}
			
		}
		
		
		@FXML
		public void btnDeportes(ActionEvent event) {	

			try {								
				String topics = "Deportes";
				application.GlobalVariables.getInstance().setTopic(topics);	
				navigator();
			}
			catch(Exception e) {
				e.printStackTrace();
				System.out.println("Errors: " + e.getMessage());	
			}
			
		}
		
		
		
		
		
		
		@FXML
		private void navigator() {
		    try {
		    	
		    	 FXMLLoader loader = new FXMLLoader(getClass().getResource("/Views/Game.fxml"));
		         Parent topics = loader.load();

		         // Obtén el controlador de la nueva vista
		         GameController gameController = loader.getController();
		                 
		        // Obtén la escena actual
		         Scene currentScene = lblInicio.getScene();

		         // Crea una nueva escena con la vista cargada
		         Scene topicsScene = new Scene(topics);
		          
		         // Obtén el Stage (ventana) actual
		         Stage currentStage = (Stage) currentScene.getWindow();

		         // Establece la nueva escena en el Stage
		         currentStage.setScene(topicsScene);
		         currentStage.setTitle("Games"); // Opcional: Cambia el título de la ventana

		         // Muestra la nueva escena
		         currentStage.show();
		        
		    } catch (Exception e) {
		    	e.printStackTrace();
				System.out.println("Errors: " + e.getMessage());		
		    }
		}
		

}
