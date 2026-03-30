public class ListaDuplamenteEncadeada {
    NoDuplo inicio;
    NoDuplo ultimo;

    ListaDuplamenteEncadeada() {
        this.inicio = new NoDuplo(null);
        this.ultimo = this.inicio;
    }

    public void adicionar(int conteudo) {
        if(estaVazio()) {
            this.inicio.setConteudo(conteudo);
            this.ultimo = this.inicio;
        } else {
            NoDuplo novoNo = new NoDuplo(conteudo);
            this.ultimo.setProx(novoNo);
            novoNo.setAnt(this.ultimo);
            this.ultimo = novoNo;
        }
    }

    public void exibir () {
        if(!estaVazio()) {
            NoDuplo aux = this.inicio;
            while(aux != null) {
                System.out.println(aux.getConteudo());
                aux = aux.getProx();
            }
        }
    }

    public void exibirInverso () {
        if(!estaVazio()) {
            NoDuplo aux = this.ultimo;
            while(aux != null) {
                System.out.println(aux.getConteudo());
                aux = aux.getAnt();
            }
        }
    }

    public boolean estaVazio() {
        if(this.inicio.getConteudo() == null) {
            return true;
        } else {
            return false;
        }
    }

    public void remover(int conteudo) {
        if(verificarExistencia(conteudo)) {
            if(this.inicio.getConteudo() == conteudo) {
                if(this.inicio.getProx() == null) {
                    this.inicio.setConteudo(null);
                    this.ultimo = this.inicio;
                    return;
                } else {
                    this.inicio = this.inicio.getProx();
                    this.inicio.setAnt(null);
                    return;
                }
            } else {
                NoDuplo aux = this.inicio;
                while(aux.getProx() != null) {
                    if(aux.getProx().getConteudo() == conteudo && aux.getProx().getProx() != null) {
                        aux.setProx(aux.getProx().getProx());
                        aux.getProx().setAnt(aux);
                        return;
                    } else if(this.ultimo.getConteudo() == conteudo) {
                        aux.getProx().setProx(null);
                        //this.ultimo.getAnt().setProx(null);
                        //aux.setProx(aux.getProx().getProx());
                        this.ultimo = aux.getProx();
                        return;
                    }
                }
            }
        }
    }

    public boolean verificarExistencia(int conteudo) {
        if(!estaVazio()) {
            NoDuplo aux = this.inicio;
            while(aux != null) {
                if (aux.getConteudo() == conteudo) {
                    return true;
                }
                aux = aux.getProx();
            }
        }
        return false;
    }
}