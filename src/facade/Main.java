package facade;

public class Main {

    public static void main(String[] args){

        // Instancia o Facade
        HomeTheaterFacade homeTheater = new HomeTheaterFacade();

        // Interage apenas com os métodos do Facade
        homeTheater.comecarFilme();
        System.out.println("-------------------------");
        homeTheater.terminarFilme();
    }
}
