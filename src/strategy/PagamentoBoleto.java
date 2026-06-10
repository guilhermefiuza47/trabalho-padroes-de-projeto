package strategy;

public class PagamentoBoleto implements FormaDePagamento{

    @Override
    public void realizarPagamento(double valor){
        System.out.println("Boleto de R$" + valor + " gerado.");
    }
}
