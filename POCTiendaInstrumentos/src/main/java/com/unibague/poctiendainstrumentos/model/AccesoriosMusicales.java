/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unibague.poctiendainstrumentos.model;

/**
 *
 * @author jorge
 */
public class AccesoriosMusicales {

    private String nombre;
    private double precio;
    private String tipo;
    private int cantidad;

    //constructor
    public AccesoriosMusicales(String nombre, double precio, String tipo, int cantidad){
        this.nombre = nombre;
        setPrecio(precio);
        this.tipo = tipo;
        setCantidad(cantidad);
    }

    //metodos
    public double calcularValor() {
        return precio * cantidad;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio){
        if (precio < 0) {
            throw new IllegalArgumentException("Precio invalido");
        } else {
            this.precio = precio;
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if (cantidad < 0) {
            throw new IllegalArgumentException("Cantidad Invalida");
        } else {
            this.cantidad = cantidad;
        }
    }

    @Override
    public String toString() {
        return "AccesoriosMusicales{" + "nombre=" + nombre + ", precio=" + precio + ", tipo=" + tipo + ", cantidad=" + cantidad + '}';
    }

}
