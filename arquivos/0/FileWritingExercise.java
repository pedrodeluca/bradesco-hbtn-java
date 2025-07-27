import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;


public class FileWritingExercise {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        // Solicita o nome do arquivo
        System.out.print("Digite o nome do arquivo (com extensão .txt): ");
        String fileName = scanner.nextLine();
        String path = "C:\\Desenv\\Projetos\\Holberton\\bradesco-hbtn-java\\arquivos\\0\\" + fileName;

        // implemente o codigo aqui
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            String conteudo="sim";
            while (!conteudo.equals("sair")) {
                System.out.print("Oque deseja gravar no arquivo: ");
                conteudo = scanner.nextLine();

                if (conteudo.equals("sair"))
                    return;

                writer.write(conteudo);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao realizar a gravação do arquivo");
        }

        scanner.close();
    }
}
