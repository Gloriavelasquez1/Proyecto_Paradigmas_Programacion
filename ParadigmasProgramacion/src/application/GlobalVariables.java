package application;

public class GlobalVariables {
private static GlobalVariables instance;
    
    // Variables globales
    private String usuario;
    private String pass;
    
    private GlobalVariables() {
        // Constructor privado para evitar la creación directa de instancias
    }
    
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

}
