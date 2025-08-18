package Collections_Exercicios.blog;
import java.util.*;

public class Blog {

    Set<Post> postagens;

    public Blog() {
        this.postagens = new HashSet<>();
    }

    public void adicionarPostagem(Post postagem) {
        this.postagens.add(postagem);
    }

    public Set<String> obterTodosAutores() {
        Set<String> autores = new TreeSet<>();

        for (Post post : postagens) {
            autores.add(post.getAutor());
        }
        return autores;
    }

    public Map<String, Integer> obterContagemPorCategoria() {
        Map<String, Integer> contagem = new TreeMap<>();

        for (Post post : postagens) {
            String categoria = post.getCategoria();
            contagem.put(categoria, contagem.getOrDefault(categoria, 0) + 1);
        }

        return contagem;
    }
}
