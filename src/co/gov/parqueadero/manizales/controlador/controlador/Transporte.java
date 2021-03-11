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

//Transporte hereda de Vehiculo
public class Transporte extends Vehiculo implements Serializable{
    private float capacidad;
    private String tipoCarroceria;
    private String placa;

    public float getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(float capacidad) {
        this.capacidad = capacidad;
    }

    public String getTipoCarroceria() {
        return tipoCarroceria;
    }

    public void setTipoCarroceria(String tipoCarroceria) {
        this.tipoCarroceria = tipoCarroceria;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    //Constructor por atributos private
    //Pide todos los atributos necesarios de la clase padre (Vehiculo), y de la propia clase (Transporte) 
    public Transporte(float capacidad, String tipoCarroceria, String placa, String numeroChasis, String color, String numeroMotor) {
        super(numeroChasis, color, numeroMotor);
        this.capacidad = capacidad;
        this.tipoCarroceria = tipoCarroceria;
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Transporte{" + "capacidad=" + capacidad + ", tipoCarroceria=" + tipoCarroceria + ", placa=" + placa + '}';
    }
    
    
    
    
    

    
}
