import java.util.ArrayList;
import java.util.List;

class Pedido {
    private List<Vendivel> itens;
    private ProcessadorDePagamento processador;
    
    public Pedido(ProcessadorDePagamento processador) {
        this.itens = new ArrayList<>();
        this.processador = processador;
    }
    
    public void adicionarItem(Vendivel item) {
        itens.add(item);
        System.out.println("Item adicionado: " + item.getDescricao() + " - R$" + item.getPreco() + " (Código: " + item.getCodigo() + ")"); 
    }
    
    public double calcularTotal() {
        return itens.stream().mapToDouble(Vendivel::getPreco).sum();
    }
    
    public boolean finalizarPedido() {
        double total = calcularTotal();
        System.out.println("\nFinalizando pedido no valor total de R$" + total);
        return processador.processarPagamento(total);
    }
}