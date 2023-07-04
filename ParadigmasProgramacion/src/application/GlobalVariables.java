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
      
        words[0] = "colombia";
        words[1] = "belgica";
        words[2] = "francia";
        words[3] = "italia";
        words[4] = "alemania";
        words[5] = "mexico";
        words[6] = "brazil";
        words[7] = "yakuks";
        words[8] = "nauru";
        words[9] = "japon";
        
        return words;
    }
    
    
    public String[] getRepoPalabrasDeportes() {
    	String[] words = new String[10];        
      
        words[0] = "futbol";
        words[1] = "boxeo";
        words[2] = "atletismo";
        words[3] = "baseball";
        words[4] = "tejo";
        words[5] = "padel";
        words[6] = "zorbing";
        words[7] = "kabaddi";
        words[8] = "natacion";
        words[9] = "judo";
        
        return words;
    }
    

}
