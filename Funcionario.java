
/*declaração de scanners para ler os valores informados */
import java.util.Scanner;

/*A classe funcionario ira herdar os atributos e metodos da classe Pessoa */
public class Funcionario extends Pessoa {
    /* Atributos */
    private String setor;// ira guardar o setor do funcionário
    private boolean trabalhando;// ira mostrar o status do funcionario, ou seja, se ele esta ou não trabalhando

    /* Declaração de scanners */
    Scanner nom = new Scanner(System.in);// scanner para nomes
    Scanner id = new Scanner(System.in);// Scanner para idade
    Scanner sex = new Scanner(System.in);// scanner para sexo
    Scanner set = new Scanner(System.in);// Scanner para setor
    Scanner tra = new Scanner(System.in);// Scanner para trabalho

    /* getters e setters */

    public void setSetor(String s) {

        this.setor = s;

    }

    public String getSetor() {

        return this.setor;
    }

    public void setTrabalhando(boolean t) {

        this.trabalhando = t;
    }

    public boolean getTrabalhando() {

        return this.trabalhando;
    }

    /* metodos */
    /* Ira verificar se o funcionário */
    public void verificaTrabalho() {
        String verTraba;// ira guardar a resposta do usuário

        System.out.println("Ele esta exercendo a atividade no momento? ");
        verTraba = tra.nextLine();// ira ler os valores informados
        /* ira verificar o resultado e se for sim, a variável trabalhando recebe true */
        if (verTraba.equals("sim")) {

            this.trabalhando = true;
        } else {
            /* caso contrário, trabalhando recebe falso */
            this.trabalhando = false;
        }

    }

    /* responsável por realizar a troca de setor */
    public void mudarTrabalho() {
        Scanner troca = new Scanner(System.in);// ira verificar o valor informado pelo usuário
        Scanner novSetor = new Scanner(System.in);// ira receber o novo setor
        String verifTroca;// ira receber o valor passado pelo usuário
        System.out.println("Você pretende trocar ele de setor");
        verifTroca = troca.nextLine();// ira ler o valor passado

        /* se o usuário quiser trocar o setor */
        if (verifTroca.equals("sim")) {
            System.out.println("Informe o novo setor: ");
            this.setor = novSetor.nextLine();// a variavel setor ira receber novSetor com o scanner que contém a
                                             // resposta
            System.out.println("O funcionario(a) " + getNome() + " trocou de setor");// impressão do resultado

        } else {
            /* caso contrário, ele não irá realizar a troca */
            System.out.println("Troca de setor não realizada");
        }

    }

    /*
     * metodo que realizara o cadastro dos usuários utilizando atributos da classe
     * pessoa e atributos da própria classe
     */
    public void cadastrarFunconario() {

        System.out.println("Nome do funcionário: ");
        setNome(nom.nextLine());

        System.out.println("Qual a idade do funcionário: ");
        setIdade(id.nextInt());

        System.out.println("Qual o sexo do funcionário: ");
        setSexo(sex.nextLine());

        System.out.println("Qual setor o funcionário ocupa? ");
        this.setor = set.nextLine();

        verificaTrabalho();

        mudarTrabalho();
        System.out.println("----------------------------------------");
    }

    /* Impressão dos dados cadastrados */
    public void detalhesFuncionario() {

        System.out.println("Nome: " + getNome());
        System.out.println("idade: " + getIdade());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Setor: " + getSetor());
        System.out.println("Esta exercendo as atividades normalmente? " + getTrabalhando());
        System.out.println("setor atual: " + getSetor());
    }

}
