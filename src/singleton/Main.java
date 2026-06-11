package singleton;

public class Main {

    public static void main(String[] args) {

        // Pega a configuração inicial
        ConfigManager config1 = ConfigManager.getInstance();
        System.out.println(("Tema da primeira config: " + config1.getTema()));

        // Altera o tema
        config1.setTema("escuro");

        // Pega a configuração novamente usando outra variável
        ConfigManager config2 = ConfigManager.getInstance();
        System.out.println("Tema da segunda config: " + config2.getTema());

        // Confirma que as duas variáveis são o mesmo objeto
        System.out.println("São o mesmo objeto?: " + (config1 == config2));
    }
}
