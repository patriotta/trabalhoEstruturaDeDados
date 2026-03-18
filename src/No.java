public class No {
    //O nó é uma caixa que guarda dados da lista (String, double...) e os seus apontamentos (proximo ou anteriror)

    String conteudo;
    No prox;

    public No(){}
    public No(String conteudo){
        this.conteudo = conteudo;
        this.prox = null;
    }

    public String getConteudo() {
        return conteudo;
    }
    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
    public No getProx() {
        return prox;
    }
    public void setProx(No prox) {
        this.prox = prox;
    }
}
