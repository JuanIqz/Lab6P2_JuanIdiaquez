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
public class Estacionaria extends Consola{
    
    int NControles;
    String Almacenamiento;
    String Tconecciones;

    public int getNControles() {
        return NControles;
    }

    public String getAlmacenamiento() {
        return Almacenamiento;
    }

    public String getTconecciones() {
        return Tconecciones;
    }

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

    public void setNControles(int NControles) {
        this.NControles = NControles;
    }

    public void setAlmacenamiento(String Almacenamiento) {
        this.Almacenamiento = Almacenamiento;
    }

    public void setTconecciones(String Tconecciones) {
        this.Tconecciones = Tconecciones;
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

    public Estacionaria(int NControles, String Almacenamiento, String Tconecciones, int Id, String Fabricante, int ADU, double Precio, String Modelo) {
        super(Id, Fabricante, ADU, Precio, Modelo);
        this.NControles = NControles;
        this.Almacenamiento = Almacenamiento;
        this.Tconecciones = Tconecciones;
    }



    public Estacionaria() {
    }

    @Override
    public String toString() {
        return "Estacionaria{" + "NControles=" + NControles + ", Almacenamiento=" + Almacenamiento + ", Tconecciones=" + Tconecciones + '}';
    }
    
    
}
