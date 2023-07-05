
/*Classe responsável por criar atributos e métodos do aluno */

/*Declaração do scanner que lera valores */
import java.util.Scanner;

/*A classe aluno ira herdar atributos e métodos da classe Pessoa */
public class Aluno extends Pessoa {

    private String matricula;// ira guardar o status da matricula
    private String curso;// ira guardar o nome do curso

    /* Declaração de scanners */
    Scanner nomCurso = new Scanner(System.in);// Ira ler os cursos que o usuario digitou
    Scanner verMat = new Scanner(System.in);// ira verificar o status da matricula;
    Scanner nom = new Scanner(System.in);// ira verificar o nome do aluno
    Scanner id = new Scanner(System.in);// ira verificar a idade do aluno
    Scanner sex = new Scanner(System.in);// ira verificar o sexo do aluno

    /* metodo construtor */
    public Aluno() {
        /*
         * A matricula por padrão estara aberta, até que o usuário mude o valor da
         * matricula.
         */
        this.matricula = "Aberta";
    }

    /* getters e setters */

    public void setMatricula(String m) {

        this.matricula = m;
    }

    public String getMatricula() {

        return this.matricula;
    }

    public void setCurso(String c) {

        this.curso = c;
    }

    public String getCurso() {

        return this.curso;

    }

    /* metodo que ira verificar o curso do aluno */
    public void VerificarCurso() {
        System.out.println("Qual o curso do aluno: ");
        this.curso = nomCurso.nextLine();
    }

    /* método responsável por fechar a matricula */
    public void fechaMatricula() {
        /* A matricula recebera fechada caso o usuário acione esse método */
        this.matricula = "fechada";
    }

    /* impressão dos dados do aluno após o cadastro */
    public void detalhesAluno() {

        System.out.println("Nome do aluno: " + this.getNome());
        System.out.println("idade do aluno: " + this.getIdade());
        System.out.println("Sexo do aluno: " + this.getSexo());
        System.out.println("Curso do aluno: " + this.getCurso());
        System.out.println("Status da matricula: " + this.getMatricula());

    }

}
