public class PilhaDinamica {

    NoInteiro topo;

    public PilhaDinamica() {
        this.topo = new NoInteiro(null);
    }

    public void empilhar(int numero) {
        if(estaVazio()) {
            System.out.println("Número " + numero + " empilhado.");
            this.topo.setConteudo(numero);
        } else {
            NoInteiro novoNo = new NoInteiro(numero);
            novoNo.setProx(this.topo);
            this.topo = novoNo;
            System.out.println("Número " + numero + " empilhado.");
        }
    }

    public void desempilhar() {
        if(!estaVazio()) {
            if(this.topo.getProx() == null) {
                this.topo.setConteudo(null);
            } else {
                System.out.println("Removendo: " + this.topo.getConteudo());
                this.topo = this.topo.getProx();
            }
        }
    }

    public void exibir() {
        if(!estaVazio()) {
            NoInteiro aux = this.topo;

            while(aux != null) {
                System.out.println(aux.getConteudo());
                aux = aux.getProx();
            }
        }
    }

    private boolean estaVazio() {
        if(this.topo.getConteudo() == null) {
            System.out.println("A Pilha está vazia.");
            return true;
        } else {
            return false;
        }
    }
}