package singleton;

public class Main {

    public static void main(String[] args) {

        ConfigManager config1 = ConfigManager.getInstance();
        System.out.println(("Tema da primeira config: " + config1.getTema()));

        config1.setTema("escuro");

        ConfigManager config2 = ConfigManager.getInstance();
        System.out.println("Tema da segunda config: " + config2.getTema());

        //Verificar se são o mesmo objeto na memória
        System.out.println("São o mesmo objeto?: " + (config1 == config2));
    }
}
