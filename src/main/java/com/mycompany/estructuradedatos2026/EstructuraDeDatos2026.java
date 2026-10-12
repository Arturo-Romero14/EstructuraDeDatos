/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estructuradedatos2026;

/**
 *
 * @author alumnog
 */
public class EstructuraDeDatos2026 {

    public static void main(String[] args) {
    
        
        System.out.println("HOLA JAVA");
        
        /**------------ ENTEROS ------------**/
        byte edad = 20;
        System.out.println("edad: " + edad);
        short year = 2006;
        System.out.println("Año: "+ year);
        int robux = 50000;
        System.out.println("Robux: "+ robux);
        System.out.println(robux+1000);
        System.out.println(robux-1000);
        System.out.println(robux/2);
        System.out.println(robux*2);
        System.out.println(++robux); //robux+1
        System.out.println(--robux); //robux-1
        System.out.println(robux==2); // es igual a 2? false
        System.out.println(robux>2);  //  es mayor a 2? true 
        System.out.println(robux<2); // es menor a 2? false






        long estrellas = 2000000000;
        System.out.println("restrellas: " + estrellas);
        /*** DECIMALES O FLOTANTES ***/
        double estatura =1.85;
        System.out.println("estatura: "+ estatura);
        float deuda = 9999.99f;
        System.out.println("Deuda IISON: $"+ deuda);
        /*** CARACTER ***/
        char grupo = 'a';
        char grupo2 = 'D';
        System.out.println("grupo: "+grupo);
        System.out.println(grupo);
        System.out.println(++grupo);
        System.out.println(++grupo);
        System.out.println(++grupo);
        System.out.println(grupo==grupo2);
        System.out.println(grupo<grupo2);
        System.out.println(grupo>grupo2);
        
        /*** Booleanos ***/
        boolean pago = true; //false
        System.out.println("pago? "+pago);
        System.out.println(pago == true);
        System.out.println(pago != true);
        System.out.println(pago == false);
        System.out.println(pago != false);
        System.out.println(true && true && true);
        System.out.println(5<2 && 'a'=='a' && 5.5!=2.5);
        System.out.println(5<2 && 'a'=='b' && 5.5!=2.5);
        System.out.println(5<2 || 'a'=='a' || 5.5!=2.5);
        
        
        System.out.println("Arturo Romero");   
        
        
        //Cadena de texto 
        String nombre = "Arturo Romero";
        System.out.println("nombre:" +nombre);
        
        System.out.println(nombre.charAt(0));
        System.out.println(nombre.charAt(5));
        System.out.println(nombre.length());
        
        for(int i=0; i<nombre.length();i++){
            System.out.println(nombre.charAt(i));
        }
        System.out.println(nombre.toLowerCase());
        System.out.println(nombre.toUpperCase());
        System.out.println(nombre.equals("Arturo Romero"));
        System.out.println(nombre.equals("ArtuRO Romero"));
        System.out.println(nombre.equalsIgnoreCase("ArtuRO Romero"));
        
        System.out.println("juanito@gmail.com".indexOf("@"));
        System.out.println("juanito@gmail.com".indexOf(".com"));
        System.out.println("afsfa.png".endsWith(".jpg") || "afsfa.png".endsWith(".png"));
        System.out.println("".isEmpty());//valida que el string este vacío
        System.out.println("".isBlank());//valida que este vacío y espacios en blanco
        System.out.println("conejo".replace("o", "e"));
        System.out.println("conejo".replaceFirst("o", "e"));
        System.out.println("Juanito".substring(3));
        System.out.println("Juanito".substring(3,5));
        
        
        
        //operaciones aritmeticas
        // - + * / ++ --
        
        //operaciones relacionales
        // == > < >= >= != ===
        
        //operaciones logicas
        // && and
        // || or
        
        Producto producto1;
        
        producto1 = new Producto(
                1,
                "Playera Maja Verde",
                "PM-V-M-01",
                'M',
                (byte)2,
                (short)2026,
                100,
                0.2f,
                1500,
                true);
        
        System.out.println("Producto: " + producto1.getNombre());
        System.out.println("Precio: " + producto1.getPrecioUnitario());
        
        /** CLASE BoletoAvion
         numeroTicket
         codigoReserva
         asientoFila
         asientoLetra
         distanciaKm
         altitud
         pesoEquipajeKg
         precioBoleto
         IncluyeEquipajeMano
         
          
         CLASE Paciente
         * 
         numeroSeguro
         nombreCompleto
         edad
         sexoBiologico
         Glucosa
         Glucosa;
         globulosRojos
         temperaturaCorporal
         dosisMedicamentoMl
         esAlergicoPenicilina
          
         
         */
        
        
        
    }
}
