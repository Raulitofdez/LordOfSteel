/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lordofsteel;

/**
 *
 * @author raulf
 */
public class MitjaOrdre extends Mitja implements Ordre{
     public MitjaOrdre(String nom, int forca, int constitucio, int velocitat,
            int intelligencia, int sort, int nivell, Arma arma) {

        super(nom, forca, constitucio, velocitat, intelligencia, sort, nivell, arma);
    }
     public void restaurarPS() {
        this.ps = (int) (this.ps * 1.10);
    }
}
