/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwareT3;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class ctrlMetodosN {
    
    public tblNewton Newton(double xi,double errordeseado, int iteracion){
        ArrayList<csNewton> lista =  null;
        tblNewton tabla=null;
        double errorcalculado=1;
        int iteraciones = 0;
        double xanterior;
        
        lista=new ArrayList<csNewton>();
        while(errorcalculado>errordeseado){
            csNewton fila=new csNewton();
            fila.setIteracion(iteraciones+1);
            fila.setXi(xi);
            fila.setFxi(this.getFxi(fila.getXi()));
            fila.setFxr(this.getFxr(fila.getXi()));
            fila.setDivision(fila.getXi()-(fila.getFxi()/fila.getFxr()));
            fila.setError(this.errorcalculado(fila.getXi(),fila.getDivision()));
            errorcalculado=fila.getError();
            xanterior=xi;
            xi=fila.getDivision();
            fila.toString();
            lista.add(fila);
            iteraciones++;
        }
        tabla=new tblNewton(lista);
        return tabla;
        
    }
    double getFxi(double xi){
        return((Math.exp(-xi))-xi);
    }
    double getFxr(double xi){
        return(-(Math.exp(-xi))-1);
        //return (6*(xi*xi)-23.4*xi+11.7);
    }
    double errorcalculado(double xi,double division){
        return Math.abs(((division-xi)/division));
    }
}
