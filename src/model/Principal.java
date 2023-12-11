package model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Aluno> alunos = new ArrayList<>();
        ArrayList<Professor> professores = new ArrayList<>();

        System.out.println("Bem-vindo ao sistema de cadastro!");

        while (true) {
            System.out.print("Digite 1 para cadastrar um aluno, 2 para cadastrar um professor ou 0 para sair: ");
            int escolha = scanner.nextInt();
            scanner.nextLine(); // Limpa o caractere de nova linha

            if (escolha == 0) {
                break;
            } else if (escolha == 1) {
                // Cadastro de aluno
                System.out.print("Nome do aluno: ");
                String nome = scanner.nextLine();

                System.out.print("Data de nascimento (AAAA-MM-DD): ");
                Date dataNascimento = Date.valueOf(scanner.nextLine());

                System.out.print("CPF: ");
                int cpf = scanner.nextInt();
                scanner.nextLine();

                System.out.print("RA: ");
                String ra = scanner.nextLine();

                // Crie o objeto Aluno com as informações coletadas e adicione à lista de
                // alunos.
                Aluno aluno = new Aluno(new Pessoa(nome, dataNascimento, cpf, "", "", "", ""), ra, 0.0,
                        Aluno.SituacaoAcademica.ativo, new ArrayList<>(), null);
                alunos.add(aluno);
            } else if (escolha == 2) {
                // Cadastro de professor
                System.out.print("Nome do professor: ");
                String nome = scanner.nextLine();

                System.out.print("Disciplina: ");
                String disciplina = scanner.nextLine();

                System.out.print("Salário: ");
                double salario = scanner.nextDouble();
                scanner.nextLine();

                // Crie o objeto Professor com as informações coletadas e adicione à lista de
                // professores.
                Professor professor = new Professor(new Pessoa(nome, Date.valueOf("2000-01-01"), 0, "", "", "", ""),
                        disciplina, salario, 0, Professor.Turno.manha);
                professores.add(professor);
            } else {
                System.out.println("Escolha inválida.");
            }
        }

        // Imprima os alunos cadastrados
        System.out.println("Alunos cadastrados:");
        for (Aluno aluno : alunos) {
            System.out.println("Nome: " + aluno.getEstudante().getNome() + ", RA: " + aluno.getRa());
        }

        // Imprima os professores cadastrados
        System.out.println("Professores cadastrados:");
        for (Professor professor : professores) {
            System.out.println("Nome: " + professor.getEducador().getNome() + ", Disciplina: " +
                    professor.getDiciplina() + ", Turno: " + professor.getTurnoAsString());
        }

        // Feche o scanner
        scanner.close();
    }
}

// Neste código, o programa permite que o usuário cadastre alunos ou professores
// e depois lista os alunos e professores cadastrados.
// Até o momento parei aqui.
