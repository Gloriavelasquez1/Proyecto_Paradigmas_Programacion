package Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.control.Label;
import javafx.scene.control.TextFormatter;
import javafx.util.converter.IntegerStringConverter;


public class GameController {
	
	@FXML
	private TextField txtLetra;
	
	@FXML
	private Label lblPorFavor;
	
	@FXML
	private Label lblPalabrasCorrectas;
	
	@FXML
    private ImageView imgPlataforma;
	
	@FXML
    private ImageView imgCabeza;
	
	@FXML
    private ImageView imgCuerpo;
	
	@FXML
    private ImageView imgBrazoIzq;
	
	@FXML
    private ImageView imgBrazoDer;
	
	@FXML
    private ImageView imgPieIzq;
	
	@FXML
    private ImageView imgPieDer;
	
	@FXML
    private ImageView imgOjoIzq;
	
	@FXML
    private ImageView imgOjoDer;
	
	@FXML
    private ImageView imgBoca;
	
	@FXML
    private ImageView imgGanaste;
	
	@FXML
    private ImageView imgPerdiste;
	
	@FXML
    private ImageView undr1;
	
	@FXML
    private ImageView undr2;
	
	@FXML
    private ImageView undr3;
	
	@FXML
    private ImageView undr4;
	
	@FXML
    private ImageView undr5;
	
	@FXML
    private ImageView undr6;
	
	@FXML
    private ImageView undr7;
	
	@FXML
    private ImageView undr8;
	
	@FXML
    private ImageView undr9;
	
	@FXML
    private ImageView undr10;	
	
	
	@FXML
	private Label chr1;
	
	@FXML
	private Label chr2;
	
	@FXML
	private Label chr3;
	
	@FXML
	private Label chr4;
	
	@FXML
	private Label chr5;
	
	@FXML
	private Label chr6;
	
	@FXML
	private Label chr7;
	
	@FXML
	private Label chr8;
	
	@FXML
	private Label chr9;
	
	@FXML
	private Label chr10;
	
	
	@FXML
	public void btnEnviar(ActionEvent event) {				
		
		try {				
			String topics = "Paises";
			application.GlobalVariables.getInstance().setUsuario(topics);				
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Errors: " + e.getMessage());	
		}
		
	}
	
	
	@FXML
	public void btnSalir(ActionEvent event) {				
		
		try {				
			String topics = "Paises";
			application.GlobalVariables.getInstance().setUsuario(topics);				
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Errors: " + e.getMessage());	
		}
		
	}
	
	
	 public void initialize() {
	        int maxLength = 1; // Número máximo de caracteres permitidos

	        TextFormatter<Integer> textFormatter = new TextFormatter<>(new IntegerStringConverter(), 0,
	                change -> {
	                    String newText = change.getControlNewText();
	                    if (newText.length() <= maxLength) {
	                        return change;
	                    }
	                    return null;
	                });

	        txtLetra.setTextFormatter(textFormatter);
	    }
	
	

}
