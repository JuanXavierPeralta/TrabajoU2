/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.trabajou2.vista;

import com.mycompany.trabajou2.modelo.Atencion;
import com.mycompany.trabajou2.modelo.Mascota;
import com.mycompany.trabajou2.modelo.Dueño;

/**
 *
 * @author Portal Center
 */
public class TrabajoU2 {
    public static void main(String[] args) {
       
        var mauricio = new Dueño("0103617254","Mauricio Ortiz");
        mauricio.nuevoTelefono("0984347604", 0, "Móvil", "tuenti");
        mauricio.nuevoTelefono("074078385",2,"Casa","Etapa");
        mauricio.nuevoTelefono("074135250",1287,"Fijo IP","Etapa");
        
        var mascot = new Mascota("Mauricio","Perro","Golden",5.9,mauricio);
        
        var atencionnum1=new Atencion("Pedro", 50,mascot);
        atencionnum1.recetas("Finalin",6,"5 cada 4 horas");
        atencionnum1.recetas("Aspirina",8,"1 cada 21 horas");
        atencionnum1.recetas("Ratilin",21,"5 cada 47 horas");
        atencionnum1.recetas("Frizer",19,"2 cada 12 horas");
        atencionnum1.recetas("Procan",4,"13 cada 53 horas");
        
       System.out.println(atencionnum1.toString()+"\n");
       System.out.println(mauricio.toString());
    }
}
