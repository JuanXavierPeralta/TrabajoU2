/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajou2.modelo;

/**
 *
 * @author Portal Center
 */
public class Owner {
    
    private String cedula;
    private String nombre;
    private int cantidadTelefonos;
    private Telefono [] telefonoList;

    public Owner(String cedula, String nombre, int cantidadTelefonos) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.cantidadTelefonos = cantidadTelefonos;
        this.telefonoList = new Telefono[this.cantidadTelefonos];
    }

    public void nuevoTelefono(String numero, int extension, String tipoTelefono, String operadora, int posicion){
        var telefono = new Telefono(numero, extension, tipoTelefono, operadora);
        this.telefonoList[posicion]=telefono;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadTelefonos() {
        return cantidadTelefonos;
    }

    public void setCantidadTelefonos(int cantidadTelefonos) {
        this.cantidadTelefonos = cantidadTelefonos;
    }

    public Telefono[] getTelefonoList() {
         return telefonoList;
     }

     public void setTelefonoList(Telefono[] telefonoList) {
        this.telefonoList = telefonoList;
    }

    @Override
    public String toString() {
        var retorno = "Due\u00f1o{" + "cedula=" + cedula 
                + ", nombre=" + nombre 
                + ", cantidadTelefonos=" + cantidadTelefonos 
                +  '}'+"\n";
         
        for (var i =0;i<this.cantidadTelefonos;i++){
            retorno+=this.telefonoList[i].toString()+"\n";
        }
         
        return retorno;
    }   
}

    
    
    public void setTelefonoList(Telefono[] telefonoList) {
        this.telefonoList = telefonoList;
    }

    
    
    public void mostarinfo() {
        System.out.println( "Due\u00f1o{" 
                + "cedula=" + cedula 
                + ", nombre=" + nombre 
                + ", cantidadTelefonos=" + cantidadTelefonos 
                + ", telefonoList=");
        }
        
        
        
        for(int i=0; i<this.cantidadTelefonos;i++){
        System.out.println(this.telefonoList[i].toString());
        
        }
        
        
        
        
        System.out.println(" Recetas: ");
        for(int i=0; i<this.cantidadRecetas;i++){
            
        System.out.println(this.resetini[i].toString());
    }
}  
