import java.util.UUID; 

class Produto implements Vendivel {

    private String codigo;
    private String descricao;
    private double preco;
    
    public Produto(String codigo, String descricao, double preco) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
    }

    public Produto(String descricao, double preco) {
        this(gerarCodigoAutomatico(), descricao, preco);
    }
    
    private static String gerarCodigoAutomatico() {
        return UUID.randomUUID().toString().substring(0, 8);
    }

    @Override
    public String getCodigo() {
        return codigo;
    }
    
    @Override
    public String getDescricao() {
        return descricao;
    }
    
    @Override
    public double getPreco() {
        return preco;
    }
}