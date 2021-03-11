/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.gov.parqueadero.manizales.controlador.controlador;

import java.io.Serializable;

/**
 *
 * @author CatalinaGomezJ
 */
public class Moto extends Competencia implements Serializable{
    private String numero;
    private short cilindraje;

    public Moto(String numero, short cilindraje, String escuderia, String numeroChasis, String color, String numeroMotor) {
        super(escuderia, numeroChasis, color, numeroMotor);
        this.numero = numero;
        this.cilindraje = cilindraje;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public short getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(short cilindraje) {
        this.cilindraje = cilindraje;
    }

    @Override
    public String toString() {
        return "Moto{" + "numero=" + numero + ", cilindraje=" + cilindraje + '}';
    }
}
