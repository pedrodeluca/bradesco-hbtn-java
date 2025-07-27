import java.io.BufferedReader;
import java.io.FileReader;

public class CsvFileReader {
    public static void main(String[] args) {
        String path = "C:\\Desenv\\Projetos\\Holberton\\bradesco-hbtn-java\\arquivos\\2\\funcionarios.csv";

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String linha;
            while((linha = reader.readLine()) != null) {
                String[] info = linha.split(",");
                System.out.println("Funcionário: " + info[0]);
                System.out.println("Idade: " + info[1]);
                System.out.println("Departamento: " + info[2]);
                System.out.println("Salarial: " + info[3]);
                System.out.println("------------------------");
            }
            System.out.println("Leitura do arquivo concluída.");
        } catch (Exception e) {
        }

    }
}
