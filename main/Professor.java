public class Professor extends Pessoa{
    private String disciplina;
    private double salario;
    public Professor(String nome, String matricula, String sexo, String dataNascimento, String disciplina, double salario){
        super(nome, matricula, sexo, dataNascimento);
        this.disciplina = disciplina;
        this.salario = salario;
    }
    public String getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    @Override
    public String toString() {
        return "\n       Professor\n-------------------\n" + super.toString() 
        + "\nDisciplina: " + disciplina
        + "\nSalário: " + salario + "\n";
    }
}
