/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg3p2_luismontalvan;

/**
 *
 * @author luism
 */
public class Bebida extends Producto{
    private int ml;

    public Bebida() {
        super();
    }

    public Bebida(int ml) {
        this.ml = ml;
    }

    public Bebida(int ml, String nombre, double precio) {
        super(nombre, precio);
        this.ml = ml;
    }

    public int getMl() {
        return ml;
    }

    public void setMl(int ml) {
        this.ml = ml;
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
        return super.toString()+"Tamano: "+ml+"ml";
    }
    
}
