/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 *
 * @author Ivàn
 */
public class Inventario {

    public String toString() {
        return "Inventario:" + "\n NùmeroPlatos=" + numeroPlatos + "\n Nùmeros de mesas=" + numeroMesas + "\n Nùmero de sillas=" + numeroSillas + '.';
    }
    private int numeroPlatos;
    private int numeroSillas;
    private int numeroMesas;

    public void setnumeroPlatos(int numeroPlatos) {
        this.numeroPlatos = numeroPlatos;
    }

    public void setnumeroSillas(int numeroSilas) {
        this.numeroSillas = numeroSillas;
    }

    public void setnumeroMesas(int numeroMesas) {
        this.numeroMesas = numeroMesas;
    }

    public int getnumeroSillas() {
        return this.numeroSillas;
    }

    public int getnumeroMesas() {
        return this.numeroMesas;
    }

    public int getnumeroPlatos() {
        return this.numeroPlatos;
    }
}
