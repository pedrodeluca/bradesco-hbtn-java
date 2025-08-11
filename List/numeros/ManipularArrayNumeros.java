import java.util.List;

public class ManipularArrayNumeros {

    public static int buscarPosicaoNumero(List<Integer> numeros, int numero) {
        for (int i=1 ; i< numeros.size() ; i++) {
            if (numero == numeros.get(i)) {
                return i;
            }
        }
        return -1;

//        for (int num : numeros) {
//            if (num == numero) {
//                return num;
//            }
//        }
//        return -1;
    }

    public static void adicionarNumero(List<Integer> numeros, int numero) {
        int num = buscarPosicaoNumero(numeros, numero);

        if (num != -1)
            throw new RuntimeException("Numero jah contido na lista");

        numeros.add(numero);
    }

    public static void removerNumero(List<Integer> numeros, int numero) {
        int num = buscarPosicaoNumero(numeros, numero);

        if (num == -1)
            throw new RuntimeException("Numero nao encontrado na lista");

        numeros.remove(Integer.valueOf(numero));
    }

    public static void substituirNumero(List<Integer> numeros, int numeroSubstituir, int numeroSubstituto) {
        int num = buscarPosicaoNumero(numeros, numeroSubstituir);

        if (num == -1)
            numeros.add(numeroSubstituto);
        else
            numeros.set(num, numeroSubstituto);
    }
}