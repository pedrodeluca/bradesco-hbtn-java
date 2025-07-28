import java.util.Scanner;

public class ArrayExercicio {
    public static void main(String[] args) {
        // Criando o scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Definindo o tamanho do array
        int tamanhoArray = 10;
        int[] numeros = new int[tamanhoArray];
        int soma = 0;
        int maiorNumero = Integer.MIN_VALUE;

        // Preenchendo o array com números fornecidos pelo usuário
        // Utilize scanner.nextInt(); para receber o numero digitado
        System.out.println("Digite 10 números inteiros:");

        for (int i=0 ; i<10 ; i++) {
            int posicao=i+1;
            System.out.print("Digite o número " + posicao + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Exibindo os resultados
        System.out.println("\n");
        System.out.println("Conteúdo do array:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
            soma += numero;
            if (maiorNumero < numero)
                maiorNumero = numero;
        }
        System.out.println("\nSoma de todos os números: " + soma);
        System.out.print("Maior número no array: " + maiorNumero);

        // Fechando o scanner
        scanner.close();
    }
}
