/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaria;

/**
 *
 * @author derik
 */
public class Pizza {
    
    private String sabor;
    private boolean borda;
    
    public String getSabor(){
        return sabor;
    }
    
    public boolean getborda(){
        return borda;
    }
    
    private Pizza(PizzaBuilder builder){
        this.sabor = builder.sabor;
        this.borda = builder.borda;
    }
    
    public static class PizzaBuilder{
        private String sabor;
        private boolean borda;
        
        public PizzaBuilder(String sabor){
            this.sabor = sabor;
        }

        public PizzaBuilder comBorda(boolean borda) {
            this.borda = borda;
            return this;
        }

        
        public Pizza build(){
            return new Pizza(this);
        }
        
    }

    @Override
    public String toString() {
        String text = "Sem borda";
        if (borda == true){
           text = "Com borda";
        }
        return "Sabor da pizza: "+sabor+" - "+text;
    }
}
