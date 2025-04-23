public class Pessoa {
    String cpf;
    String dataNascimento;

    public Pessoa(String cpf, String dataNascimento) {
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;

    }

    public void MostrarDados() {
        System.out.println("CPF:" + cpf);
        System.out.println("Data de nascimento:" + dataNascimento);

    }
}
