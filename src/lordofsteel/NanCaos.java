/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lordofsteel;

/**
 *
 * @author raulf
 */
public class NanCaos extends Nan implements Caos {
   public NanCaos(String nom, int forca, int constitucio, int velocitat, int intelligencia, int sort, Arma arma){
        super(nom,forca,constitucio,velocitat,intelligencia,sort,arma);      
}
  @Override
public boolean atacPAReduida(Dau... daus) {
        int sum = 0;
        for (Dau dau : daus) {
            sum += dau.llencar();
        }

        int paReducida = getPa() / 2;

        return sum > paReducida;
    }
}