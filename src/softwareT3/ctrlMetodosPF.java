 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwareT3;

import java.util.ArrayList;

/**
 *
 * @author cecilio
 */
public class ctrlMetodosPF {
    
     private double errorRelativo(double xActual, double xAnterior){
        return Math.abs((xActual-xAnterior)/xActual);
        
    }
    public tblPuntoFijo puntofijo(double erroDeseado, double Li,int itera){
         ArrayList<csPuntoFijo>lista1=null;
         tblPuntoFijo tabla1=null;
         double errorCalculado=1;
         int iteracion=0;
         
         int i;
         double Xi;
         double Gx;
         
         Xi=Li;
         Gx=this.getFx(Li);
         
         lista1=new ArrayList<csPuntoFijo>();
        
         while(errorCalculado>erroDeseado || itera>iteracion){
            
            csPuntoFijo fila=new csPuntoFijo();
            fila.setIteraciones(iteracion+1);
            fila.setXi(Xi);
            fila.setGx(Gx);
             System.out.println("Xi "+Xi);
             System.out.println("Gx "+Gx);
            
            errorCalculado=this.errorRelativo(Gx,Xi);
             System.out.println("Error calculador "+errorCalculado);
            Xi=Gx;
            Gx=this.getFx(Xi);
             System.out.println("Xi "+Xi);
             System.out.println("Gx "+Gx);
            fila.setError(errorCalculado);
            fila.toString();
            lista1.add(fila);
            iteracion++;
            
            
         }
         
        tabla1=new tblPuntoFijo(lista1);
             return tabla1;
         
        
         
    }
   public double getFx(double x){
       double  ac=x;
       
       int op=(int)Math.pow(x, 2);
       
      return (3+op)/2;
   }
}
