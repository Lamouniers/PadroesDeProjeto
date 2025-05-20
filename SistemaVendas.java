
public class SistemaVendas {
    public static void main(String[] args) {
        
        Vendivel produto1 = new Produto("cfd80570", "Notebook", 3500.00);
        Vendivel produto2 = new Produto("0cb20398", "Mouse", 120.50);
        Vendivel produto3 = new Produto("Mouse sem fio", 120.50);
        
        ProcessadorDePagamento processador = ProcessadorDePagamentoEscolha.criarQualTipo("cartao");
        
        Pedido pedido = new Pedido(processador);
        System.out.println("\n");
        pedido.adicionarItem(produto1);
        pedido.adicionarItem(produto2);
        pedido.adicionarItem(produto3);

        boolean sucesso = pedido.finalizarPedido();
        System.out.println("Pagamento " + (sucesso ? "aprovado\n" : "recusado\n"));
    };
};