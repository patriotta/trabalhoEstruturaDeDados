public class ListaDinamica implements ListaOperacoes{

    No inicio;


    public ListaDinamica(){
        this.inicio = null;
        System.out.println("Lista Dinâmica criada com sucesso!");
    }

    public void adicionarElemento(String conteudo) {
        No novoNo = new No(conteudo);
        if (this.inicio == null) { //se não tiver um nó inicial
            this.inicio = novoNo; //pega o que acabou de ser criado e transforma ele como inicial
        } else {
            No aux = this.inicio;
            while (aux.getProx() != null) { //enquando tiver um nó dentro do array
                aux = aux.getProx(); //pegue o último nó criado e pule para a próxima posição até achar uma vazia
            }
            aux.setProx(novoNo); //chegou na posição vazia? se sim adiciona o elemento ali
        }
    }

    public void exibirElementos(){
        if(existeInicio()){
            No aux = this.inicio;

            while (aux.getProx() != null){ //imprima os elementos enquanto o nó não for vazio (preenchido)
                System.out.println(aux.getConteudo());
                aux = aux.getProx(); //pula para o próximo
            }
            System.out.println(aux.getConteudo());
        } else{
            System.out.println("Não existe elementos na Lista Dinâmica");
        }
    }

    public void removerElemento(String elemento) {
        if(existeInicio()) {
            if(buscarElemento(elemento)) {
                //removendo primeiro
                if(this.inicio.getConteudo().equals(elemento)) { //O elemento que eu quero ermover é o primeiro?
                    this.inicio = this.inicio.getProx(); //O primeiro nó passa ser o segundo índice, porque o primeiro não é o que queremos
                } else if(this.inicio.getProx() != null) {
                    No aux = this.inicio; //O elemento está no meio ou no fim
                    do {
                        if(aux.getProx().getConteudo().equals(elemento)) {
                            aux.setProx(aux.getProx().getProx());
                            return;
                        }
                        aux = aux.getProx();
                    } while (aux != null);
                } else {
                    this.inicio.setConteudo(null);
                }
                //removendo intermediário
                //metodo de busca
            }
        } else {
            System.out.println("Não existem elementos na lista.");
        }
    }

    public boolean buscarElemento(String elemento){

        No aux = this.inicio;
        do{
            if(aux.getConteudo().equals(elemento)){ //compara o texto com o nó atual
                System.out.println("Elemento "+ elemento + " enconrado!");
                return true; //é igual? se sim retorna verdadeiro
            }
            aux = aux.getProx(); //não achou? vai para o próximo

        } while (aux != null);
        System.out.println("Elemento " + elemento + " não encontrado");
        return false; // se nenhum for igual, retorna falso
    }

    private boolean existeInicio(){
        if(this.inicio.getConteudo() == null){
            return false;
        } else{
            return true;
        }
    }


    @Override
    public int removerTodas(String elemento) {
        return 0;
    }
    @Override
    public int contar() {
        return 0;
    }
    @Override
    public int adicionarVarios(String[] elementos) {
        return 0;
    }
    @Override
    public String obter(int indice) {
        return "";
    }
    @Override
    public boolean inserir(int indice, String elemento) {
        return false;
    }
    @Override
    public String removerPorIndice(int indice) {
        return "";
    }
    @Override
    public void limpar() {
    }
    @Override
    public int ultimoIndiceDe(String elemento) {
        return 0;
    }
    @Override
    public int contarOcorrencias(String elemento) {
        return 0;
    }
    @Override
    public int substituir(String antigo, String novo) {
        return 0;
    }
}
