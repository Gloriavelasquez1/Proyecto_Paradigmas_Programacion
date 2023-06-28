package Controllers;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextFormatter;
import javafx.util.converter.IntegerStringConverter;


public class GameController {
	
 
    private String topic;    
    private String[] palabras = new String[10];
    private int cantPalabrasCorrectas;
    private int cantErrores;
    private int cantAciertos;
    private int indPalabra = 0;
	
	@FXML
	 public void initialize() {							
	        
		limitarTexto();
	        
		iniciarJuego();	
	        
	    }
	
	
	
	private void limitarTexto() {
		 
		int maxLength = 1; // Número máximo de caracteres permitidos

	        TextFormatter<String> textFormatter = new TextFormatter<>(change -> {
	            String newText = change.getControlNewText();
	            if (newText.length() <= maxLength) {
	                return change;
	            }
	            return null;
	        });

	        txtLetra.setTextFormatter(textFormatter);
	}
	
	private void iniciarJuego() {
		

		try {
			
			///////////////////////////////////////////////////////////////////
			//Definir juegos de palabras
			topic = application.GlobalVariables.getInstance().getTopic();
			
			cantAciertos = 0;
			
			if (topic == "Paises") {
				palabras = application.GlobalVariables.getInstance().getRepoPalabrasPaises();
			}
			
			if (topic == "Deportes") {
				palabras = application.GlobalVariables.getInstance().getRepoPalabrasDeportes();
			}
			///////////////////////////////////////////////////////////////////
			
			
			/*Alert alert = new Alert(Alert.AlertType.ERROR);
	        alert.setHeaderText(null);
	        alert.setTitle("Acceso Denegado");
	        alert.setContentText(topic);
	        alert.showAndWait();*/
			
			///////////////////////////////////////////////////////////////////			
			//Definir campos a mostrar
			mostrarChars(palabras[indPalabra]);			
			///////////////////////////////////////////////////////////////////			
			
						
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Errors: " + e.getMessage());	
		}
			
	}
	
	
	
	private void mostrarChars(String palabra) {
		
		try {	
			
			///////////////////////////////////////////////////////////////////			
			//Definir campos a mostrar
			int cantidadChars = palabra.length();
			
			if (cantidadChars >= 1) {
				undr1.setVisible(true);
			}
			
			if (cantidadChars == 2) {
				undr1.setVisible(true);
				undr2.setVisible(true);
			}
			
			if (cantidadChars == 3) {
				undr1.setVisible(true);
				undr2.setVisible(true);
				undr3.setVisible(true);
			}
			
			if (cantidadChars == 4) {
				undr1.setVisible(true);
				undr2.setVisible(true);
				undr3.setVisible(true);
				undr4.setVisible(true);
			}
			
			if (cantidadChars == 5) {
				undr1.setVisible(true);
				undr2.setVisible(true);
				undr3.setVisible(true);
				undr4.setVisible(true);
				undr5.setVisible(true);
			}
			
			if (cantidadChars == 6) {
				undr1.setVisible(true);
				undr2.setVisible(true);
				undr3.setVisible(true);
				undr4.setVisible(true);
				undr5.setVisible(true);
				undr6.setVisible(true);
			}
			
			if (cantidadChars == 7) {
				undr1.setVisible(true);
				undr2.setVisible(true);
				undr3.setVisible(true);
				undr4.setVisible(true);
				undr5.setVisible(true);
				undr6.setVisible(true);
				undr7.setVisible(true);
			}
			
			if (cantidadChars == 8) {
				undr1.setVisible(true);
				undr2.setVisible(true);
				undr3.setVisible(true);
				undr4.setVisible(true);
				undr5.setVisible(true);
				undr6.setVisible(true);
				undr7.setVisible(true);
				undr8.setVisible(true);
			}
			
			if (cantidadChars == 9) {
				undr1.setVisible(true);
				undr2.setVisible(true);
				undr3.setVisible(true);
				undr4.setVisible(true);
				undr5.setVisible(true);
				undr6.setVisible(true);
				undr7.setVisible(true);
				undr8.setVisible(true);
				undr9.setVisible(true);
			}
			
			if (cantidadChars == 10) {
				undr1.setVisible(true);
				undr2.setVisible(true);
				undr3.setVisible(true);
				undr4.setVisible(true);
				undr5.setVisible(true);
				undr6.setVisible(true);
				undr7.setVisible(true);
				undr8.setVisible(true);
				undr9.setVisible(true);
				undr10.setVisible(true);
			}
			
			
			///////////////////////////////////////////////////////////////////
			
			 /*Alert alert = new Alert(Alert.AlertType.ERROR);
		        alert.setHeaderText(null);
		        alert.setTitle("Acceso Denegado");
		        alert.setContentText("Debe llenar todos los campos");
		        alert.showAndWait();*/
						
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Errors: " + e.getMessage());	
		}
		
	}
	
	
	
	
	@FXML
	public void btnEnviar(ActionEvent event) {				
		
		try {			
			
			String letra = txtLetra.getText();				
			validarCharacter(palabras[indPalabra],letra);			
						
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Errors: " + e.getMessage());	
		}
		
	}
	
	private void validarCharacter(String palabra, String letra) {
				
				
		try {	
			
			boolean letraError = true;			
			char[] arregloCaracteres = palabra.toCharArray();
			
			
			int indLetra = 0;
			for (int i = 0; i < arregloCaracteres.length ; i++) {				
							
				char letraPalabra = arregloCaracteres[i];
				char letraUsuario = letra.charAt(0);				
				
				if (letraPalabra == letraUsuario) {					
										
					cantAciertos++;
					letraError = false;
					indLetra = i + 1;
					
					if (indLetra == 1) {
						chr1.setText(Character.toString(letraUsuario));
					}
					
					if (indLetra == 2) {						
						chr2.setText(Character.toString(letraUsuario));
					}
					
					if (indLetra == 3) {						
						chr3.setText(Character.toString(letraUsuario));
					}
					
					if (indLetra == 4) {						
						chr4.setText(Character.toString(letraUsuario));
					}
					
					if (indLetra == 5) {						
						chr5.setText(Character.toString(letraUsuario));
					}
					
					if (indLetra == 6) {						
						chr6.setText(Character.toString(letraUsuario));
					}
					
					if (indLetra == 7) {						
						chr7.setText(Character.toString(letraUsuario));
					}
					
					if (indLetra == 8) {						
						chr8.setText(Character.toString(letraUsuario));
					}
					
					if (indLetra == 9) {						
						chr9.setText(Character.toString(letraUsuario));
					}
					
					if (indLetra == 10) {						
						chr10.setText(Character.toString(letraUsuario));
					}	
					
					
					if (cantAciertos == arregloCaracteres.length) {
						imgGanaste.setVisible(true);
					}
					
					
				}
			}	
			
				
			if(letraError) {
				
				int cantidadErrores = application.GlobalVariables.getInstance().getCantErrores();
				cantidadErrores++;
				application.GlobalVariables.getInstance().setCantErrores(cantidadErrores);
				
				if (cantidadErrores == 1) {
					imgCabeza.setVisible(true);
				}
				
				if (cantidadErrores == 2) {
					imgCuerpo.setVisible(true);
				}
				
				if (cantidadErrores == 3) {
					imgBrazoIzq.setVisible(true);
				}
				
				if (cantidadErrores == 4) {
					imgBrazoDer.setVisible(true);
				}
				
				if (cantidadErrores == 5) {
					imgPieIzq.setVisible(true);
				}
				
				if (cantidadErrores == 6) {
					imgPieDer.setVisible(true);
				}
				
				if (cantidadErrores == 7) {
					imgOjoIzq.setVisible(true);
				}
				
				if (cantidadErrores == 8) {
					imgOjoDer.setVisible(true);
				}
				
				if (cantidadErrores == 9) {
					imgBoca.setVisible(true);
					imgPerdiste.setVisible(true);
				}
				
			}			
			
			 
						
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Errors: " + e.getMessage());	
		}	
		
		
	}	
	
	
	
	
	@FXML
	public void btnSalir(ActionEvent event) {				
		
		try {				
		        Platform.exit();	
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Errors: " + e.getMessage());	
		}
		
	}	
	
	private void cargarPalabras() {
		
		
		
	}
			
	
	
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
	
	
		
}
