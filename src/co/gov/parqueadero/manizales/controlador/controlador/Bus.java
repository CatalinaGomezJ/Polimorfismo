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
//Hereda de Transporte Publico
public class Bus extends TransportePublico implements Serializable{
    //Arreglo para ingresar rutas existentes
    private String[] rutas;

    public Bus(String[] rutas, short numeroPasajeros, float capacidad, String tipoCarroceria, String placa, String numeroChasis, String color, String numeroMotor) {
        super(numeroPasajeros, capacidad, tipoCarroceria, placa, numeroChasis, color, numeroMotor);
        this.rutas = rutas;
    }

    public String[] getRutas() {
        return rutas;
    }

    public void setRutas(String[] rutas) {
        this.rutas = rutas;
    }

    @Override
    public String toString() {
        return "Bus{" + "rutas=" + rutas + '}';
    }
}
