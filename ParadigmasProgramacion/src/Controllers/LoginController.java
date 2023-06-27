package Controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
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
		
		Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText(null);
        alert.setTitle("Acceso Denegado");
        alert.setContentText("Por se una guguito sopenca");
        alert.showAndWait();
		
		
	}
	
	
	
	@FXML
	private void navigateToDashboard(ActionEvent event) {
	    try {
	    	
	    	/*FXMLLoader loader = new FXMLLoader(Main.class.getResource("/Views/Topics.fxml"));
			AnchorPane root = loader.load();
			
			//AnchorPane root = (AnchorPane) FXMLLoader.load(Main.class.getResource("/ParadigmasProgramacion/Login.fxml"));
			
			Scene scene = new Scene(root,400,400);
			primaryStage.setTitle("Ahorcadito");
			primaryStage.setScene(scene);
			primaryStage.show();*/
	    	
	    	
	    	
	        FXMLLoader loader = new FXMLLoader(getClass().getResource("Topics.fxml"));
	        Parent topics = loader.load();

	        // Obtén el controlador de la nueva vista
	        TopicsController topicsController = loader.getController();

	        // Configura cualquier dato necesario en el controlador de la nueva vista
	        // dashboardController.setSomeData(someData);

	        // Obtén la escena actual
	        //Scene currentScene = ((Node) event.getSource()).getScene();

	        // Reemplaza la escena actual con la nueva vista
	        //currentScene.setRoot(dashboard);
	        
	    } catch (Exception e) {
	    	e.printStackTrace();
			System.out.println("Errors: " + e.getMessage());		
	    }
	}

	
	
	
}
