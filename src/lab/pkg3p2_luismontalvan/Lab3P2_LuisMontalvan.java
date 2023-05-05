/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab.pkg3p2_luismontalvan;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author luism
 */
public class Lab3P2_LuisMontalvan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList();
        ArrayList<Producto> listacomp = new ArrayList();
        Scanner pochita = new Scanner(System.in);
        int opc = 0;
        while (opc != 8) {
            System.out.print("--Menu--\n1.Agregar Comida"
                    + "\n2.Agregar Bebida"
                    + "\n3.Modificar Productos"
                    + "\n4.Eliminar Producto"
                    + "\n5.Mostrar Producto"
                    + "\n6.Generar Compra"
                    + "\n7.Registro Compras"
                    + "\n8.Salir"
                    + "\nElegir una opcion: ");
        }
        String nombre = "";
        double precio = 0;
        switch (opc) {
            case 1:
                pochita = new Scanner(System.in);
                System.out.print("Ingrese el nombre del producto: ");
                nombre = pochita.nextLine();
                pochita = new Scanner(System.in);
                System.out.print("Ingrese el precio del producto: ");
                precio = pochita.nextDouble();
                System.out.println("--Estado del producto--"
                        + "\n1.Vencido"
                        + "\n2.No vencido"
                        + "\nElija una opcion: ");
                pochita = new Scanner(System.in);
                int vencido = pochita.nextInt();
                String ven = "";
                if (vencido == 1) {
                    ven = "Si";
                } else {
                    ven = "No";
                }
                productos.add(new Comida(ven, nombre, precio));
                break;
            //menu opcion 1
            case 2:
                pochita = new Scanner(System.in);
                System.out.print("Ingrese el nombre del producto: ");
                nombre = pochita.nextLine();
                pochita = new Scanner(System.in);
                System.out.print("Ingrese el precio del producto: ");
                precio = pochita.nextDouble();
                System.out.print("Ingrese la cantidad de ml del producto: ");
                pochita = new Scanner(System.in);
                int ml = pochita.nextInt();
                productos.add(new Bebida(ml, nombre, precio));
                break;
            //menu opcion 2
            case 3:
                String cadena = "";
                for (Producto t : productos) {
                    cadena += productos.indexOf(t) + ". " + t + "\n";
                }
                System.out.print("--Productos--\n" + cadena + "Elija el producto a modificar");
                pochita = new Scanner(System.in);
                int pos = pochita.nextInt();
                if (pos >= 0 && pos < productos.size()) {
                    if (productos.get(pos) instanceof Comida) {
                        System.out.print("--Modificar--"
                                + "\n1.Nombre"
                                + "\n2.Precio"
                                + "\n3.Vencimiento"
                                + "\nElija una opcion: ");
                        pochita = new Scanner(System.in);
                        int opcm = pochita.nextInt();
                        switch (opcm) {
                            case 1:
                                pochita = new Scanner(System.in);
                                System.out.print("Ingrese el nombre del producto: ");
                                ((Comida) productos.get(pos)).setNombre(pochita.nextLine());
                                break;
                            case 2:
                                pochita = new Scanner(System.in);
                                System.out.print("Ingrese el precio del producto: ");
                                ((Comida) productos.get(pos)).setPrecio(pochita.nextDouble());
                                break;
                            case 3:
                                System.out.println("--Estado del producto--"
                                        + "\n1.Vencido"
                                        + "\n2.No vencido"
                                        + "\nElija una opcion: ");
                                pochita = new Scanner(System.in);
                                int vencid = pochita.nextInt();
                                String venc = "";
                                if (vencid == 1) {
                                    venc = "Si";
                                } else {
                                    venc = "No";
                                }
                                ((Comida) productos.get(pos)).setVen(venc);
                                break;
                            default:
                                throw new AssertionError();
                        }
                    } else {
                        System.out.print("--Modificar--"
                                + "\n1.Nombre"
                                + "\n2.Precio"
                                + "\n3.Tamano"
                                + "\nElija una opcion: ");
                        pochita = new Scanner(System.in);
                        int opcm = pochita.nextInt();
                        switch (opcm) {
                            case 1:
                                pochita = new Scanner(System.in);
                                System.out.print("Ingrese el nombre del producto: ");
                                ((Bebida) productos.get(pos)).setNombre(pochita.nextLine());
                                break;
                            case 2:
                                pochita = new Scanner(System.in);
                                System.out.print("Ingrese el precio del producto: ");
                                ((Bebida) productos.get(pos)).setPrecio(pochita.nextDouble());
                                break;
                            case 3:
                                System.out.print("Ingrese la cantidad de ml del producto: ");
                                pochita = new Scanner(System.in);
                                ((Bebida)productos.get(pos)).setMl(pochita.nextInt());
                                break;
                            default:
                                throw new AssertionError();
                        }
                    }
                } else {
                    System.out.println("Posicion no valida");
                }
                break;
            //menu opcion 3
            case 4:
                String cadena2 = "";
                for (Producto t : productos) {
                    cadena2 += productos.indexOf(t) + ". " + t + "\n";
                }
                System.out.print("--Productos--\n" + cadena2 + "Elija el producto a eliminar");
                pochita = new Scanner(System.in);
                int pose = pochita.nextInt();
                if (pose>=0&&pose<productos.size()) {
                    productos.remove(pose);
                }
                break;
            //menu opcion 4
            case 5:
                String cadena3 = "--Productos--\n\n--Comidas--\n";
                for (int i = 1; i < productos.size(); i++) {
                    if (productos.get(i)instanceof Comida) {
                        cadena3 += i+". "+productos.get(i-1);
                    }
                }
                cadena3 += "\n--Bebidas--\n";
                for (int i = 1; i < productos.size(); i++) {
                    if (productos.get(i)instanceof Bebida) {
                        cadena3 += i+". "+productos.get(i-1);
                    }
                }
                break;
            //menu opcion 5
            case 6:
                String cadena4 = "";
                for (Producto t : productos) {
                    cadena4 += productos.indexOf(t) + ". " + t + "\n";
                }
                System.out.print("--Productos--\n"+cadena4);
                break;
            //menu opcion 6
            case 7:
                //algo
                break;
            //menu opcion 7
            default:
                throw new AssertionError();
        }
    }

}
