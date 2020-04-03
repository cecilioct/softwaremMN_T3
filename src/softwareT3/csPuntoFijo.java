/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwareT3;

/**
 *
 * @author cecilio
 */
public class csPuntoFijo {
    int iteraciones;
    double xi,gx,error;

    public int getIteraciones() {
        return iteraciones;
    }

    public double getXi() {
        return xi;
    }

    public double getGx() {
        return gx;
    }
    public double getError(){
        return error;
    }

    public void setIteraciones(int iteraciones) {
        this.iteraciones = iteraciones;
    }

    public void setXi(double xi) {
        this.xi = xi;
    }

    public void setGx(double gx) {
        this.gx = gx;
    }

    public void setError(double error) {
        this.error = error;
    }

    @Override
    //aquí se imprimer
    public String toString() {
        return "csPuntoFijo{" + "iteraciones=" + iteraciones + ", xi=" + xi + ", gx=" + gx + ", error=" + error + '}';
    }
    
    
}
