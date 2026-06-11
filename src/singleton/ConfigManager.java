package singleton;

public class ConfigManager {

    // Guarda a única instância do gerenciador
    private static ConfigManager instance;
    private String tema;

    //Construtor privado para bloquear a criação de novas instâncias
    private ConfigManager(){
        this.tema = "claro";
    }

    // Retorna sempre a mesma instância
    public static ConfigManager getInstance(){
        if(instance == null){
            instance = new ConfigManager();
        }
        return instance;
    }

    public String getTema(){
        return tema;
    }
    public void setTema(String tema){
        this.tema = tema;
    }
}
