/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.estructuradedatos2026;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * @author alumnog
 */
public class Pila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Deque pilaO = new ArrayDeque(); //Pila de objetos Object
        Deque <String> pila = new ArrayDeque(); //Pila de String
        
        //push: apilar elementos
        pila.push("Fresa");
        pila.push("Mango");
        pila.push("Manzana");
        pila.push("Ciruela");
        pila.push("Mango");
        pila.push("Tamarindo");
        //peek: ver la cima sin retirarlo
        System.out.println("Cima: "+pila.peek());
        //pop: desapilar
        System.out.println("Retirado: "+pila.pop());
        System.out.println("Nueva Cima: "+pila.peek());
        
        
        System.out.println("---hay "+pila.size()+" frutas en la pila---");
        while(!pila.isEmpty()){ //pila.isEmpty() !=true
            System.out.println("procesado: "+pila.pop());
        }
        
        System.out.println("Ya no hay nada en la pila!!!");
        
    }
    
}
