package application;

public class GlobalVariables {
private static GlobalVariables instance;
    
    // Variables globales
    private String usuario;
    private String pass;
    
    private String topic;
    
    private  String[] repoPalabrasPaises  = new String[10];
    private String[] repoPalabrasDeportes = new String[10];
    private int cantPalabrasCorrectas;
    private int cantErrores;    
  
    
    
    private GlobalVariables() {
        // Constructor privado para evitar la creación directa de instancias
    }
    
    
    
    //Singleton
    public static GlobalVariables getInstance() {
        if (instance == null) {
            instance = new GlobalVariables();
        }
        return instance;
    }
    
    
    
    // Métodos para acceder y modificar las variables globales
    public String getUsuario() {
        return usuario;
    }
    
    public void setUsuario(String value) {
    	usuario = value;
    }
    
    
    
    public String getPass() {
        return pass;
    }
    
    public void setPass(String value) {
    	pass = value;
    }
    
    
    
    public String getTopic() {
        return topic;
    }
    
    public void setTopic(String value) {
    	topic = value;
    }
    
    
    
    
    public int getCantPalabrasCorrectas() {
        return cantPalabrasCorrectas;
    }
    
    public void setCantPalabrasCorrectas(int value) {
    	cantPalabrasCorrectas = value;
    }
    
    
    
    
    
    public int getCantErrores() {
        return cantErrores;
    }
    
    public void setCantErrores(int value) {
    	cantErrores = value;
    }
    
    
    
    public String[] getRepoPalabrasPaises() {
    	String[] words = new String[10];        
      
        words[0] = "Colombia";
        words[1] = "Belgica";
        words[2] = "Francia";
        words[3] = "Italia";
        words[4] = "Alemania";
        words[5] = "Mexico";
        words[6] = "EEUU";
        words[7] = "Yakuks";
        words[8] = "Nauru";
        words[9] = "Japon";
        
        return words;
    }
    
    
    public String[] getRepoPalabrasDeportes() {
    	String[] words = new String[10];        
      
        words[0] = "Futbol";
        words[1] = "Boxeo";
        words[2] = "Atletismo";
        words[3] = "Baseball";
        words[4] = "Tejo";
        words[5] = "Padel";
        words[6] = "Zorbing";
        words[7] = "Kabaddi";
        words[8] = "Natacion";
        words[9] = "Judo";
        
        return words;
    }
    

}
