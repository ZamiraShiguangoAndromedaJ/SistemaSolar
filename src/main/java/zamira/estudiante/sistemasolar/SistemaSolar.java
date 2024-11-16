/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package zamira.estudiante.sistemasolar;

import zamira.estudiante.sistemasolar.clases.Planeta;
import zamira.estudiante.sistemasolar.enumeraciones.TipoPlaneta;

/**
 *
 * @author user
 */
public class SistemaSolar {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Planeta objPlaneta= new Planeta("Neotuno",1,2.33,4.555,5.77,8.99,TipoPlaneta.GASEOSO);
        //nombre del la clase, mi objeto , la palabrita new y planeta
        
        
        
        //dar valores 
        //objPlaneta.nombre="Neotuno";
        //objPlaneta.cantidadSatelite=16;
       /* objPlaneta.mKg=24;
        objPlaneta.vkm3=56;
        objPlaneta.km=40.244;
        objPlaneta.distanciaMediaSol=34;
        objPlaneta.tipoPlaneta=TipoPlaneta.GASEOSO;*/
        
        objPlaneta.imprimir();//llamar un metodo
        
        double densidad=objPlaneta.calcularDensidadPlaneta();
        System.out.println("La densidad es: "+densidad);
       
        
    }
    
   
    
}
