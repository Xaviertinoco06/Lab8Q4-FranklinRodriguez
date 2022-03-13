/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8q4;

/**
 *
 * @author xavie
 */
public class McQueen extends Carros{
    
    public McQueen(String nombreCorredor, int ID, String tipoCarro, int Distancia, java.awt.Color Color) {
        super(nombreCorredor, ID, tipoCarro, Distancia, Color);
        velocidadMinima=30;
        velocidadMaxima=190;
        
    }

    @Override
    public String toString() {
        return "McQueen{" + '}';
    }
    
    
}
