public class MainFilaSimples {
    static void main() {

        FilaSimples filaSimples = new FilaSimples(4);

        filaSimples.enfileirar(20);
        filaSimples.enfileirar(30);
        filaSimples.enfileirar(22);
        filaSimples.enfileirar(50);

        System.out.println("\n");
        filaSimples.exibirFilia();
    }
}
