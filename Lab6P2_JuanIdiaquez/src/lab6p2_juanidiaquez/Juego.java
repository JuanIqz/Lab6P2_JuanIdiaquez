/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_juanidiaquez;

import java.util.Date;

/**
 *
 * @author juanf
 */
public class Juego {
    
    String Nombre;
    String Descripcion;
    Date Fecha;
    double Precio;
    String Estado;
    String Rentable;
    String Agregado;
    int CantD; 

    public String getNombre() {
        return Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public Date getFecha() {
        return Fecha;
    }

    public double getPrecio() {
        return Precio;
    }

    public String getEstado() {
        return Estado;
    }

    public String getRentable() {
        return Rentable;
    }

    public String getAgregado() {
        return Agregado;
    }

    public int getCantD() {
        return CantD;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public void setRentable(String Rentable) {
        this.Rentable = Rentable;
    }

    public void setAgregado(String Agregado) {
        this.Agregado = Agregado;
    }

    public void setCantD(int CantD) {
        this.CantD = CantD;
    }

    public Juego() {
    }

    public Juego(String Nombre, String Descripcion, Date Fecha, double Precio, String Estado, String Rentable, String Agregado, int CantD) {
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.Fecha = Fecha;
        this.Precio = Precio;
        this.Estado = Estado;
        this.Rentable = Rentable;
        this.Agregado = Agregado;
        this.CantD = CantD;
    }

    @Override
    public String toString() {
        return "Juego{" + "Nombre=" + Nombre + '}';
    }
    
    
}
