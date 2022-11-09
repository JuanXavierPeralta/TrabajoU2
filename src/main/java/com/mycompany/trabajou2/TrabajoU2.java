/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.trabajou2;

/**
 *
 * @author Portal Center
 */
public class TrabajoU2 {
    public static void main(String[] args) {
        
       var xavier = new Dueño(" 0106255445 "," Xavier Ordoñez ",3,2);
        xavier.nuevoTelefono(" 0983256375 ", 5, " Casa ", " Claro ",0);
        xavier.nuevoTelefono(" 0991285451 ",8," Fijo IP "," Movistar ",1);
        xavier.nuevoTelefono(" 0983142790 ",3," Movil "," Tuenti ",2);
        
        xavier.recetas(" Finalin ", 20, " Tomar cada 12 horas ", 0);
        xavier.recetas(" Aspirina ", 15, " Tomar  cada 24 horas ", 1);
        xavier.mostarinfo(); 
    }
}