public class MainPilhaSimples {

    public static void main(String[] args) {

        PilhaSimples pilha = new PilhaSimples(3);


        pilha.empilhar(5);
        pilha.empilhar(10);
        pilha.empilhar(15);

        pilha.exibir();
        pilha.desempilhar();

        //Teste pilha cheia
        pilha.empilhar(20);
    }
}