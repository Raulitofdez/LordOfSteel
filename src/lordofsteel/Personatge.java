/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lordofsteel;

/**
 *
 * @author raulf
 */
   
   public abstract class Personatge {

    protected int forca;
    protected int constitucio;
    protected int velocitat;
    protected int intelligencia;
    protected int sort;
    
    // Estadístiques derivades
    protected int ps;  // Punts de salut
    protected int pd;  // Punts de dany
    protected int pa;  // Probabilitat d'atac
    protected int pe;  // Probabilitat d'esquivar

    //Nivell personatge
    protected int pex; // Punts d'experiència
    protected int nivell; // Nivell
    protected int calcularNivell(int nivell) {
        switch (nivell) {
            case 1:
                return 100;
            case 2:
                return 200;
            case 3:
                return 500;
            case 4:
                return 1000;
            case 5:
                return 2000;
            default:
                return 0; 
        }
    }
    // Arma
    protected Arma arma;

    // Nom
    protected String nom;
    
    public Personatge(String nom, int forca, int constitucio, int velocitat,
                      int intelligencia, int sort, Arma arma) {
        this.nom           = nom;
        this.forca         = forca;
        this.constitucio   = constitucio;
        this.velocitat     = velocitat;
        this.intelligencia = intelligencia;
        this.sort          = sort;
        this.arma          = arma;
        calculaEstadistiquesSecundaries();
    }
                      
    protected void calculaEstadistiquesSecundaries() {
        ps = constitucio + forca;
        pd = (forca + arma.getWpow())/4;
        pa = intelligencia + sort;
        pe = velocitat + sort + intelligencia;
    }

    
    public int getForca() {
        return forca;
    }

    public int getConstitucio() {
        return constitucio;
    }

    public int getVelocitat() {
        return velocitat;
    }

    public int getIntelligencia() {
        return intelligencia;
    }

    public int getSort() {
        return sort;
    }

    public int getPs() {
        return ps;
    }

    public int getPd() {
        return pd;
    }

    public int getPa() {
        
         return pa;   
        
    }

    public int getPe() {
        return pe;
    }

    public Arma getArma() {
        return arma;
    }

    
    public void setForca(int forca) {
        this.forca = forca;
    }

    public void setConstitucio(int constitucio) {
        this.constitucio = constitucio;
    }

    public void setVelocitat(int velocitat) {
        this.velocitat = velocitat;
    }

    public void setIntelligencia(int intelligencia) {
        this.intelligencia = intelligencia;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public void setPs(int ps) {
        this.ps = ps;
    }

    public void setPd(int pd) {
        this.pd = pd;
    }

    public void setPa(int pa) {
        this.pa = pa;
    }

    public void setPe(int pe) {
        this.pe = pe;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public int getPex() {
        return pex;
    }

    public void setPex(int pex) {
        this.pex = pex;
    }
    public int getNivell() {
        return nivell;
    }

    public void setNivell(int nivell) {
        this.nivell = nivell;
    }
    public void restauraPS(){
        this.ps =(int)(this.ps * 1.10);
    }
    public void subirDeNivel() {
        this.nivell++;
        this.constitucio++;
        this.forca++;
        this.intelligencia++;
        this.sort++;
        this.velocitat++;
        if (this.nivell == 1) {
            this.pex -= 100;
        } else if (this.nivell == 1) {
            this.pex -= 200;
        } else if (this.nivell == 2) {
            this.pex -= 500;
        } else if (this.nivell == 3) {
            this.pex -= 1000;
        } else if (this.nivell == 4) {
            this.pex -= 2000;
        }
        calculaEstadistiquesSecundaries();
    }

  

    public int getPexSiguienteNivel() {
        switch (this.nivell) {
            case 0:
                return 100;
            case 1:
                return 200;
            case 2:
                return 500;
            case 3:
                return 1000;
            case 4:
                return 2000;
            default:
                return Integer.MAX_VALUE;
        }
    }

    public boolean atacPAReduida(Dau... daus) {
        int sum = 0;
        for (Dau dau : daus) {
            sum += dau.llencar();
        }

        int paReducida = getPa() / 2;

        return sum > paReducida;
    }

}
   

