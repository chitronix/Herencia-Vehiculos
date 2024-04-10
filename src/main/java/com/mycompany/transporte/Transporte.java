/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.transporte;

/**
 *
 * @author repty
 */
public class Transporte {

    public static void main(String[] args) {
      //crear un vehiculo terrestre
      vehiculoTerrestre vehiculoTerreste=new vehiculoTerrestre("matel","Terreneitro",4);
      vehiculoAcuatico vehiculoAcuatico=new vehiculoAcuatico ("Lancha","Yamaha","Motor prr prr");
      vehiculoEspacial vehiculoEspacial=new vehiculoEspacial ("nasa","apolo11",72);
      vehiculoAereo vehiculoAereo=new vehiculoAereo("planet","tundra",4);
              
      System.out.println("informacion del vehiculo Terestre");
      vehiculoTerreste.mostrarInfo();
      
      System.out.println("informacion del vehiculo Acuatico");
      vehiculoAcuatico.mostrarInfo();
      
      System.out.println("informacion del vehiculo Espacial");
      vehiculoEspacial.mostrarInfo();
      
      System.out.println("informacion del vehiculo Aereo");
      vehiculoAereo.mostrarInfo();
    }
}
