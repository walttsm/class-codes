import java.util.Arrays;

public class Vetor {
    private int elementos[];
    private int ultima_posicao;

    /**
     * Construtor do nosso vetor. Recebe como parâmetro
     * o tamanho do vetor a ser inicializado.
     *
     * @param _tamanho
     */
    public Vetor(int _tamanho){
        this.elementos = new int[_tamanho];
    }


//     [1, 2, 3, 4, 0]
//     [1, 0, 3, 4, 0]
//    quero adicionar o 5

// [1, 2, 3, 4, 5, 6, ..., 88, ..., 129, 0, 0]
    public void adicionar(int _valor){
        elementos[ultima_posicao] = _valor;
        ultima_posicao = ultima_posicao + 1;

//        for (int i = 0; i < elementos.length; i++) {
//            if(elementos[i] == 0){
//                elementos[i] = _valor;
//                break;
//            }
//        }
    }

//    [1, 2, 3, 4, 5, 6, 7, 0, 0, 0]
//
//    5 posições ocupadas
//    6
//    1 operação de percorrer levar 1s
//    129s
//


    public void remover(int _indice){
        elementos[_indice] = 0;
    }


    @Override
    public String toString() {
        return "Vetor{" +
                "elementos=" + Arrays.toString(elementos) +
                '}';
    }
}
