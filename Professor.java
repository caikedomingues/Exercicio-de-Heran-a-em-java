
/*Declaração do scanner que ira ler os valores */
import java.util.Scanner;

/*A classe professor ira herdar métodos e atributos da classe pessoa */
public class Professor extends Pessoa {
    /* Atributos */
    private String especialidade;// ira guardar a matéria que o professor leciona
    private float salario;// ira guardar o valor do salário do professor

    /* Declaração de scanners */
    Scanner sal = new Scanner(System.in);// ira ller o valor do salario
    Scanner esp = new Scanner(System.in);// ira ler a especialidade do professor

    /* getters e setters */

    public void setEspecialidade(String e) {

        this.especialidade = e;
    }

    public String getEspecialidade() {

        return this.especialidade;
    }

    public void setSalario(float s) {

        this.salario = s;
    }

    public float getSalario() {

        return this.salario;
    }

    /* metodos */

    /* Ira pedir um valor ao usuário e atribuir esse valor ao usuário */
    public float receberAumento(float salario) {
        Scanner aums = new Scanner(System.in);// ira ler o valor do aumento
        Scanner opcaoAum = new Scanner(System.in);// ira ler se o usuário quer ou não dar aumento
        float aumen;// ira receber o valor do aumento
        String opcao;// Ira receber a opção do usuário em dar um aumento
        System.out.println("Você quer dar aumento a esse professor(a)? ");
        opcao = opcaoAum.nextLine();// leitura do valor

        /* se o usuário escolher sim */
        if (opcao.equals("sim")) {
            /* ira pedir um valor */
            System.out.println("Qual o valor do aumento: ");
            aumen = aums.nextFloat();// ira ler e receber o valor
            System.out.println("Aumento de " + aumen + " executado");
            this.salario = this.salario + aumen;// no final a variável salario, tera o valor do aumento somado com o
                                                // atual
        } else {
            /* Caso contrário, o salario permanece o mesmo */
            System.out.println("O salario permanece igual");
        }
        /* retorno com o resultado final */
        return this.salario;
    }

    /*
     * método para cadastro de profesor, com a utilização de atributos e métodos da
     * classe Pessoa e da propria classe
     */
    public void cadastrarProfessor() {

        System.out.println("Qual o nome do professor: ");
        setNome(nom.nextLine());

        System.out.println("Qual a idade do professor: ");
        setIdade(id.nextInt());

        System.out.println("Qual o sexo do professor: ");
        setSexo(sex.nextLine());

        System.out.println("Salario do professor: ");
        setSalario(sal.nextFloat());

        System.out.println("Especialidade desse professor: ");
        setEspecialidade(esp.nextLine());

        System.out.println("---------------------------------------");

        receberAumento(salario);

        System.out.println("---------------------------------------");

    }

    /* Impressão dos valores cadastrados */
    public void detalhesProfessor() {

        System.out.println("nome do professor: " + getNome());
        System.out.println("Idade do professor: " + getIdade());
        System.out.println("Sexo do professor: " + getSexo());
        System.out.println("Salário atual do professor: " + getSalario());
    }
}