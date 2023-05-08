/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lordofsteel;

/**
 *
 * @author raulf
 */
 public class Maia extends Personatge {

    public Maia(String nom,int forca, int constitucio, int velocitat,
                int intelligencia, int sort, Arma arma) {

        super(nom,forca,constitucio,velocitat,intelligencia,sort,arma);
    }

    @Override
    protected void calculaEstadistiquesSecundaries() {
        super.calculaEstadistiquesSecundaries();
        pa = intelligencia + sort + arma.wvel + velocitat;
    }
    
}


