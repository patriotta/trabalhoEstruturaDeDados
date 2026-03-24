public class NoDuplo {

    Integer conteudo;
    NoDuplo prox;
    NoDuplo ant;

    public NoDuplo(Integer conteudo){
        this.conteudo = conteudo;
        this.prox = null;
        this.ant = null;
    }

    public Integer getConteudo() {
        return conteudo;
    }
    public void setConteudo(Integer conteudo) {
        this.conteudo = conteudo;
    }
    public NoDuplo getProx() {
        return prox;
    }
    public void setProx(NoDuplo prox) {
        this.prox = prox;
    }
    public NoDuplo getAnt() {
        return ant;
    }
    public void setAnt(NoDuplo ant) {
        this.ant = ant;
    }
}
