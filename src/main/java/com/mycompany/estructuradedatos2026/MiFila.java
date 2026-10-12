/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.estructuradedatos2026;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author alumnog
 */
public class MiFila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Queue<String> colaOXXO =new LinkedList<>();
        colaOXXO.offer("Maria");
        colaOXXO.offer("Pepe");
        colaOXXO.offer("Juan");
        colaOXXO.offer("Ana");
        colaOXXO.offer("Carlos");
        
        System.out.println("Siguiente");
        System.out.println(colaOXXO.peek());
        
        
        System.out.println("Atendido: ");
        System.out.println(colaOXXO.poll());
        
        System.out.println("\n Quedan: "+ colaOXXO.size());
        
        System.out.println("\n Esta vacia? "+ colaOXXO.isEmpty());
        
        System.out.println(colaOXXO);
        
    }
    
}
