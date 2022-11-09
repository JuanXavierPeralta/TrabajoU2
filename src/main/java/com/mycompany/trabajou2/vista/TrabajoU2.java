/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.trabajou2.vista;

import com.mycompany.trabajou2.modelo.Atencion;
import com.mycompany.trabajou2.modelo.Mascota;
import com.mycompany.trabajou2.modelo.Owner;
import java.time.LocalDate;

/**
 *
 * @author Portal Center
 */
public class TrabajoU2 {
    public static void main(String[] args) {

        var mauricio = new Owner("0103667754","Mauricio Ortiz",3);
        mauricio.nuevoTelefono("0984357604", 0, "Móvil", "tuenti",0);
        mauricio.nuevoTelefono("074078385",2,"Casa","Etapa",1);
        mauricio.nuevoTelefono("074135250",1287,"Fijo IP","Etapa",2);
         

         
         
        var mascota1=new Mascota(" Cholo "," pequeño"," pastor aleman ",5.0,mauricio);
         
        var uno= new Atencion(LocalDate.of(2022, Month.NOVEMBER, 7)," Dr.Jose ",20.5,mascota1,3);
        uno.nuevaReceta(" ciclofosfamida", 2, " tomar cada 8 horas ", 0);
        uno.nuevaReceta(" tetraciclina", 4, " tomar cada 12 horas ", 2);
        uno.nuevaReceta("  tobramicina", 1, " tomar uno vez al dia ", 1);
         
        System.out.println(mauricio.toString()); 
        System.out.println(mascota1.toString());
        System.out.println(uno.toString());
        
     }
}
