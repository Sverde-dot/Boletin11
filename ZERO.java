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
