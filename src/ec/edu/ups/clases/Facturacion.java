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
public class Facturacion {

    public String toString() {
        return "Facturacion:" + "\n Nombre Cliente=" + nombreCli + "\n Nùmero Cèdula=" + numeroCedula + "\n Valor a Pagar=" + valorPagar + '.';
    }
    private String nombreCli;
    private int numeroCedula;
    private int valorPagar;

    public void setnombreCli(String nombreCli) {
        this.nombreCli = nombreCli;
    }

    public void setnumeroCedula(int numeroCedula) {
        this.numeroCedula = numeroCedula;
    }

    public void setvalorPagar(int valorPagar) {
        this.valorPagar = valorPagar;
    }

    public String getnombreCli() {
        return this.nombreCli;
    }

    public int getnumeroCedula() {
        return this.numeroCedula;
    }

    public int getvalorPagar() {
        return this.valorPagar;
    }
}
