/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin11.pkg1;

/**
 *
 * @author sverdecadilla
 */
public class ClasseA{
    private int valorPrimari=5;
    private int valorSecundari=10;
    private int vp; 
    private int vs;
    public ClasseA() {
    }
    
    public int getValorPrimari() {
        vp=valorPrimari;
        return vp;
    }

    public int getValorSecundari() {
        vs=valorSecundari;
        return vs;
    }

    public void setValorPrimari(int valorPrimari) {
        this.valorPrimari = valorPrimari;
    }

    public void setValorSecundari(int valorSecundari) {
        this.valorSecundari = valorSecundari;
    }
    
}
