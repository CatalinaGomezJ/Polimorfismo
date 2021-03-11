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
//Hereda de Transporte
public class TransporteCarga extends Transporte implements Serializable{
    private String transportadora;
    private boolean registroMinisterio;

    //Constructor

    public TransporteCarga(String transportadora, boolean registroMinisterio, float capacidad, String tipoCarroceria, String placa, String numeroChasis, String color, String numeroMotor) {
        super(capacidad, tipoCarroceria, placa, numeroChasis, color, numeroMotor);
        this.transportadora = transportadora;
        this.registroMinisterio = registroMinisterio;
    }

    public String getTransportadora() {
        return transportadora;
    }

    public void setTransportadora(String transportadora) {
        this.transportadora = transportadora;
    }

    public boolean isRegistroMinisterio() {
        return registroMinisterio;
    }

    public void setRegistroMinisterio(boolean registroMinisterio) {
        this.registroMinisterio = registroMinisterio;
    }

    @Override
    public String toString() {
        return "Carga{" + "transportadora=" + transportadora + ", registroMinisterio=" + registroMinisterio + '}';
    }
    
}
