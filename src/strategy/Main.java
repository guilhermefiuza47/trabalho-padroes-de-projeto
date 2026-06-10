package strategy;

public class Main {
    public static void main(String[] args) {

        Pedido pedido = new Pedido("Pizza", 50);

        pedido.setFormaDePagamento(new PagamentoPix());
        pedido.pagar();
        System.out.println("--------------------");
        pedido.setFormaDePagamento(new PagamentoCartaoCredito(2));
        pedido.pagar();
        System.out.println("--------------------");
        pedido.setFormaDePagamento(new PagamentoBoleto());
        pedido.pagar();
    }
}
