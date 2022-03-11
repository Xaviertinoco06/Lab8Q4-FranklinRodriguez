/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8q4;

import java.awt.Color;

/**
 *
 * @author xavie
 */
public class Carros {
    private String nombreCorredor;
    private int ID;
    private String tipoCarro;
    private int Distancia;
    private Color Color;
 int velocidadMinima;
 int velocidadMaxima;
    
    
    

    public Carros(String nombreCorredor, int ID, String tipoCarro, int Distancia,Color Color) {
        this.nombreCorredor = nombreCorredor;
        this.ID = ID;
        this.tipoCarro = tipoCarro;
        this.Distancia = Distancia;
        this.Color = Color;
    }

    public String getNombreCorredor() {
        return nombreCorredor;
    }

    public void setNombreCorredor(String nombreCorredor) {
        this.nombreCorredor = nombreCorredor;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTipoCarro() {
        return tipoCarro;
    }

    public void setTipoCarro(String tipoCarro) {
        this.tipoCarro = tipoCarro;
    }

    public int getDistancia() {
        return Distancia;
    }

    public void setDistancia(int Distancia) {
        this.Distancia = Distancia;
    }

    public Color getColor() {
        return Color;
    }

    public void setColor(Color Color) {
        this.Color = Color;
    }

    @Override
    public String toString() {
        return "Carros{" + "nombreCorredor=" + nombreCorredor + ", ID=" + ID + ", tipoCarro=" + tipoCarro + ", Distancia=" + Distancia + ", Color=" + Color + '}';
    }
    
    
    
    
    
    
}
