public class MainListaSimples{
    public static void main(String[] args) {
        ListaSimples listaSimples = new ListaSimples(5);

        listaSimples.adicionaElementos("Emerson");
        listaSimples.adicionaElementos("Ana");
        listaSimples.adicionaElementos("Gabriel");
        listaSimples.adicionaElementos("Heloisa");
        listaSimples.adicionaElementos("Rebeca");

        System.out.println("\n");
        //listaSimples.removerElemento("Gabriel");

        listaSimples.exibirElementos();
        listaSimples.quantidadeDeElementos();
    }
}



