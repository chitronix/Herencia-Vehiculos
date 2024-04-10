/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.transporte;

/**
 *
 * @author repty
 */
public class vehiculoAcuatico extends vehiculo{
    private String tipoPropulsion;
    
public vehiculoAcuatico(String marca,String modelo,String tipoPropulsion){
    super(marca,modelo);
    this.tipoPropulsion=tipoPropulsion;
    
}
public void mostrarInfo(){
    super.mostrarInfo();
    System.out.println("Tipo de propulsion"+tipoPropulsion);
}

    void mostrarInfor() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}