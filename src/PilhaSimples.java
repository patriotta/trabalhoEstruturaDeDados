public class PilhaSimples {

    int[] dados;
    int topo;

    public PilhaSimples(int tamanho) {
        this.dados = new int[tamanho];
        this.topo = -1;
    }

    public void empilhar(int numero) {
        if(estaCheia()) {
            System.out.println("A Pilha está cheia.");
        } else {
            topo++;
            dados[topo] = numero;
            System.out.println("Número " + numero + " empilhado.");
        }
    }

    public void desempilhar() {
        if(!estaVazio()) {
            System.out.println("Removendo: " + dados[topo]);
            topo--;
        }
    }

    public void exibir() {
        if(!estaVazio()) {
            for(int i = topo; i >= 0; i--) {
                System.out.println(dados[i]);
            }
        }
    }

    private boolean estaVazio() {
        if(topo == -1) {
            System.out.println("A Pilha está vazia.");
            return true;
        }
        return false;
    }

    private boolean estaCheia() {
        if(topo == dados.length - 1) {
            return true;
        }
        return false;
    }
}