

import java.util.Scanner;
import menu.Menu;




public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Menu menu = new Menu();
        do{
            System.out.println("-----EMPRESA-----");
        System.out.println("1. Cadastrar novo Funcionario");
        System.out.println("2. Exibir informaçoes do Funcionario");
        System.out.println("3. Pagamento do mes");
        System.out.println("4. Sair");
        System.out.println("---------------");
        
        menu.exibir();

        }while(menu.getescolha() != 4);
        
       


        


        
        

        
        
        
    }
}
