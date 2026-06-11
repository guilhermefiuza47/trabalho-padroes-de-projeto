package strategy;

public class Pedido {

    private String produto;
    private double valor;
    // O pedido mantém uma referência para a estratégia atual
    private FormaDePagamento formaDePagamento;

    public Pedido(String produto, double valor){
        this.produto = produto;
        this.valor = valor;
    }

    // Define qual forma de pagamento será usada
    public void setFormaDePagamento(FormaDePagamento formaDePagamento){
        this.formaDePagamento = formaDePagamento;
    }

    // Delega o pagamento para a forma escolhida
    public void pagar(){
        System.out.println("Pedido: " + produto + " = R$" + valor);
        formaDePagamento.realizarPagamento(valor);
    }
}
