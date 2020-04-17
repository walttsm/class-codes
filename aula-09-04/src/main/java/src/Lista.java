package src;

public class Lista{

    private Node inicio;
    private int tamanho;

    public void adicionar(Node _node){
        if(this.inicio == null){
            this.inicio = _node;
        }else{
            Node aux = this.inicio;
            while(aux.getProximo() != null){
                aux = aux.getProximo();
            }
            aux.setProximo(_node);
        }
        tamanho++;
    }

    public Node get(int _posicao){
        if(_posicao == 0){
            return this.inicio;
        }else{
            Node aux = this.inicio;            
            while(aux.getProximo() != null){
                aux = aux.getProximo();
                _posicao--;
            }
            return null;
        }
    }

    public int getTamanho(){
        return this.tamanho;
    }

}