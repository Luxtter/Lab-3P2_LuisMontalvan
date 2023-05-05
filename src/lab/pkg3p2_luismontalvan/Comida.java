/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg3p2_luismontalvan;

/**
 *
 * @author luism
 */
public class Comida extends Producto{
    
    private String ven;

    public Comida() {
    
    }

    public Comida(String ven, String nombre, double precio) {
        super(nombre, precio);
        this.ven = ven;
    }

    public String getVen() {
        return ven;
    }

    public void setVen(String ven) {
        this.ven = ven;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return super.toString()+"Vencido: "+ven;
    }
    
}
