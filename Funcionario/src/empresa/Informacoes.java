package empresa;
import java.util.ArrayList;
import java.util.List;
import menu.Menu;

public class Informacoes extends Funcionario{

    private List<Funcionario> funcionarioH;
    private List<Funcionario> funcionarioC;
    private List<Funcionario> funcionarioA;

    Menu men;

    public Informacoes( String nome, int idade, float cpf, int desempenho, String endereço, String ID, double salario ){
        super(nome, idade, cpf, desempenho, endereço, ID, salario);
        funcionarioH = new ArrayList<>();
        funcionarioC = new ArrayList<>();
        funcionarioA = new ArrayList<>();

    }
    public void adicionarHorista(String nome, int idade, float cpf, int desempenho, String endereço, String ID, double salario ){
        funcionarioH.add(new Horista(nome, idade, cpf,  desempenho,  endereço,  ID,  salario));

    }
    public void adicionarComissionado(String nome, int idade, float cpf, int desempenho, String endereço, String ID, double salario ){
        funcionarioC.add(new Comissionado(nome, idade, cpf, desempenho, endereço, ID, salario));
    }
    public void adicionarAssalariado(String nome, int idade, float cpf, int desempenho, String endereço, String ID, double salario ){
        funcionarioA.add(new Assalariado(nome, idade, cpf, desempenho, endereço, ID, salario));

    }
    public void exibirFuncionario(){
        if(men.getescolha() == 1){
            for(Funcionario f : funcionarioH){
                System.out.println(f);
            }
        }


    }
 
   



}
