public class Pessoa {
    private String nome, matricula, sexo, dataNascimento;

    public Pessoa(String nome, String matricula, String sexo, String dataNascimento) {
        this.nome = nome;
        this.matricula = matricula;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Nome: " + nome 
        + "\nMatricula: " + matricula 
        + "\nSexo: " + sexo 
        + "\nData de Nascimento: " + dataNascimento;
    }
    
}
