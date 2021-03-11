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
public class Taxi extends TransportePublico implements Serializable{
    private double valorCupo;
    private String tipoOperacion;

    public Taxi(double valorCupo, String tipoOperacion, short numeroPasajeros, float capacidad, String tipoCarroceria, String placa, String numeroChasis, String color, String numeroMotor) {
        super(numeroPasajeros, capacidad, tipoCarroceria, placa, numeroChasis, color, numeroMotor);
        this.valorCupo = valorCupo;
        this.tipoOperacion = tipoOperacion;
    }

    public double getValorCupo() {
        return valorCupo;
    }

    public void setValorCupo(double valorCupo) {
        this.valorCupo = valorCupo;
    }

    public String getTipoOperacion() {
        return tipoOperacion;
    }

    public void setTipoOperacion(String tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
    }

    @Override
    public String toString() {
        return "Taxi{" + "valorCupo=" + valorCupo + ", tipoOperacion=" + tipoOperacion + '}';
    }
}
