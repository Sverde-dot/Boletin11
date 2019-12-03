/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin12.pkg1;

/**
 *
 * @author sverdecadilla
 */
public class NumeroComplejo {
    public static final NumeroComplejo ZERO=new NumeroComplejo (0.0,0.0); 
    private double real;
    private double imaginario;

    public NumeroComplejo(double real, double imaginario){
        this.real = real;
        this.imaginario = imaginario;
    }

    public double getReal() {
        return real;
    }

    public double getImaginario() {
        return imaginario;
    }
    public NumeroComplejo add(NumeroComplejo c){
        c.imaginario=imaginario+c.imaginario;
        return c;
    }

    @Override
    public String toString() {
        return (ZERO.getImaginario()+"-"+ZERO.getReal()+"-"+getImaginario()+"-"+getReal());
    }
    
}
