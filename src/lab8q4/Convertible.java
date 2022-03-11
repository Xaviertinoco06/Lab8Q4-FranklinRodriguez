/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8q4;

/**
 *
 * @author xavie
 */
public class Convertible extends Carros{
    
    public Convertible(String nombreCorredor, int ID, String tipoCarro, int Distancia, java.awt.Color Color) {
        super(nombreCorredor, ID, tipoCarro, Distancia, Color);
        velocidadMinima=20;
        velocidadMaxima=200;
        
        
    }
    
}
