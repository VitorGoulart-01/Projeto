package empresa;


public abstract class Funcionario implements Pagamento  {
    protected String nome;
    protected int idade;
    protected float cpf;
    protected Integer desempenho;// integer e uma variaçao do int, ocupa mais espaço mas permite
    protected String endereço;
    protected String ID;
    protected double salario;
    

    public Funcionario(String nome, int idade, float cpf, int desempenho, String endereço, String ID, double salario){
        //contrutor para definir os valores do funcionario

        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.desempenho = desempenho;
        this.endereço = endereço;
        this.ID = ID;
        this.salario = salario;

    }

    public void pagamentoum(double valor){
        

    }
    public void setnome(String nome){

        this.nome = nome;
    }
    public String getnome(){
        return nome;
    }
    public void setidade(int idade){
        this.idade = idade;
    }
    public void setcpf(float cpf){
        this.cpf = cpf;
    }
    public void setendereço(String endereço){
        this.endereço = endereço;
    }
    public void  setID(String ID){
        this.ID = ID;

    }
    public String getID(){
        return this.ID;
    }
    public void setsalario( double salario){
        this.salario = salario;
    }
    public String toString(){
        return nome + idade + cpf + desempenho + endereço + ID + salario;
    }

    
    

    

    public double getsalario(){
        return this.salario;
    }

    //public abstract void 

    

}