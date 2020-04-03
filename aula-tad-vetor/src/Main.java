public class Main {
    public static void main(String[] args) {
        Vetor v = new Vetor(5);

        System.out.println(v);

        v.adicionar(1);
        v.adicionar(2);
        v.adicionar(3);
        v.adicionar(4);

        System.out.println(v);

        v.remover(1);

        System.out.println(v);

        v.adicionar(5);
        System.out.println(v);
    }
}
