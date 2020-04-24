import java.util.Arrays;

public class Vetor {
    private int elementos[];
    private int ultima_posicao;

    /**
     * Construtor do nosso vetor. Recebe como parâmetro o tamanho do vetor a ser
     * inicializado.
     *
     * @param _tamanho
     */
    public Vetor(int _tamanho) {
        this.elementos = new int[_tamanho];
    }

    // [1, 2, 3, 4, 0]
    // [1, 0, 3, 4, 0]
    // quero adicionar o 5

    // TODO implementar o aumento do vetor.
    // +5, x2, ^2
    public void adicionar(int _valor) {
        elementos[ultima_posicao] = _valor;

        // atualizar o indice da ultima_posicao
        // se a proxima posicao nao estiver ocupada.
        if (ultima_posicao == elementos.length - 1) {
            return;
        }
        if (elementos[ultima_posicao + 1] == 0) {
            ultima_posicao = ultima_posicao + 1;
        } else {
            for (int i = 0; i < elementos.length; i++) {
                if (elementos[i] == 0) {
                    ultima_posicao = i;
                    break;
                }
            }
        }
        // senao procurar a proxima posicao desocupada.

        // for (int i = 0; i < elementos.length; i++) {
        // if(elementos[i] == 0){
        // elementos[i] = _valor;
        // break;
        // }
        // }
    }

    public void remover(int _indice) {
        elementos[_indice] = 0;

        if (ultima_posicao > _indice) {
            ultima_posicao = _indice;
        }
        // atualizar o indice da ultima_posicao
        //
        //
        // [1, 2, 3, 4, 0] => remove(1) | ultima_posicao = 4
        // [1, 0, 3, 4, 0] => ultima_posicao = 1 => remove(0)
        // [0, 0, 3, 4, 0] => ultima_posicao = 0 => remove(2)
        // [0, 0, 0, 4, 0] => ultima_posicao = 2

    }

    // [0,7,3,4,8]
    /**
     * Metodo para buscar um determinado valor no vetor. Retorna -1 caso nao
     * encontre.
     * 
     * @param _valor
     * @return retorna o indice do valor encontrado.
     */
    public int buscar(int _valor) {
        for (int i = 0; i < elementos.length; i++) {
            if (elementos[i] == _valor)
                return i;
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Vetor{" + "elementos=" + Arrays.toString(elementos) + '}';
    }
}
