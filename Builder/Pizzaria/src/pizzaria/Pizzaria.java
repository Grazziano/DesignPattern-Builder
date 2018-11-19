package pizzaria;

import java.util.Scanner;
import pizzaria.Pizza.PizzaBuilder;

/**
 *
 * @author derik
 */
public class Pizzaria {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pizzaria pizzaria = new Pizzaria();
        
        int cont = 0;
        
        while(cont == 0){
            
            System.out.println("1. - Pedir Pizza tradicional ");
            System.out.println("2. - Pedir Pizza com borda recheada");
            System.out.println("3. - Finalizar");
            
            int option = input.nextInt();
            
            switch(option){
                case 1:
                    System.out.println(pizzaria.pizzaTradicional());
                    break;
                 
                case 2:
                     System.out.println(pizzaria.pizzaComBorda());
                    break;
                
                default:
                    System.out.println("byebye");
                    cont += 1;
                    break;
            }
            
        }
        
    }
    
  public String pizzaTradicional(){
      Scanner input = new Scanner(System.in);

      String saborx;
      System.out.println("Digite o sabor desejado");
      saborx = input.nextLine();
      Pizza pizza = new Pizza.PizzaBuilder(saborx)
              .comBorda(false)
              .build();
      
      return pizza.toString();
  }
  
  public String pizzaComBorda(){
      Scanner input = new Scanner(System.in);

      String saborx;
      System.out.println("Digite o sabor desejado");
      saborx = input.nextLine();
      Pizza pizza = new Pizza.PizzaBuilder(saborx)
              .comBorda(true)
              .build();
      
      return pizza.toString();
      
  }
    
}
