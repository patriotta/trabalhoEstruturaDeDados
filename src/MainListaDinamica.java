public class MainListaDinamica {
    public static void main(String[] args) {

        ListaDinamica listaDinamica = new ListaDinamica();

        listaDinamica.adicionarElemento("Emerson");
        listaDinamica.adicionarElemento("Ana");
        listaDinamica.adicionarElemento("Gabriel");
        listaDinamica.adicionarElemento("Heloisa");

        System.out.println("\n");
        listaDinamica.removerElemento("Emerson");

        System.out.println("\n");
        listaDinamica.exibirElementos();
    }
}
