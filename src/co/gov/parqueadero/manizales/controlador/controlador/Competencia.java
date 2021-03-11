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
public class Competencia extends Vehiculo implements Serializable{
    private String escuderia;
    
    //Constructor que pide los valores obligatorios de la clase padre y de la propia clase con private
    public Competencia(String escuderia, String numeroChasis, String color, String numeroMotor) {
        super(numeroChasis, color, numeroMotor);
        this.escuderia = escuderia;
      
    }

    public String getEscuderia() {
        return escuderia;
    }

    public void setEscuderia(String escuderia) {
        this.escuderia = escuderia;
    }

    @Override
    public String toString() {
        return "Competencia{" + "escuderia=" + escuderia + '}';
    }
}
