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
//Implements (entre interfaces)
//Extends (herencia, digo que Vehiculo hereda de Object aunque por defecto ya lo haga)
public class Vehiculo extends Object implements Serializable{
    //Atributos que tienen todos los vehiculos
    private String numeroChasis;
    private String color;
    private String numeroMotor;
    
    //Constructor con todos los atributos que son private
    public Vehiculo(String numeroChasis, String color, String numeroMotor) {
        this.numeroChasis = numeroChasis;
        this.color = color;
        this.numeroMotor = numeroMotor;
    }

    public String getNumeroChasis() {
        return numeroChasis;
    }

    public void setNumeroChasis(String numeroChasis) {
        this.numeroChasis = numeroChasis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNumeroMotor() {
        return numeroMotor;
    }

    public void setNumeroMotor(String numeroMotor) {
        this.numeroMotor = numeroMotor;
    }
    
    //Sobrescribir el método con toString
    @Override
    public String toString() {
        return "Vehiculo{" + "numeroChasis=" + numeroChasis + ", color=" + color + ", numeroMotor=" + numeroMotor + '}';
    }
}
