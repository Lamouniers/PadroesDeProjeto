public class Pix implements ProcessadorDePagamento {

    @Override
    public boolean processarPagamento(double valor) {
        System.out.println("Processando pagamento de R$" + valor + " via PIX");
        return true;
    }
}
