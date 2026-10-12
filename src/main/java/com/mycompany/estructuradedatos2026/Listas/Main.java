/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.estructuradedatos2026.Listas;

/**
 *
 * @author alumnog
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        ListaEnlazada listaAlumnos = new ListaEnlazada();
        
        String nodoJuanito = ("Juanito");
        String nodoMaria = ("Maria");
        String nodoLupita = ("Lupita");
        String nodoJuanita = ("Juanita");
        
        listaAlumnos.agregarInicio(nodoJuanito);
        listaAlumnos.agregarInicio(nodoMaria);
        listaAlumnos.agregarFinal(nodoLupita);
        listaAlumnos.agregarFinal(nodoJuanita);
        
        System.out.println("tamaño:" +listaAlumnos.cantidadNodos());
        listaAlumnos.mostrarLista();
        
    }
    
}
