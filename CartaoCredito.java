class CartaoCredito implements ProcessadorDePagamento {
    
    @Override
    public boolean processarPagamento(double valor) {
        System.out.println("Processando pagamento de R$" + valor + " via cartão de crédito");
        
        return true;
    }
}