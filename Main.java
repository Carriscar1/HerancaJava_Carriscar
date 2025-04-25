import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---Cadastro de funcionários---");
        System.out.println("nome:");
        String Nome = scanner.next();

        System.out.println("CPF:");
        String Cpf = scanner.next();

        System.out.println("Data de nascimento: (escreva sem barras ex: 04072008)");
        String DataNascimento = scanner.next();

        System.out.println("Salário:");
        Double Salario = scanner.nextDouble();

        System.out.println("Departamento:");
        String Departamento = scanner.next();

        System.out.println("Cargo: 1 - Gerente\n 2 - Desenvolvedor\n 3 - Estagiário\n Escolha uma opção:");
        int Cargo = scanner.nextInt();

        Funcionario A;

        if (Cargo == 1) {
            A = new Gerente(Nome, Salario, Departamento, Cpf, DataNascimento);
        } else if (Cargo == 2) {
            A = new Desenvolvedor(Nome, Salario, Departamento, Cpf, DataNascimento);
        } else {
            A = new Estagiario(Nome, Salario, Departamento, Cpf, DataNascimento);
        }

        System.out.println("---Dados do Funcionário---");
        A.MostrarDados();

        if (A instanceof Gerente) {
            ((Gerente) A).RealizarReuniao();
        } else if (A instanceof Desenvolvedor) {
            ((Desenvolvedor) A).Programar();
        } else if (A instanceof Estagiario) {
            ((Estagiario) A).fazerTarefa();
        }

        A.BaterPonto();

        scanner.close();

    }
}