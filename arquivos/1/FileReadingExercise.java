import javax.annotation.processing.Filer;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class FileReadingExercise {
    public static void main(String[] args) {
        String path = "exemplo.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String linha;
            System.out.println("Conteúdo do arquivo 'exemplo.txt':\n");
            while((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
            System.out.print("\nLeitura do arquivo concluída.\n");
        } catch (Exception e) {
        }

    }
}