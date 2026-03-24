public class MainListaDuplamenteEncadeada {
    static void main() {

        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

        lista.adicionarElemento(1);
        lista.adicionarElemento(23);
        lista.adicionarElemento(-11);
        lista.adicionarElemento(10);

        System.out.println("----------");
        lista.exibirInverso();
    }
}
