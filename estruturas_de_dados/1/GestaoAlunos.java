import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestaoAlunos {
    public static void main(String[] args) {
        montaMenuPricipal();
    }

    public static void montaMenuPricipal() {
        List<Aluno> alunos = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Cadastro de Alunos - Utilizando Listas");
            System.out.println("1 - Adicionar Aluno");
            System.out.println("2 - Excluir Aluno");
            System.out.println("3 - Buscar Aluno Pelo Nome");
            System.out.println("4 - Exibir Todos Alunos");
            System.out.println("5 - Encerrar");
            System.out.print("Informe a opção desejada: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    adicionarAluno(alunos);
                    break;
                case 2:
                    excluirAluno(alunos);
                    break;
                case 3:
                    buscarAluno(alunos);
                    break;
                case 4:
                    listarAlunos(alunos);
                    break;
                case 5:
                    System.out.println("Encerrando o Programa. Até a próxima!");
                    break;
                default:
                    System.out.println("Função não implementada");
            }
        } while (opcao != 5);

        scanner.close();
    }

    public static void adicionarAluno(List<Aluno> alunos) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Idade: ");
        int idade = scanner.nextInt();

        Aluno aluno = new Aluno(nome, idade);
        alunos.add(aluno);
    }

    public static void excluirAluno(List<Aluno> alunos) {
        if (alunos.isEmpty()) {
            System.out.println("Lista de alunos vazia");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o aluno a ser excluido: ");
        String excluirAluno = scanner.nextLine();
        boolean alunoExluido=false;

        for (Aluno aluno : alunos) {
            if (aluno.getNome().equals(excluirAluno)) {
                alunos.remove(aluno);
                alunoExluido = true;
            }
        }

        if (!alunoExluido)
            System.out.println("Não foi encontrado o aluno (" + excluirAluno + ") na lista para exclusão");
    }

    public static void buscarAluno(List<Aluno> alunos) {
        if (alunos.isEmpty()) {
            System.out.println("Lista de alunos vazia");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o aluno a ser pesquisado: ");
        String pesquisarAluno = scanner.nextLine();
        boolean alunoPesquisado = false;

        for (Aluno aluno : alunos) {
            if (aluno.getNome().equals(pesquisarAluno)) {
                System.out.println(aluno);
                alunoPesquisado = true;
            }
        }

        if (!alunoPesquisado)
            System.out.println("Não foi encontrado o aluno (" + pesquisarAluno + ") na lista");
    }

    public static void listarAlunos(List<Aluno> alunos) {
        if (alunos.isEmpty()) {
            System.out.println("Lista de alunos vazia");
            return;
        }

        for (Aluno todosAlunos: alunos)
            System.out.println(todosAlunos);
    }
}