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
//Hereda de Carga
public class Camion extends TransporteCarga implements Serializable{
    private byte numeroEjes;

    public Camion(byte numeroEjes, String transportadora, boolean registroMinisterio, float capacidad, String tipoCarroceria, String placa, String numeroChasis, String color, String numeroMotor) {
        super(transportadora, registroMinisterio, capacidad, tipoCarroceria, placa, numeroChasis, color, numeroMotor);
        this.numeroEjes = numeroEjes;
    }

    public byte getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(byte numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    @Override
    public String toString() {
        return "Camion{" + "numeroEjes=" + numeroEjes + '}';
    }
    
}
