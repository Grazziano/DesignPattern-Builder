/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzariasembuilder;

import java.util.Scanner;

/**
 *
 * @author derik
 */
public class PizzariaSemBuilder {

     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PizzariaSemBuilder pizzaria = new PizzariaSemBuilder();
        
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
      Pizza pizza = new Pizza();
      String saborx;
      System.out.println("Digite o sabor desejado");
      saborx = input.nextLine();
      pizza.setSabor(saborx);
      pizza.setBorda(false);
      
      return pizza.toString();
      
  }
  
  public String pizzaComBorda(){
      Scanner input = new Scanner(System.in);
      Pizza pizza = new Pizza();
      String saborx;
      System.out.println("Digite o sabor desejado");
      saborx = input.nextLine();
      pizza.setSabor(saborx);
      pizza.setBorda(true);
      
      return pizza.toString();
      
  }
    
}
