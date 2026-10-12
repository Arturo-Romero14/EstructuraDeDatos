/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.estructuradedatos2026;

/**
 *
 * @author alumnog
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nombre = "Juanito";
        System.out.println(nombre);
       
        /*  Empieza indice 0;
            0 --> Juanito
            1 --> Luis
            2 -- Maria ... */
        String [] nombres = {"Juanito","Luis","Maria","Lupita"};
        System.out.println(nombres[1]);
        nombres[1] = "Luisito";
        System.out.println(nombres[1]);
        
        System.out.println("--IMPRIMIR TODOS LOS VALORES--");
        for(int i = 0; i<nombres.length; i++){
            System.out.println(i+": " + nombres[i]);
        }
        
        for(String n :nombres){
            System.out.println("Nombre: "+n);
        }
        
        String[] carreras = new String[10];
        carreras[0]="ISW";
        carreras[4]="LDG";
        carreras[8]="LIS";
        
        
        /*imprimir todas las carreras con for each*/
        for(String n: carreras){
            System.out.println("Carreras: "+n);
        }
    }
    
}
