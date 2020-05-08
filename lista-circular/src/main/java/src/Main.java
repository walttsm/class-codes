package src;

public class Main {

    public static void main(String[] args) {

        ListaCircular lista = new ListaCircular();
        for (int i = 0; i < 10; i++) {
            lista.adicionar(i);
        }

        // lista.remover(2);

        System.out.println(lista);
    }

}