public class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome, double salario, String departamento, String cpf, String dataNascimento) {
        super(nome, salario, departamento, cpf, dataNascimento);
    }

    public void Programar() {
        System.out.println(nome + " está programando");
    }

    @Override
    public void MostrarDados() {
        super.MostrarDados();
        System.out.println("Cargo: Desenvolvedor");
    }

}