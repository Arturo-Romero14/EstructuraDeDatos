/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estructuradedatos2026.Listas;

/**
 *
 * @author alumnog
 */
public class Nodo {
    
    String valor;
    Nodo siguiente;
    
    public Nodo(String v){
        this.valor = v;
        this.siguiente = null;
    }
    
    public Nodo(String v, Nodo sig){
        this.valor = v;
        this.siguiente = sig;
    }
    
}
