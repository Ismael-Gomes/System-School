import java.util.Scanner;

public class Escola {
    public static void main(String[] args) {
        String nome, matricula, sexo, dataNascimento, curso, disciplina;
        double salario;
       Scanner sc = new Scanner(System.in);
       Pessoa p = null;
       System.out.print("Deseja fazer o cadastro de um Professor (P) ou Aluno (A)? ");
       String escolha = sc.next();
       switch (escolha) {
        case "P":
        case "p":
            System.out.print("Digite o nome: ");
            nome = sc.next();
            System.out.print("Digite a matricula: ");
            matricula = sc.next();
            System.out.print("Digite o sexo: ");
            sexo = sc.next();
            System.out.print("Digite a data de nascimento: ");
            dataNascimento = sc.next();
            System.out.print("Digite a disciplina: ");
            disciplina = sc.next();
            System.out.print("Digite o salario: ");
            salario = sc.nextDouble();
            p = new Professor(nome, matricula, sexo, dataNascimento, disciplina, salario);
            System.out.print(p.toString());
        break;
        case "A":
        case "a":
            System.out.print("Digite o nome: ");
            nome = sc.next();
            System.out.print("Digite a matricula: ");
            matricula = sc.next();
            System.out.print("Digite o sexo: ");
            sexo = sc.next();
            System.out.print("Digite a data de nascimento: ");
            dataNascimento = sc.next();
            System.out.print("Digite o curso: ");
            curso = sc.next();
            p = new Aluno(nome, matricula, sexo, dataNascimento, curso);
            System.out.print(p.toString());
        break;
        default:
            System.out.println("Opção Inválida!");
        break;
       } 
    }
}
