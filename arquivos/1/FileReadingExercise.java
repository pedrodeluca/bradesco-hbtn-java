import javax.annotation.processing.Filer;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class FileReadingExercise {
    public static void main(String[] args) {
        String path = "C:\\Desenv\\Projetos\\Holberton\\bradesco-hbtn-java\\arquivos\\1\\exemplo.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String linha;
            System.out.println("Conteúdo do arquivo 'exemplo.txt':");
            System.out.println();
            while((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
            System.out.println();
            System.out.print("Leitura do arquivo concluída.");
        } catch (Exception e) {
            //System.out.println("Erro na leitura do arquivo!");
        }

    }
}