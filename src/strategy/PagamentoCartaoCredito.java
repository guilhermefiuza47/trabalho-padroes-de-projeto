package strategy;

// Forma de pagamento no cartão de crédito com parcelamento
public class PagamentoCartaoCredito implements FormaDePagamento {

    private int parcela;

    public PagamentoCartaoCredito(int parcela){
        this.parcela = parcela;
    }

    @Override
    public void realizarPagamento(double valor){
        double valorParcela = valor/parcela;
        System.out.println("Pagamento de R$" + valor + " no cartão de credito em " + parcela + "x de R$" + valorParcela);
    }
}
