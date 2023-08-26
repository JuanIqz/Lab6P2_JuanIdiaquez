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
public class Portatil extends Consola{
    
    int TamanoP;
    int Bateria;
    String Estuche;



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

    
    
    public int getTamanoP() {
        return TamanoP;
    }

    public int getBateria() {
        return Bateria;
    }

    public String isEstuche() {
        return Estuche;
    }

    public void setTamanoP(int TamanoP) {
        this.TamanoP = TamanoP;
    }

    public void setBateria(int Bateria) {
        this.Bateria = Bateria;
    }

    public void setEstuche(String Estuche) {
        this.Estuche = Estuche;
    }

    public Portatil() {
    }

    public Portatil(int TamanoP, int Bateria, String Estuche, int Id, String Fabricante, int ADU, double Precio, String Modelo) {
        super(Id, Fabricante, ADU, Precio, Modelo);
        this.TamanoP = TamanoP;
        this.Bateria = Bateria;
        this.Estuche = Estuche;
    }



    @Override
    public String toString() {
        return "Portatil{" + "TamanoP=" + TamanoP + ", Bateria=" + Bateria + ", Estuche=" + Estuche + '}';
    }
    
    
}
