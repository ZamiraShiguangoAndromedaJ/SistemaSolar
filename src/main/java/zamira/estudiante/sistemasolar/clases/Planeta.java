/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zamira.estudiante.sistemasolar.clases;

import zamira.estudiante.sistemasolar.enumeraciones.TipoPlaneta;

/**
 *
 * @author user
 */
public class Planeta {
    
      //Atributos
    public boolean exterior=false;
    public String nombre;
    public int cantidadSatelite;
    public double mKg;
    public double vkm3;
    public double km;
    public double distanciaMediaSol;
    public TipoPlaneta tipoPlaneta;
   // public boolean exterior=false;
    
    //CONSTRUCTOR Vacio * ES AQUEL QUE ME DA VALORES Iniciales AL OBJETO
   /* public Planeta(){
        
    }*/
    
    
    //CONSTRUCTOR NO VACIO
    
 /*   public Planeta(String nombre, int cantidadSatelite, double mKg, double vkm3, double km, double distanciaMediaSol, TipoPlaneta tipoPlaneta){
        this.cantidadSatelite=cantidadSatelite;
        this.nombre=nombre;
        this.mKg=mKg;
        this.vkm3=vkm3;
        this.distanciaMediaSol=distanciaMediaSol;
        this.tipoPlaneta=tipoPlaneta;
        
        
    }*/ public Planeta(String nombre, int cantidadSatelite, double mKg, double vkm3, double km, double distanciaMediaSol, TipoPlaneta tipoPlaneta) {
        this.nombre = nombre;
        this.cantidadSatelite = cantidadSatelite;
        this.mKg = mKg;
        this.vkm3 = vkm3;
        this.km = km;
        this.distanciaMediaSol = distanciaMediaSol;
        this.tipoPlaneta = tipoPlaneta;
        this.exterior();
    }

    /* public Planeta(){
    this.exterior();
    }*/
    //sintasis para utilizar un Metodo
    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cantidad de satelite: " + cantidadSatelite);
        System.out.println("Masa kilogramas: " + mKg);
        System.out.println("Volumen kilogramos cubicos: " + vkm3);
        System.out.println("Diametros kilogramos: " + km);
        System.out.println("Tipo Planeta:" + tipoPlaneta);
    }

    public double calcularDensidadPlaneta() {

        return mKg / vkm3;
    }

    public boolean exterior() {

        double maximo = 3.4;
        double distancia = 149597870;
        double limite = maximo * distancia;
       // boolean lucy= false;
        
        if(distanciaMediaSol>limite){
            exterior=true;
        
            /*lucy =true;*/   //Awui estabmos dando una variable respusta
            
        }

        return exterior;
    }

}
