package strategy;

public class Pedido {

    private String produto;
    private double valor;
    private FormaDePagamento formaDePagamento;

    public Pedido(String produto, double valor){
        this.produto = produto;
        this.valor = valor;
    }

    public void setFormaDePagamento(FormaDePagamento formaDePagamento){
        this.formaDePagamento = formaDePagamento;
    }

    public void pagar(){
        System.out.println("Pedido: " + produto + " = R$" + valor);
        formaDePagamento.realizarPagamento(valor);
    }
}
