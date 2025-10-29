package menu;
import java.util.Scanner;
import empresa.*;







public class Menu {
    // private int escolha;

    // public int getescolha(){
    //     return escolha;

    // }
   
    Scanner sc = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);
    Scanner sc3 = new Scanner(System.in);
    Scanner sc4 = new Scanner(System.in);

    Funcionario comi = new Comissionado(null, 0, 0, 9, null, null, 0);
   Informacoes info = new Informacoes(null, 0, 0, 9, null, null, 0);
    Funcionario assa = new Assalariado(null, 0, 0, 9, null, null, 0);

     GeradorDeId idFuncionario = new GeradorDeId();


     public void exibirEscolha( ){
        System.out.println("-----EMPRESA-----");
        System.out.println("1. Cadastrar novo Funcionario");
        System.out.println("2. Exibir informaçoes do Funcionario");
        System.out.println("3. Pagamento do mes");
        System.out.println("4. Sair");
        System.out.println("---------------");

     }
    
    public void exibir(int escolha){
        
        // escolha = sc.nextInt();


         switch(escolha){
            case 1:

            System.out.println("---Cadastro de funcionario---");

            System.out.println("Tipo de Funcionario");
            System.out.println("1. Horista ");
            System.out.println("2. Comissionado ");
            System.out.println("3. Assalariado ");
            escolha = sc2.nextInt();

            if(escolha == 1){
                System.out.println("---Funcinario horista---");
            System.out.println("Nome do Funcionario: ");
            info.setnome(sc3.nextLine());
            sc3.nextLine();
            System.out.println("Idade do Funcionario: ");
            info.setidade(sc3.nextInt());
            sc3.nextLine();
            System.out.println("CPF do Funcionario: ");
            info.setcpf(sc4.nextFloat());
            System.out.println("Endereço do Funcionario: ");
            info.setendereço(sc3.nextLine());
            sc3.nextLine();
            System.out.println("Salario do Funcionario: ");
            info.setsalario(sc4.nextDouble());
                info.setID(idFuncionario.gerarIdFuncionario(info.getnome()));
            
            System.out.println("ID do funcionario " + info.getID());
            escolha = 0;

            }else if(escolha == 2){
                System.out.println("---Funcinario Comissionado---");
            System.out.println("Nome do Funcionario: ");
            comi.setnome(sc4.nextLine());
            System.out.println("Idade do Funcionario: ");
            comi.setidade(sc2.nextInt());
            System.out.println("CPF do Funcionario: ");
            comi.setcpf(sc3.nextFloat());
            System.out.println("Endereço do Funcionario: ");
            comi.setendereço(sc4.nextLine());
            System.out.println("Salario do Funcionario: ");
            comi.setsalario(sc2.nextDouble());
            comi.setID(GeradorDeId.gerarIdFuncionario(comi.getnome()));
            
            System.out.println("ID do funcionario " + comi.getID());
            escolha = 0;

            }else if(escolha == 3){
            System.out.println("---Funcionario Assalariado---");
            System.out.println("Nome do Funcionario: ");
            assa.setnome(sc3.nextLine());
            System.out.println("Idade do Funcionario: ");
            assa.setidade(sc4.nextInt());
            System.out.println("CPF do Funcionario: ");
            assa.setcpf(sc2.nextFloat());
            System.out.println("Endereço do Funcionario: ");
            assa.setendereço(sc3.nextLine());
            assa.setID(GeradorDeId.gerarIdFuncionario(assa.getnome()));
            
            System.out.println("ID do funcionario " + assa.getID());
            escolha = 0;
            

            }else{
                System.out.println("Erro OPÇAO INVALIDA");
                escolha = 0;
            }
            break;

            case 02:
             System.out.println("Tipo de Funcionario");
            System.out.println("1. Horista ");
            System.out.println("2. Comissionado ");
            System.out.println("3. Assalariado ");
            // escolha = sc.nextInt();

            switch(escolha){
                case 01:
                    info.exibirFuncionario();

            }
            break;


            

           

           






         }
          


        


    }



}