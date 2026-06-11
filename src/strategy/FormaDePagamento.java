package strategy;

// Define o contrato que todas as formas de pagamento devem seguir
public interface FormaDePagamento {
    void realizarPagamento(double valor);
}
