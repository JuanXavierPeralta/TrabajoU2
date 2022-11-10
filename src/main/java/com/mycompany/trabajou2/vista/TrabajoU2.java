/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.trabajou2.vista;

import com.mycompany.trabajou2.modelo.Atencion;
import com.mycompany.trabajou2.modelo.Mascota;
import com.mycompany.trabajou2.modelo.Dueño;
import com.mycompany.trabajou2.modelo.Carrera;
import com.mycompany.trabajou2.modelo.Estudiante;
/**
 *
 * @author Portal Center
 */
public class TrabajoU2 {
         var mauricio = new Dueño("0103667754","Mauricio Ortiz");
        mauricio.nuevoTelefono("0984357604", 0, "Móvil", "tuenti");
        mauricio.nuevoTelefono("074078385",2,"Casa","Etapa");
        mauricio.nuevoTelefono("074135250",1287,"Fijo IP","Etapa");
        
        var mascot = new Mascota("Mauricio","Perro","Pastor Aleman",5.9,mauricio);
        
        var atencionnum1=new Atencion("Juan", 20,mascot);
        atencionnum1.recetas("Finalin",10,"1 cada 6 horas");
        atencionnum1.recetas("Aspirina",5,"5 cada 2 horas");
        atencionnum1.recetas("Finalin2",3,"3 cada 24 horas");
        atencionnum1.recetas("Sinovac",8,"1 cada 34 horas");
        atencionnum1.recetas("Fiazer",9,"2 cada 80 horas");
        
       System.out.println(atencionnum1.toString()+"\n");
       System.out.println(mauricio.toString());
    
    var juanito = new Estudiante("Juan ","0106121351");
    var pedrito= new Estudiante("Pedro","0106981543");
    var asignature = new Aignatura("Lenguaje","64 ciclos");
    asignature.listestudiante(Juan);
     asignature.listestudiante(Pedro);
     System.out.println(asignature.toString());
    }
    
}
