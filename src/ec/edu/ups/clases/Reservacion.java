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
public class Reservacion {

    public String toString() {
        return "Reservacion:" + "\n Codigo de Reservacion=" + codigoReservacion + "\n Numero de Mesa de Reservacion=" + numeroMesaReservacion + "\n Horario de Reservacion=" + horarioReservacion + '.';
    }
    private int codigoReservacion;
    private int numeroMesaReservacion;
    private double horarioReservacion;

    public void setcodigoReservacion(int codigoReservacion) {
        this.codigoReservacion = codigoReservacion;
    }

    public void setnumeroMesaReservacion(int numeroMesaReservacion) {
        this.numeroMesaReservacion = numeroMesaReservacion;
    }

    public void sethorarioReservacion(double horarioReservacion) {
        this.horarioReservacion = horarioReservacion;
    }

    public int getcodigoReservacion() {
        return this.codigoReservacion;
    }

    public int getnumeroMesaReservacion() {
        return this.numeroMesaReservacion;
    }

    public double gethorarioReservacion() {
        return this.horarioReservacion;
    }
}
