public class MainPilhaDinamica {

    public static void main(String[] args) {

        PilhaDinamica pilha = new PilhaDinamica();

        pilha.empilhar(10);
        pilha.empilhar(20);
        pilha.empilhar(30);

        pilha.desempilhar();
        pilha.exibir();
    }
}