import java.util.Scanner;

class Professor {
    private String nome;

    public Professor(String nome) {
        this.nome = nome;
    }

    public String pegarNome() {
        return nome;
    }
}

class Aluno {
    private String nome;
    private Professor professor;

    public Aluno(String nome, Professor professor) {
        this.nome = nome;
        this.professor = professor;
    }

    public String pegarNome() {
        return nome;
    }

    public Professor pegarProfessor() {
        return professor;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando o professor
        System.out.print("Digite o nome do professor: ");
        String nomeProfessor = scanner.nextLine();
        Professor professor = new Professor(nomeProfessor);

        // Criando os alunos
        System.out.print("Digite o nome do primeiro aluno: ");
        String nomeAluno1 = scanner.nextLine();
        Aluno aluno1 = new Aluno(nomeAluno1, professor);

        System.out.print("Digite o nome do segundo aluno: ");
        String nomeAluno2 = scanner.nextLine();
        Aluno aluno2 = new Aluno(nomeAluno2, professor);

        // Exibindo os resultados (opcional)
        System.out.println("Professor: " + professor.pegarNome());
        System.out.println("Aluno 1: " + aluno1.pegarNome() + ", Professor: " + aluno1.pegarProfessor().pegarNome());
        System.out.println("Aluno 2: " + aluno2.pegarNome() + ", Professor: " + aluno2.pegarProfessor().pegarNome());
    }
}