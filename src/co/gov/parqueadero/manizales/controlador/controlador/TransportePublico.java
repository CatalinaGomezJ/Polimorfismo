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
public class TransportePublico extends Transporte implements Serializable{
    private short numeroPasajeros;

    public TransportePublico(short numeroPasajeros, float capacidad, String tipoCarroceria, String placa, String numeroChasis, String color, String numeroMotor) {
        super(capacidad, tipoCarroceria, placa, numeroChasis, color, numeroMotor);
        this.numeroPasajeros = numeroPasajeros;
    }

    public short getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(short numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    @Override
    public String toString() {
        return "TransportePublico{" + "numeroPasajeros=" + numeroPasajeros + '}';
    }

    
    
}
