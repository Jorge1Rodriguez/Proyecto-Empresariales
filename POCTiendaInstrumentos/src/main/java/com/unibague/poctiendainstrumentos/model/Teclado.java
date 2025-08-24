/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unibague.poctiendainstrumentos.model;

/**
 *
 * @author jorge
 */
public class Teclado extends Instrumento implements IProgramable {

    private int numeroTeclas;
    private boolean esDigital;
    private String sensibilidad;

    //Constructor
    public Teclado(String codigo, String nombre, String marca, double precio, int stock,
            int numeroTeclas, boolean esDigital, String sensibilidad) {
        super(codigo, nombre, marca, precio, stock);
        setNumeroTeclas(numeroTeclas);
        this.esDigital = esDigital;
        this.sensibilidad = sensibilidad;
    }

    //Metodos
    @Override
    public double calcularValor() {
        return getPrecio() + (this.esDigital ? getPrecio() * 0.15 : 0);
    }

    @Override
    public void guardarPreset(String nombre) {
        System.out.println("Preset \"" + nombre + "\" guardado en el teclado " + getNombre());
    }

    @Override
    public void cargarPreset(String nombre) {
        System.out.println("Preset \"" + nombre + "\" cargado en el teclado " + getNombre());
    }

    // Getters y setters
    public int getNumeroTeclas() {
        return numeroTeclas;
    }

    public void setNumeroTeclas(int numeroTeclas){
        if (numeroTeclas < 0) {
            throw new IllegalArgumentException("Numero de teclas invalido");
        } else {
            this.numeroTeclas = numeroTeclas;
        }
    }

    public boolean isEsDigital() {
        return esDigital;
    }

    public void setEsDigital(boolean esDigital) {
        this.esDigital = esDigital;
    }

    public String getSensibilidad() {
        return sensibilidad;
    }

    public void setSensibilidad(String sensibilidad) {
        this.sensibilidad = sensibilidad;
    }

    @Override
    public String toString() {
        return super.toString() + "numeroTeclas=" + numeroTeclas + ", esDigital=" + esDigital + ", sensibilidad=" + sensibilidad + '}';
    }

}
