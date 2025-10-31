package empresa;
import java.util.Scanner;

public class Assalariado extends Funcionario  {
    Scanner sc = new Scanner(System.in);

    

    public Assalariado (String nome, int idade, float cpf, String endereço, String ID, double salario ){
        super(nome, idade, cpf,  endereço,  ID,  salario);

    }
    
    //@Override
    public void pagamentoum(double bonus){
       System.out.println("Dar um Bonus ao Funcionario?\n " + "1. sim / 2. não");
       int escolha = sc.nextInt();
       


        if(escolha == 1){
            this.salario =+ valor;
            System.out.println("Funcionario Recebeu um bonus\n" +  " Salario: R$ "  + this.salario);
            

        }else if(escolha == 2 ){
            this.salario = 1518;
            System.out.println("Salario: R$ " + this.salario);

            


        }
        
        else{
            System.out.println("Desempenho nao informado");
        }
        




    }



}