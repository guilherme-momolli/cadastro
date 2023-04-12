import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String nome = null;
        String cpf = null;
        int idade = 0;
        String serie = ".";
        int ra = 0;
        Aluno aluno = new Aluno(nome, cpf, idade, serie, ra);

        int registro = 0;
        double salario = 0.0;
        Professor professor = new Professor(nome, cpf, idade, registro, salario);


        while(true){

            int opcao = 0;

            System.out.println("Qual operação vai fazer? Digite:");
            System.out.println("1 - Cadastrar Aluno. \n" +
                    "2 - Cadastrar Professor. \n" +
                    "3 - Checar Lista de Alunos. \n" +
                    "4 - Checar Lista de Professores. \n" +
                    "5 - Sair. \n");

            opcao = scanner.nextInt();

            if (opcao == 1){


                System.out.println("Digite o Nome");
                aluno.setNome(scanner.nextLine());
                aluno.setNome(scanner.nextLine());
                System.out.println("Digite o CPF");
                aluno.setCpf(scanner.nextLine());
                System.out.println("Digite a Idade");
                aluno.setIdade(Integer.parseInt(scanner.nextLine()));
                System.out.println("Digite a Série");
                aluno.setSerie(scanner.nextLine());
                aluno.setSerie(scanner.nextLine());
                aluno.setRa(random.nextInt(100000000));
                aluno.alunoArrayList.add(aluno);


            }
            else if (opcao == 2) {
                System.out.println("Digite o Nome");
                professor.setNome(scanner.nextLine());
                professor.setNome(scanner.nextLine());
                System.out.println("Digite o CPF");
                professor.setCpf(scanner.nextLine());
                System.out.println("Digite a Idade");
                professor.setIdade(scanner.nextInt());
                System.out.println("Digite o Salario");
                professor.setSalario(scanner.nextDouble());
                professor.setRegistro(random.nextInt(100000000));
                professor.professorArrayList.add(professor);

            }
            else if (opcao == 3) {

                for (Aluno alunos: aluno.alunoArrayList) {
                    System.out.println("Nome" + alunos.getNome());
                    System.out.println("Idade: " + alunos.getIdade());
                    System.out.println("Série: " + alunos.getSerie());
                    System.out.println("CPF: " + alunos.getCpf());
                    System.out.println("Registro do Aluno: "+ alunos.getRa());

                }

            }
            else if (opcao == 4) {

                for (Professor professores: professor.getProfessorArrayList()
                     ) {
                    System.out.println("Nome: " + professores.getNome());
                    System.out.println("Idade: " + professores.getIdade());
                    System.out.println("CPF: " + professores.getCpf());
                    System.out.println("Registro: " + professores.getRegistro());
                    System.out.println("Sakrio: " + professores.getSalario());
                    
                }
            }
            else if (opcao == 5) {
                System.out.println("ENCERRANDO \n");
                break;
            }
            else {
                System.out.println("ERRO! USE APENAS NUMEROS 1 - 2 - 3 - 4 - 5. \n");
            }
        }
    }
}