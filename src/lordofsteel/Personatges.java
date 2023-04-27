/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lordofsteel;

/**
 *
 * @author raulf
 */
public abstract class Personatges {
   
    // Atributs principals
    protected double forca;
    protected double constitucio;
    protected double velocitat;
    protected double intelligencia;
    protected double sort;
    
    // Estadístiques derivades
    protected double ps;

    public abstract void mostrarNomTipus();
    
    public double getForca() {
        return forca;
    }

    public double getConstitucio() {
        return constitucio;
    }

    public double getVelocitat() {
        return velocitat;
    }

    public double getIntelligencia() {
        return intelligencia;
    }

    public double getSort() {
        return sort;
    }

    public double getPs() {
        return ps;
    }

    public double getPd() {
        return pd;
    }

    public double getPa() {
        return pa;
    }

    public double getPe() {
        return pe;
    }
    protected double pd;
    protected double pa;
    protected double pe;
    
    public Personatges(double forca, double constitucio, double velocitat,
                      double intelligencia, double sort) {
        this.forca         = forca;
        this.constitucio   = constitucio;
        this.velocitat     = velocitat;
        this.intelligencia = intelligencia;
        this.sort          = sort;

        calculaEstadistiquesDerivades();
    }
                      
    protected void calculaEstadistiquesDerivades() {
        ps = constitucio + forca;
        pd = forca/4;
        pa = intelligencia + sort;
        pe = velocitat + sort + intelligencia;
    }
    
    
}
