public class ProcessadorDePagamentoEscolha {
    public static ProcessadorDePagamento criarQualTipo(String tipo) {
        
        if ("cartao".equals(tipo)) {
            return new CartaoCredito();
        }else 
        if ("pix".equals(tipo)) {
            return new Pix();
        };
        return null;
    };
}
