/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.transporte;

/**
 *
 * @author repty
 */
public class vehiculoEspacial extends vehiculo {
    private int numTurbinas;

public vehiculoEspacial(String marca,String modelo,int numTurbinas){
    super(marca,modelo);
    this.numTurbinas=numTurbinas;
}
public void mostrarInfo(){
    super.mostrarInfo();
    System.out.println("Numero de Turninas"+numTurbinas);
}
}
