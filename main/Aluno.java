public class Aluno extends Pessoa{
    private String curso;
    public Aluno(String nome, String matricula, String sexo, String dataNascimento, String curso){
        super(nome, matricula, sexo, dataNascimento);
        this.curso = curso;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    @Override
    public String toString() {
        return "\n       Aluno\n-------------------\n" + super.toString() 
        + "\nCurso: " + curso + "\n";
    }
    
}
