package Programa2;

public class Professor extends Pessoa{
   private String matricula;

   public Professor (String nome, int ano_nascimento,String email, String matricula) {
       super(nome, ano_nascimento,email);
       this.matricula = matricula;
   }
    public String getMatricula(){
       return matricula;
    }
    public void setMatricula(String matricula){
       this.matricula = matricula;
    }
    public String toString(){
       return super.toString() +"\n Matricula: "+ this.matricula;
    }
}


