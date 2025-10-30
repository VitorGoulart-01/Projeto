package empresa;
import java.util.ArrayList;
import java.util.List;
import menu.Menu;

public class Informacoes {

    private List<Funcionario> funcionarioH;
    

    Menu men;

    public Informacoes( String nome, int idade, float cpf, int desempenho, String endereço, String ID, double salario ){
        super(nome, idade, cpf, desempenho, endereço, ID, salario);
        
        funcionarioC = new ArrayList<>();
        

    }

    // public void adicionarHorista(String nome, int idade, float cpf, int desempenho, String endereço, String ID, double salario ){
        
    //     funcionarioH.add(new Horista(nome, idade, cpf,  desempenho,  endereço,  ID,  salario));

    // }
    // public void adicionarComissionado(String nome, int idade, float cpf, int desempenho, String endereço, String ID, double salario ){
    //     funcionarioC.add(new Comissionado(nome, idade, cpf, desempenho, endereço, ID, salario));
    // }
    // public void adicionarAssalariado(String nome, int idade, float cpf, int desempenho, String endereço, String ID, double salario ){
    //     funcionarioA.add(new Assalariado(nome, idade, cpf, desempenho, endereço, ID, salario));

    // }
    // public void exibirFuncionario(){
    //     if( == 1){
    //         for(Funcionario f : funcionarioH){
    //             System.out.println(f);
    //         }
    //     }


    // }
 
   



}
