public class Main {
    public static void main(String[] args) {

        boolean resultadoDaprimeiraValidacao = primeiraValidao(formaPagamentoOutrosCartoes,
                formaPagamentoCartaoProprio, cancelarVenda, isConfirmarVenda, vendaExterna);

        boolean resultadoDaSegundaValidacao = segundaValidao(paramUtilizaTEF, cancelarVenda,
                isConfirmarVenda, vendaExterna);

        boolean resultadoDaTerceiraValidacao = terceiraValidao(formaPagamentoOutrosCartoes, vendaExterna, cancelarVenda);

        boolean resultadoDaQuartaValidacao = quartaValidao(nfce, formaPagamentoOutrosCartoes);

        if (resultadoDaprimeiraValidacao || resultadoDaSegundaValidacao ||
                resultadoDaTerceiraValidacao || resultadoDaQuartaValidacao) {
            return ;
        }

    }
    static boolean primeiraValidao( boolean formaPagamentoOutrosCartoes, boolean formaPagamentoCartaoProprio,
                             boolean cancelarVenda, boolean isConfirmarVenda, boolean vendaExterna){
        return (formaPagamentoOutrosCartoes || formaPagamentoCartaoProprio) && !cancelarVenda &&
//                        !isConfirmarVenda && !vendaExterna)
    }
    static boolean segundaValidao ( boolean paramUtilizaTEF, boolean cancelarVenda, boolean isConfirmarVenda,
                                    boolean vendaExterna){
        return (paramUtilizaTEF.getValorString().equals(Constantes.NAO) && !cancelarVenda &&
                isConfirmarVenda && !vendaExterna)
    }
    static boolean terceiraValidao ( boolean formaPagamentoOutrosCartoes, boolean vendaExterna,
                                     boolean cancelarVenda){
        return (formaPagamentoOutrosCartoes && vendaExterna && !cancelarVenda)
    }
    static boolean quartaValidao ( boolean nfce, boolean formaPagamentoOutrosCartoes){
        return (nfce && formaPagamentoOutrosCartoes)
    }



}