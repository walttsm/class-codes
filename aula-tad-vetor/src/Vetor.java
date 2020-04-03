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

    /**
     * Adiciona um valor ao vetor na primeira posição vazia disponível. Caso o vetor já esteja cheio, aumenta esse vetor.
     * @param _valor Valor a ser adicionado ao vetor
     */
//    TODO implementar o aumento do vetor = FEITO.
//    +5, x2, ^2
    public void adicionar(int _valor){
        for (int i = 0; i < elementos.length; i++) {
            if (elementos[i] == 0) {
                ultima_posicao = i;
                break;
            }
        }

        if (ultima_posicao == elementos.length - 1) {
            if (elementos[ultima_posicao] == 0) elementos[ultima_posicao] = _valor;
            else {
                int[] aumentador = new int[elementos.length + 5]; // + 5
                //int[] aumentador = new int[elementos.length * 2]; // * 2
                //int[] aumentador = new int[elementos.length * elementos.length]; // ^2
                for (int i = 0; i < elementos.length; i++) {
                    aumentador[i] = elementos[i];
                }
                elementos = aumentador;
                ultima_posicao++;
            }
        }
        elementos[ultima_posicao] = _valor;
    }

    public void remover(int _indice){
        elementos[_indice] = 0;

        if(ultima_posicao > _indice){
            ultima_posicao = _indice;
        }
//        atualizar o indice da ultima_posicao
//
//
//        [1, 2, 3, 4, 0] => remove(1) | ultima_posicao = 4
//        [1, 0, 3, 4, 0] => ultima_posicao = 1 => remove(0)
//        [0, 0, 3, 4, 0] => ultima_posicao = 0 => remove(2)
//        [0, 0, 0, 4, 0] => ultima_posicao = 2

    }

    @Override
    public String toString() {
        return "Vetor{" +
                "elementos=" + Arrays.toString(elementos) +
                '}';
    }
}
