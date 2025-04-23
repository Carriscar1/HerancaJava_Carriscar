public class Funcionario extends Pessoa {
    String nome;
    double salario;
    String departamento;

    public Funcionario(String nome, double salario, String departamento, String cpf, String dataNascimento) {
        super(cpf, dataNascimento);
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }

    public void MostrarDados() {
        System.out.println("Nome:" + nome);
        System.out.println("salario:" + salario);
        System.out.println("departamento:" + departamento);
    }

    public void BaterPonto() {
        System.out.println(nome + " bateu o ponto");
    }
}
