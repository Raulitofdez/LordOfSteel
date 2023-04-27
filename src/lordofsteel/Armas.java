/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lordofsteel;

/**
 *
 * @author raulf
 */
public abstract class Armas {
       
    // Atributs principals
    protected String tipus;
    protected int poder;
    protected int velocitat;
  
    public abstract void mostrarNomTipus();
    
    public int getPoder() {
        return poder;
    }

    public int getVelocitat() {
        return velocitat;
    }
    public String getTipus(){
        return tipus;
    }
    
    public Armas(String tipus, int poder, int velocitat) {
        this.poder        = poder;
        this.velocitat     = velocitat;
  
        
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public void setVelocitat(int velocitat) {
        this.velocitat = velocitat;
    }
                      
 

}
