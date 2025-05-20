class CartaoCredito implements ProcessadorDePagamento {
    
    @Override
    public boolean processarPagamento(double valor) {
        System.out.println("Processando pagamento de R$" + valor + " via CARTÃO DE CRÉDITO");
        
        return true;
    }
}