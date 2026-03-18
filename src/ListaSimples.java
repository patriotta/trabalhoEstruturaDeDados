public class ListaSimples implements ListaOperacoes {

    String[] lista; //Array "lista"

    public ListaSimples(){}
    public ListaSimples(int tamanho){
        this.lista = new String[tamanho];
    }

    public void exibirElementos(){
        for (int i = 0; i < this.lista.length; i++) {
            System.out.println("Lista[" + i + "] = " + this.lista[i]);
        }
    }

    public void adicionaElementos(String elemento){
        if(!estaCheio()){
            this.lista[encontrarPosicaoVazia()] = elemento;
            System.out.println("Elemento " + elemento + " adicionado com sucesso!");
        }
    }


    private boolean estaCheio() {
        for (int i = 0; i < this.lista.length; i++) {
            if (this.lista[i] == null) {
                return false;
            }
        }
        System.out.println("A lista está cheia!");
        return true;
    }

    private boolean estaVazio(){
        for (int i = 0; i < this.lista.length; i++) {
            if(this.lista[i] != null){
                return false;
            }
        }
        System.out.println("A lista está vazia!");
        return true;
    }

    private int encontrarPosicaoVazia(){
        int i;
        for (i = 0; i < this.lista.length; i++) {
            if(this.lista[i] == null){
                return i;
            }
        }
        return -1;
        //retorna -1 porque o metodo obrigatoriamente tem que ter um retorno e quando não temos espaço vazio,
        //damos um índice inexistente para que ele entenda que não existe nenhum elemento vazio no array
    }

    public int buscarElemento(String elemento){
        int i;
        if(!estaVazio()){
            for (i = 0; i < this.lista.length; i++) {
                if(this.lista[i].equals(elemento)){ //pega o que está escrito na posição [i] do array e compara com o elemento que você passou como parâmetro
                    return i;
                }
            }
        }
        System.out.println("Elemento não encontrado na lista.");
        return -1;
    }

    public void removerElemento(String elemento){
        if(!estaVazio()){
            if(this.buscarElemento(elemento) >= 0){ //não sendo -1 porque não existe, ele vai e altera o elemento
                this.lista[this.buscarElemento(elemento)] = null;
                System.out.println("Elemento " + elemento + " removido com sucesso!");
            }
        }
    }



    public void alterarElementoi(String elementoASerAlterado, String alteracao){
        if(buscarElemento(elementoASerAlterado) >= 0){
            this.lista[buscarElemento(elementoASerAlterado)] = alteracao;
            System.out.println("Elemento " + elementoASerAlterado + " alterado com sucesso para " + alteracao);
        }
    }

    public void quantidadeDeElementos(){
        int cont = 0;
        if(!estaVazio()){
            for (int i = 0; i < this.lista.length; i++) {
                if(this.lista[i] != null){
                    cont++;
                }
            }
        }
        System.out.println("A lista possuiu " + cont + " elementos!");
    }


    //métodos sobreescritos
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
