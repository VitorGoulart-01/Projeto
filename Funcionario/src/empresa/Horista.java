package empresa;


public class Horista extends Funcionario{

    public Horista (String nome, int idade, float cpf, int desempenho, String endereço, String ID, double salario ){
        
        super(nome, idade, cpf,  desempenho,  endereço,  ID,  salario);


    }  

    @Override
    public void pagamentoum(double valor){
        if(valor >= 160){

            this.salario = valor * 20;// 20 $R por  horas de trabalhos

        
            valor = valor * 0.10;// bonus
            System.out.println("BONUS DE R$ " + valor);

            this.salario += (int) valor;

            System.out.println("SAlario total R$ " + this.salario);

            
            

        }else if(valor < 160 && valor != 0 ){
            valor = valor * 20;
            System.out.println("Horas minima para Bonus não completadas");
             System.out.println("Salario: R$ " + valor);


        }
         


    }
    public void exibirinformaçoes(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.cpf);
        System.out.println(this.endereço);
        System.out.println(this.ID);
        System.out.println(this.salario);
        System.out.println(this.desempenho);



    }
    

    



}