package singleton;

public class ConfigManager {

    private static ConfigManager instance;

    private String tema;

    private ConfigManager(){
        this.tema = "claro";
    }

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
