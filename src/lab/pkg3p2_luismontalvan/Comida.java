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
    private boolean vencimiento;
    private String ven;

    public Comida() {
    
    }

    public Comida(boolean vencimiento, String nombre, double precio) {
        super(nombre, precio);
        this.vencimiento = vencimiento;
    }

    public boolean isVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(boolean vencimiento) {
        if (vencimiento==true) {
            this.ven= "Si";
        }else{
            this.ven= "No";
        }
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
