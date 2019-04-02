/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.inicio;

import ec.edu.ups.clases.Personal;
import ec.edu.ups.clases.Menu;
import ec.edu.ups.clases.Facturacion;
import ec.edu.ups.clases.Reservacion;
import ec.edu.ups.clases.Inventario;
import java.util.Scanner;

/**
 *
 * @author Ivàn
 */
public class Inicio {

    public static void main(String[] args) {
        Menu m = new Menu();
        Personal p = new Personal();
        Inventario i = new Inventario();
        Facturacion f = new Facturacion();
        Reservacion r = new Reservacion();
        Scanner x = new Scanner(System.in);
        int opc;

        System.out.println("");
        do {
            System.out.println("Menu");
            System.out.println("1. Dato del menu de la comida.");
            System.out.println("2. Dato del empleado.");
            System.out.println("3. Datos de Inventario.");
            System.out.println("4. Ingrese datos de Factura.");
            System.out.println("5. Dato de la reservacion.");
            System.out.println("6. Mostrar todos los datos ingresados.");

            do {
                System.out.print("Ingrese su opcion: ");
                opc = x.nextInt();
            } while (opc < 0 && opc > 6);

            switch (opc) {
                case 1:
                    String nombSec,
                     nombCo;
                    double cCom;
                    System.out.print("Ingrese el nombre de la comida: ");
                    nombCo = x.next();
                    System.out.print("Ingrese el costo de " + nombCo + ": ");
                    cCom = x.nextDouble();
                    System.out.print("Ingre tipo de comida: ");
                    nombSec = x.next();
                    m.setnombreSeccion(nombSec);
                    m.setnombreComida(nombCo);
                    m.setcostoComida(cCom);
                    break;

                case 2:
                    String nombEmple;
                    double entrada,
                     sueldo,
                     salida;
                    System.out.print("Ingrese el nombre del empleado: ");
                    nombEmple = x.next();
                    System.out.print("Hora de entrada: ");
                    entrada = x.nextDouble();
                    System.out.print("Ingrese el sueldo: ");
                    sueldo = x.nextDouble();
                    System.out.print("Hora de salida: ");
                    salida = x.nextDouble();
                    p.setsalidaEmple(salida);
                    p.setnombreEmpleado(nombEmple);
                    p.setentradaEmpelado(entrada);
                    p.setsueldoEmpleado(sueldo);
                    break;

                case 3:
                    int nump,
                     numme,
                     nums;
                    System.out.print("Ingrese el nùmero platos: ");
                    nump = x.nextInt();
                    System.out.print("Ingrese el nùmero de mesas: ");
                    numme = x.nextInt();
                    System.out.print("Ingrese el nùmero de sillas: ");
                    nums = x.nextInt();
                    i.setnumeroPlatos(nump);
                    i.setnumeroSillas(numme);
                    i.setnumeroMesas(nums);
                    break;

                case 4:
                    String n;
                    int v,
                     ce;
                    System.out.print("Ingrese el nombre del cliente: ");
                    n = x.next();
                    System.out.print("Ingrese la cèdula: ");
                    ce = x.nextInt();
                    System.out.print("Ingrese valos total a pagar: ");
                    v = x.nextInt();

                    f.setnombreCli(n);
                    f.setnumeroCedula(ce);
                    f.setvalorPagar(v);
                    break;

                case 5:
                    int mR,
                     cR;
                    double horR;
                    System.out.print("Ingrese mesa de reservacion: ");
                    mR = x.nextInt();
                    System.out.print("Ingrese el codig de reservacion: ");
                    cR = x.nextInt();
                    System.out.print("Ingrese hora de reservacion: ");
                    horR = x.nextDouble();

                    r.setnumeroMesaReservacion(mR);
                    r.setcodigoReservacion(cR);
                    r.sethorarioReservacion(horR);
                    break;

                case 6:
                    System.out.println(m);
                    System.out.println(p);
                    System.out.println(i);
                    System.out.println(f);
                    System.out.println(r);
                    break;

            }
            System.out.println("");
        } while (opc > 0 && opc < 6);
    }
}
