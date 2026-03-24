public class ListaDuplamenteEncadeada {

    NoDuplo inicio;
    NoDuplo ultimo;

    public ListaDuplamenteEncadeada() {
        this.inicio = new NoDuplo(null);
        this.ultimo = this.inicio;
    }

    public void adicionarElemento(Integer conteudo){
        if (estaVazio()) {
            this.inicio.setConteudo(conteudo); //criação do primeiro nó
            this.ultimo = this.inicio;
        } else{
            NoDuplo novoNo = new NoDuplo(conteudo);
            this.ultimo.setProx(novoNo);
            novoNo.setAnt(this.ultimo);
            this.ultimo = novoNo;
        }
    }

    public void exibirInverso(){
        if(!estaVazio()){
            NoDuplo aux = this.inicio;

            while (aux != null){
                System.out.println(aux.getConteudo());
                aux = aux.getAnt();
            }
        }
    }

    public boolean estaVazio(){
        if(this.inicio.getConteudo() == null){
            return true;
        } else{
            return false;
        }
    }

    public void removerElemento(Integer conteudo){
        if(verificarExistencia(conteudo)){
            if(this.inicio.getConteudo() == conteudo){
                if (this.inicio.getProx() == null) {
                    this.inicio.setConteudo(null);
                    this.ultimo = this.inicio;
                } else{
                    this.inicio = this.inicio.getProx();
                    this.inicio.setAnt(null);
                }
            } else{
                NoDuplo aux = this.inicio;

                while (aux.getProx() != null){
                    if(aux.getProx().getConteudo() == conteudo && aux.getProx().getProx() != null){
                        aux.setProx(aux.getProx().getProx());
                        aux.getProx().getProx().setAnt(aux); //pega a última posição que é null e faz com que ele vire o aux, porque o null não realiza operação
                    } else if(aux.getProx().getConteudo() == conteudo && aux.getProx() == this.ultimo){
                        aux.setProx(aux.getProx().getProx());
                        this.ultimo = aux;
                    }
                }
            }
        }
    }

    public boolean verificarExistencia(Integer conteudo){
        if(!estaVazio()){
            NoDuplo aux = this.inicio;

            while (aux != null){
                if (aux.getConteudo() == conteudo){
                    return true;
                }
                aux = aux.getProx();
            }
            return false;
        }
    }
}
