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
//Hereda de TransporteCarga
public class Avion extends TransporteCarga implements Serializable{
    private String fuselaje;
    private short altitudMaxima;

    public Avion(String fuselaje, short altitudMaxima, String transportadora, boolean registroMinisterio, float capacidad, String tipoCarroceria, String placa, String numeroChasis, String color, String numeroMotor) {
        super(transportadora, registroMinisterio, capacidad, tipoCarroceria, placa, numeroChasis, color, numeroMotor);
        this.fuselaje = fuselaje;
        this.altitudMaxima = altitudMaxima;
    }

    public String getFuselaje() {
        return fuselaje;
    }

    public void setFuselaje(String fuselaje) {
        this.fuselaje = fuselaje;
    }

    public short getAltitudMaxima() {
        return altitudMaxima;
    }

    public void setAltitudMaxima(short altitudMaxima) {
        this.altitudMaxima = altitudMaxima;
    }

    @Override
    public String toString() {
        return "Avion{" + "fuselaje=" + fuselaje + ", altitudMaxima=" + altitudMaxima + '}';
    }
}

