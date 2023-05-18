/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lordofsteel;

/**
 *
 * @author raulf
 */
 
   public class HumaCaos extends Huma implements Caos {
   public HumaCaos(String nom, int forca, int constitucio, int velocitat,
            int intelligencia, int sort, int nivell, Arma arma) {

        super(nom, forca, constitucio, velocitat, intelligencia, sort, nivell, arma);
    }
    @Override
    public boolean atacPAReduida(Dau... dados) {
        int sum = 0;
        for (Dau dau : dados) {
            sum += dau.llencar();
        }

        int paReducida = getPa() / 2;

        return sum < paReducida;
    }

   

}

