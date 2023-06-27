package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {			
			
			/*txtUser.setText("Ingresando");
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
						scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());*/
			
			//Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("/ParadigmasProgramacion/Login.fxml"));
			
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("/Views/Login.fxml"));
			AnchorPane root = loader.load();
			
			//AnchorPane root = (AnchorPane) FXMLLoader.load(Main.class.getResource("/ParadigmasProgramacion/Login.fxml"));
			
			Scene scene = new Scene(root,400,400);
			primaryStage.setTitle("Ahorcadito");
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("Errors: " + e.getMessage());						
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
