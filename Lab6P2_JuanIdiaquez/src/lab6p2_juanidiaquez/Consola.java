/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_juanidiaquez;

import java.util.ArrayList;

/**
 *
 * @author juanf
 */
public class Consola {
    
    int Id;
    String Fabricante;
    int ADU;
    double Precio;
    ArrayList<Juego> Juegos = new ArrayList();
    String Modelo;

    public int getId() {
        return Id;
    }

    public String getFabricante() {
        return Fabricante;
    }

    public int getADU() {
        return ADU;
    }

    public double getPrecio() {
        return Precio;
    }

    public ArrayList<Juego> getJuegos() {
        return Juegos;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setFabricante(String Fabricante) {
        this.Fabricante = Fabricante;
    }

    public void setADU(int ADU) {
        this.ADU = ADU;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public void setJuegos(ArrayList<Juego> Juegos) {
        this.Juegos = Juegos;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public Consola() {
    }

    public Consola(int Id, String Fabricante, int ADU, double Precio, String Modelo) {
        this.Id = Id;
        this.Fabricante = Fabricante;
        this.ADU = ADU;
        this.Precio = Precio;
        this.Modelo = Modelo;
    }

    @Override
    public String toString() {
        return "Consola{" + "Id=" + Id + ", Fabricante=" + Fabricante + ", ADU=" + ADU + ", Precio=" + Precio + ", Juegos=" + Juegos + ", Modelo=" + Modelo + '}';
    }
    
    
    
}
