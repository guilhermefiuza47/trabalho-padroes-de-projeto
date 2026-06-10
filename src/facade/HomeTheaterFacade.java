package facade;

public class HomeTheaterFacade {

    private Projetor projetor;
    private SistemaDeSom som;
    private ServicoDeStreaming streaming;

    public HomeTheaterFacade(){
        this.projetor = new Projetor();
        this.som = new SistemaDeSom();
        this.streaming = new ServicoDeStreaming();
    }

    public void comecarFilme(){
        System.out.println("Incializando Home Theater...");
        projetor.ligar();
        som.ligar();
        streaming.ligar();
    }
    public void terminarFilme(){
        System.out.println("Encerrando Home Theater...");
        streaming.desligar();
        som.desligar();
        projetor.desligar();
    }
}
