/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lordofsteel;

/**
 *
 * @author raulf
 */
    public class Mitja extends Personatge {
    
     public Mitja(String nom, int forca, int constitucio, int velocitat,
            int intelligencia, int sort, int nivell, Arma arma) {

        super(nom, forca, constitucio, velocitat, intelligencia, sort, nivell, arma);
    }
    

    @Override
    protected void calculaEstadistiquesSecundaries() {
        super.calculaEstadistiquesSecundaries();
        pe = velocitat+ sort + intelligencia + forca;
    }

}
