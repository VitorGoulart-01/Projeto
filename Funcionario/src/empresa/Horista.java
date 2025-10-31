package empresa;


public class Horista extends Funcionario{

   protected double hora;



    public Horista (String nome, int idade, float cpf, String endereço, String ID, double salario ){
        
        super(nome, idade, cpf,  endereço,  ID,  salario);


    }  

    //@Override
    public void pagamentoum(){
        if(hora >= 160){

            this.salario = hora * 20;// 20 $R por  horas de trabalhos

        
            hora = hora * 0.10;// bonus
            System.out.println("BONUS DE R$ " + hora);

            this.salario += (int) hora;

            System.out.println("SAlario total R$ " + this.salario);

            
            

        }else if(hora < 160 && hora != 0 ){
            hora = hora * 20;
            System.out.println("Horas minima para Bonus não completadas");
             System.out.println("Salario: R$ " + hora);

        }
         


    }
    //@Override
    public void exibirinformcoes(){

        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.cpf);
        System.out.println(this.endereço);
        System.out.println(this.ID);
        System.out.println(this.salario);
       
    }
    public String toString(){
        return nome + idade + cpf  + endereço + ID + salario;
    }
    

    



}