package strategy;

public class PagamentoPix implements FormaDePagamento{

    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " via PIX aprovado.");
    }
}
