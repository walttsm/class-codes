
public class Aula {

    public static void main(String[] args) {
        // System.out.print("hello, world");
        int[] arr = {2,3,5,8,7};
        int[] newArr = {9,8,7,6,5,4};
        // int[] arr2 = new int[5];

        System.out.print("antes - [");
        for (int i = 0; i < arr.length; i++){
            System.out.print(" " + arr[i] + " ");
        }
        System.out.print("]");

        // cria um novo vetor com uma posição a mais
        // int[] newArr = new int[6];
        // copia cada valor no novo vetor

        for (int i = 0; i < newArr.length; i++){
            if (i < newArr.length - 1){
                newArr[i] = arr[i];
            } else {
                newArr[i] = 6;
            }
        }
        // for (int i = 0; i < arr.length; i++){
        //     newArr[i] = arr[i];
        // }
        // newArr[arr.length] = 6;
//        "arr" --->  \|/  //kkkkkk
//        "newArr" -> &0xCAFECAFE;  //kkkkkk
        // mudo referência do vetor antigo para o novo
        arr = newArr;
        System.out.println();
        System.out.print("Depois - [");
        for (int i = 0; i < arr.length; i++){
            System.out.print(" " + arr[i] + " "); //sai fora to na fila flw gente
        }
        System.out.print("]");

    }

}
//    eae devs, memoria ta boa?

//int -> 32 bits / 8 = 4 bytes
// 32/8 = 4bytes
// int[5] 5 * 4bytes = 20bytes
//+1 int[6] 24bytes

//+1
//int[5] 5 x 4bytes = 20bytes
//int[6] 6 x 4bytes = 24bytes
//---------------------------
//                    44bytes
//int[6] 6 x 4bytes = 24bytes
//int[7] 7 x 4bytes = 28bytes
//---------------------------
//                    52bytes

//+5
//int[5] 5 x 4bytes = 20bytes
//int[10] 10 x 4bytes = 40bytes
//---------------------------
//                    60bytes
//int[10] 10 x 4bytes = 40bytes
//int[15] 15 x 4bytes = 60bytes
//---------------------------
//                     100bytes

//x2
//int[5] 5 x 4bytes = 20bytes
//int[10] 10 x 4bytes = 40bytes
//---------------------------
//                    60bytes
//int[10] 10 x 4bytes = 40bytes
//int[20] 20 x 4bytes = 80bytes
//---------------------------
//                     120bytes
//int[20] 20 x 4bytes = 80bytes
//int[40] 40 x 4bytes = 160bytes
//---------------------------
//                     240bytes


//^2
//int[5] 5 x 4bytes = 20bytes
//int[25] 25 x 4bytes = 100bytes
//---------------------------
//                    120bytes
//int[25] 25 x 4bytes = 100bytes
//int[625] 625 x 4bytes = 2500bytes
//---------------------------
//                        2600bytes

// int[5]
//x2 int[10]
//x2 int[20]

// int[5]
//^2 int[25]
//^2 int[625]
// DEPENDE
// 44 bytes
// int[99999] 4 Mbytes vai lagar tudo
//
// professor se o arrNeww tivesse os [0], [1] etc diferente ia sobrescrever? ou se fosse em vez de "=" tbm fosse += ia somar etc?
//         int[] newArr = new int[6];
//
//
//
//
