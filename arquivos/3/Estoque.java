import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Estoque {
    public final String arquivo = "C:\\Desenv\\Projetos\\Holberton\\bradesco-hbtn-java\\arquivos\\3\\estoque.csv";

    public Estoque(String s) {
    }

    public void adicionarProduto(String nome, int quantidade, double preco) {
        List<Produto> produtos = lerAquivoCompleto();
        Produto produtoNovo = new Produto(produtos.size() + 1, nome, quantidade, preco);
        produtos.add(produtoNovo);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo))) {
            for (Produto produto : produtos) {
                writer.write(produto.getId() + "," + produto.getNome() + "," +
                        produto.getQuantidade() + "," + produto.getPreco());
                writer.newLine();
            }
            writer.close();
            System.out.println("Lista gravada com sucesso no arquivo: " + arquivo);
        } catch (IOException e) {
            System.err.println("Ocorreu um erro ao gravar o arquivo: " + e.getMessage());
        }
    }

    public void excluirProduto(int idExcluir) {
        List<Produto> produtos = lerAquivoCompleto();
        Boolean idEncontrado=false;

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo))) {
            for (Produto produto : produtos) {
                if (produto.getId() != idExcluir) {
                    writer.write(produto.getId() + "," + produto.getNome() + "," +
                            produto.getQuantidade() + "," + produto.getPreco());
                    writer.newLine();
                }
            }
            writer.close();
            System.out.println("Lista gravada com sucesso no arquivo: " + arquivo);
        } catch (IOException e) {
            System.err.println("Ocorreu um erro ao gravar o arquivo: " + e.getMessage());
        }
    }

    public void exibirEstoque() {
        try (BufferedReader reader = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while((linha = reader.readLine()) != null) {
                String[] info = linha.split(",");
                Produto produto = new Produto(Integer.parseInt(info[0]), info[1], Integer.parseInt(info[2]), Double.parseDouble(info[3]));
                System.out.println(produto);
            }
        } catch (Exception e) {
            System.out.println("Erro na leitura do metodo exibirEstoque");
        }
    }

    public void atualizarQuantidade(int idAtualizar, int novaQuantidade) {
        boolean idEncontrado=false;
        Produto produtoAlterado = null;
        List<Produto> produtos = lerAquivoCompleto();

        for (int i=0 ; i<produtos.size() ; i++) {
            if (idAtualizar == produtos.get(i).getId()) {
                produtos.get(i).setQuantidade(novaQuantidade);
                idEncontrado = true;
                produtoAlterado = produtos.get(i);
                break;
            }
        }

        if (idEncontrado) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo))) {
                for (Produto produto : produtos) {
                    writer.write(produto.getId() + "," + produto.getNome() + "," +
                            produto.getQuantidade() + "," + produto.getPreco());
                    writer.newLine();
                }
                writer.close();
                System.out.println("Lista gravada com sucesso no arquivo: " + arquivo);
            } catch (IOException e) {
                System.err.println("Ocorreu um erro ao gravar o arquivo: " + e.getMessage());
            }
        } else {
            System.out.println("Não foi possivel encontrar o ID do produto informado");
        }
    }

    public List<Produto> lerAquivoCompleto()  {
        List<Produto> produtos = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while((linha = reader.readLine()) != null) {
                String[] info = linha.split(",");
                Produto produto = new Produto(Integer.parseInt(info[0]), info[1], Integer.parseInt(info[2]), Double.parseDouble(info[3]));
                produtos.add(produto);
            }
        } catch (Exception e) {
            System.out.println("Erro na leitura do metodo lerArquivoCompleto");
        }
        return produtos;
    }
}
