package facade;

public class HomeTheaterFacade {

    private Projetor projetor;
    private SistemaDeSom som;
    private ServicoDeStreaming streaming;

    public HomeTheaterFacade(){
        // Cria a instância dos três equipamentos internamente
        this.projetor = new Projetor();
        this.som = new SistemaDeSom();
        this.streaming = new ServicoDeStreaming();
    }

    public void comecarFilme(){
        // Liga os equipamentos na ordem correta
        System.out.println("Incializando Home Theater...");
        projetor.ligar();
        som.ligar();
        streaming.ligar();
    }
    public void terminarFilme(){
        // Desliga os equipamentos na ordem inversa
        System.out.println("Encerrando Home Theater...");
        streaming.desligar();
        som.desligar();
        projetor.desligar();
    }
}
