/*Exercicio de herança em programação orientada de objetos */

/*Nessa classe, iremos instanciar os objetos que tem os atributos nome, idade e sexo em comum */

/*Import  */
import java.util.Scanner;

public class Pessoa {
    /* Atributos */
    private String nome;
    private int idade;
    private String sexo;

    /* declaração de scanners */
    Scanner nom = new Scanner(System.in);
    Scanner id = new Scanner(System.in);
    Scanner sex = new Scanner(System.in);

    /* metodo principal */
    public static void main(String[] args) {

        int escolha;// ira guardar a opção de cadastro escolhida
        String cadmais;// Serve para o usuário decidir se quer cadastrar mais alguem
        /* Declaraçaõ de scanners */
        Scanner opcao = new Scanner(System.in);// ira ler a opção de cadastro do usuário
        Scanner cadMaisUm = new Scanner(System.in);// ira verificar se o usuário quer cadastrar mais alguém
        /* Instanciação de objetos */
        Aluno a1 = new Aluno();
        Funcionario f1 = new Funcionario();
        Professor p1 = new Professor();
        /* Criação das instruções do usuário */
        System.out.println("Que categoria de usuário você quer cadastrar");
        System.out.println("Informe 1 para cadastrar um aluno");
        System.out.println("Informe 2 para cadastrar um funcionário");
        System.out.println("Informe 3 para cadastrar um professor");
        /* Leitura da opção de cadastro escolhida */
        escolha = opcao.nextInt();
        /*
         * Estrutura condicional que ira verificar se a opção escolhida e gerar um
         * formulário
         */
        if (escolha == 1) {// Cadastro de aluno

            // Não é maneira mais correta, já que eu deveria ter feito tudo na classe aluno
            Scanner fechaMat = new Scanner(System.in);// ira verificar se a matrivula deve ser fechada
            Scanner verifNiver = new Scanner(System.in);// ira verificar se o aluno faz aniversário hoje
            String verifFechamat;// Ira verificar a opção informada pelo usuário
            String niver;// ira receber o valor informado pelo usuário

            a1.CadastrarAluno();// chamada do método de cadastro para alunos
            a1.VerificarCurso();// chamada do metodo que ira verificar o curso que o aluno esta cursando
            System.out.println("----------------------------------------");

            System.out.println("Você vai querer fechar essa matricula? ");
            verifFechamat = fechaMat.nextLine();// ira verificar a opção escolhida
            System.out.println("-----------------------------------------");

            /*
             * se o usuário quiser fechar a matricula, o sistema informara o usuário e
             * chamara os métodos
             */
            if (verifFechamat.equals("sim")) {
                System.out.println("Matricula fechada com sucesso, verifique a situação em detalhes");
                a1.fechaMatricula();// método responsável por fechar matricula
                a1.detalhesAluno();// detalhes do aluno após o fechamneto
                System.out.println("------------------------------------------");
            } else {
                // se o usuário não quiser, a matricula permanecera aberta
                System.out.println("A matricula esta aberta");

                System.out.println("------------------------------------------");

                a1.detalhesAluno();// método que imprimi os detalhes do aluno atualizados
                System.out.println("------------------------------------------");
            }

            System.out.println("O aluno esta fazendo aniversário hoje?");
            niver = verifNiver.nextLine();// Ira verificar se o aluno esta fazendo aniversário hoje
            /* Caso o aluno faça aniversário hoje ele ira chamar os métodos */
            if (niver.equals("sim")) {

                System.out.println("Parabens, verifique a atualização de idade em detalhes");
                a1.fazerAniversario();// método responsável por atribuir idade ao aluno
                a1.detalhesAluno();// ira imprimir os detalhes do aluno atualizado
            } else {
                /* Caso contrário a idade não será alterada */
                System.out.println("A idade não sera alterada");
            }
        } else if (escolha == 2) {// cadastro de funcionários

            /* Declaraçaõ de scanners */
            Scanner verifiNiver = new Scanner(System.in);// ira verificar se o funcionário esta fazendo aniversário hoje
            String niver;// Ira receber o valor informado

            f1.cadastrarFunconario();// chamda do método de cadastro de funcionários
            f1.detalhesFuncionario();// método que ira imprimir os detalhes atualizados do funcionário

            System.out.println("O funcionário faz aniversário  hoje?");
            niver = verifiNiver.nextLine();// leitura do valor recebido
            /*
             * Estrutura que ira verificar o resultado, se for sim, ele ira chamar o método
             */
            if (niver.equals("sim")) {

                f1.fazerAniversario();// método que ira atribuir idade ao usuário

                System.out.println("-------------------------------------------");

                f1.detalhesFuncionario();// ira imprimir os detalhes atualizados do funcionário
            } else {
                /* caso a resposta seja não, a idade não será modificada */
                System.out.println("A idade não sera alterada");
            }

        } else if (escolha == 3) {// cadastro de professores

            /* declaração de scanners */
            Scanner verifiNiver = new Scanner(System.in);// Scanner que ira verificar se o professor faz aniversário
                                                         // hoje
            String niver;// ira receber o valor informado
            p1.cadastrarProfessor();// método que ira cadastrar professores
            p1.detalhesProfessor();// método que imprimi os detalhes atualizados dos professores

            System.out.println("O professor(a) faz aniversário hoje");
            niver = verifiNiver.nextLine();// leitura do valor informado

            /* Estrutura que ira verifcar os valores informados */
            /* se for sim ele chamara o método */
            if (niver.equals("sim")) {

                p1.fazerAniversario();// método responsável por atribuir idade ao usuário

                System.out.println("-------------------------------------------");

                p1.detalhesProfessor();// imprimir os detalhes atualizados do professor

            } else {
                /* Caso contrário, a idade não sera modificada */
                System.out.println("A idade não sera atualizada");
            }

        } else {
            /* Caso o valor informado seja diferente dos valores de cadastro */
            System.out.println("o valor informado é inválido");
        }

        System.out.println("Você quer cadastrar mais um usuário? ");
        cadmais = cadMaisUm.nextLine();// ira ler os resultados

        /* Ira verificar se o usuário quer cadastrar mais alguém */
        while (cadmais.equals("sim")) {
            /* se o resultado for sim, ele repetira todo o processo */
            System.out.println("Que categoria de usuário você quer cadastrar");
            escolha = opcao.nextInt();

            if (escolha == 1) {
                Scanner fechaMat = new Scanner(System.in);
                Scanner verifNiver = new Scanner(System.in);
                String verifFechamat;
                String niver;
                a1.CadastrarAluno();
                a1.VerificarCurso();
                System.out.println("----------------------------------------");

                System.out.println("Você vai querer fechar essa matricula? ");
                verifFechamat = fechaMat.nextLine();
                System.out.println("-----------------------------------------");

                if (verifFechamat.equals("sim")) {
                    System.out.println("Matricula fechada com sucesso, verifique a situação em detalhes");
                    a1.fechaMatricula();
                    a1.detalhesAluno();
                    System.out.println("------------------------------------------");
                } else {
                    System.out.println("A matricula esta aberta");

                    System.out.println("------------------------------------------");

                    a1.detalhesAluno();
                    System.out.println("------------------------------------------");
                }

                System.out.println("O aluno esta fazendo aniversário hoje?");
                niver = verifNiver.nextLine();

                if (niver.equals("sim")) {

                    System.out.println("Parabens, verifique a atualização de idade em detalhes");
                    a1.fazerAniversario();
                    a1.detalhesAluno();
                } else {

                    System.out.println("A idade não sera alterada");
                }
            } else if (escolha == 2) {
                /* Declaraçaõ de scanners */
                Scanner verifiNiver = new Scanner(System.in);
                String niver;

                f1.cadastrarFunconario();
                f1.detalhesFuncionario();

                System.out.println("O funcionário faz aniversário  hoje?");
                niver = verifiNiver.nextLine();

                if (niver.equals("sim")) {

                    f1.fazerAniversario();
                    f1.detalhesFuncionario();
                } else {
                    System.out.println("A idade não sera alterada");
                }

            } else if (escolha == 3) {

                /* declaração de scanners */
                Scanner verifiNiver = new Scanner(System.in);
                String niver;
                p1.cadastrarProfessor();
                p1.detalhesProfessor();

                System.out.println("O professor(a) faz aniversário hoje");
                niver = verifiNiver.nextLine();

                if (niver.equals("sim")) {

                    p1.fazerAniversario();
                    p1.detalhesProfessor();

                } else {

                    System.out.println("A idade não sera atualizada");
                }

            } else {
                System.out.println("o valor informado é inválido");
            }

            System.out.println("Você quer cadastrar mais um usuário? ");
            cadmais = cadMaisUm.nextLine();

        }
    }

    /* getters e setters */
    public void setNome(String n) {

        this.nome = n;
    }

    public String getNome() {

        return this.nome;
    }

    public void setIdade(int i) {

        this.idade = i;
    }

    public int getIdade() {

        return this.idade;
    }

    public void setSexo(String s) {

        this.sexo = s;
    }

    public String getSexo() {

        return this.sexo;
    }

    /* metodos */
    /* metodo que devia ter feito na classe Aluno */
    public void CadastrarAluno() {
        System.out.println("Nome do Aluno: ");
        this.nome = nom.nextLine();

        System.out.println("Idade do aluno: ");
        this.idade = id.nextInt();

        System.out.println("Sexo do aluno(a): ");
        this.sexo = sex.nextLine();

    }

    /* metodo de atribuir idade */
    public void fazerAniversario() {

        System.out.println("Parabens, confira a atualização da sua idade nos detalhes");

        this.idade = this.idade + 1;
    }

}