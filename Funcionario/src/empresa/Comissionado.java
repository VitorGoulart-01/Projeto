package empresa;


public class Comissionado extends Funcionario{
    

    protected double taxa = 0.08; // %8

    public Comissionado (String nome, int idade, float cpf, String endereço, String ID, double salario ){
        super(nome, idade, cpf, endereço,  ID,  salario);


    }
   
    
    
    public void pagamentoum(double valor){
       
        if(valor >= 20000){ // se valor for igual ou maior que a meta de vendas
            System.out.println("Atingido a meta de vendas");
            valor = valor * this.taxa;// valor = Quanto vendas teve / taxa = A porcetagem da que vai receber que e 8%
            this.salario = valor ;// somando o valor da taxa de comissao no salario minimo

            System.out.println(valor );
            System.out.println(this.salario);


        }else{

             System.out.println("A meta de vendas nao atingida");
            valor = valor * this.taxa;// valor = Quanto vendas teve / taxa = A porcetagem da que vai receber que e 8%
            this.salario = valor ;// somando o valor da taxa de comissao no salario minimo

            System.out.println(valor );
            System.out.println(this.salario);



        }
     
        
        

    }

    public void exibirinformcoes(){

        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.cpf);
        System.out.println(this.endereço);
        System.out.println(this.ID);
        System.out.println(this.salario);
       
    }

}