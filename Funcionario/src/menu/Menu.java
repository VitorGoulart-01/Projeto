package menu;
import java.util.Scanner;
import empresa.*;






public class Menu {
    private int escolha;

    public int getescolha(){
        return escolha;

    }
   
    Scanner sc = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);
    Scanner sc3 = new Scanner(System.in);
    Scanner sc4 = new Scanner(System.in);

    Funcionario comi = new Comissionado(null, 0, 0, 9, null, null, 0);
    Funcionario hori = new Horista(null, 0, 0, 9, null, null, 0);
    Funcionario assa = new Assalariado(null, 0, 0, 9, null, null, 0);

     GeradorDeId idFuncionario = new GeradorDeId();


     
    
    public void exibir(){
        
        escolha = sc.nextInt();


         switch(escolha){
            case 1:

            System.out.println("---Cadastro de funcionario---");

            System.out.println("Tipo de Funcionario");
            System.out.println("1. Horista ");
            System.out.println("2. Comissionado ");
            System.out.println("3. Assalariado ");
            escolha = sc.nextInt();

            if(escolha == 1){
                System.out.println("---Funcinario horista---");
            System.out.println("Nome do Funcionario: ");
            hori.setnome(sc2.nextLine());
            System.out.println("Idade do Funcionario: ");
            hori.setidade(sc3.nextInt());
            System.out.println("CPF do Funcionario: ");
            hori.setcpf(sc4.nextFloat());
            System.out.println("Endereço do Funcionario: ");
            hori.setendereço(sc2.nextLine());
            System.out.println("Salario do Funcionario: ");
            hori.setsalario(sc3.nextDouble());
           hori.setID(GeradorDeId.gerarIdFuncionario(hori.getnome()));
            
            System.out.println("ID do funcionario " + hori.getID());
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
            escolha = sc.nextInt();

            switch(escolha){
                case 01:
                System.out.println(hori.getnome());
            }
            break;


            

           

           






         }
          


        


    }



}