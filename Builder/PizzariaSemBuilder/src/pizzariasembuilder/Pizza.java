/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzariasembuilder;

/**
 *
 * @author derik
 */
public class Pizza {
    
    private String sabor;
    private boolean borda;
    
    public Pizza(){
        
    }

    public Pizza(String sabor, boolean borda) {
        this.sabor = sabor;
        this.borda = borda;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public boolean isBorda() {
        return borda;
    }

    public void setBorda(boolean borda) {
        this.borda = borda;
    }

    @Override
    public String toString() {
        String text = "Sem borda";
        if (borda == true){
           text = "Com borda";
        }
        return "Pizza de: "+ sabor +" - "+ text;
    }
    
    
    
}
