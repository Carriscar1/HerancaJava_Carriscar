public class Estagiario extends Funcionario {
    public Estagiario(String nome, double salario, String departamento, String cpf, String dataNascimento) {
        super(nome, salario, departamento, cpf, dataNascimento);
    }

    public void fazerTarefa() {
        System.out.println(nome + " está fazendo tarefas de estágio.");
    }

    @Override
    public void MostrarDados() {
        super.MostrarDados();
        System.out.println("Cargo: Estagiário");
    }
}
