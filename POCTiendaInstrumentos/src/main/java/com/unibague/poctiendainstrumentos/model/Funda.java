/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unibague.poctiendainstrumentos.model;

/**
 *
 * @author jorge
 */
public class Funda {

    private String codigo;
    private String nombre;
    private double precio;
    private Guitarra guitarra;

    //constructor
    public Funda(String codigo, String nombre, double precio, Guitarra guitarra) {
        this.codigo = codigo;
        this.nombre = nombre;
        setPrecio(precio);
        this.guitarra = guitarra;

    }

    //metodos
    // Getters y setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String nombre) {
        this.codigo = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio < 0) {
            throw new IllegalArgumentException("Precio invalido");
        } else {
            this.precio = precio;
        }
    }

    public Guitarra getGuitarra() {
        return guitarra;
    }

    public void setGuitarra(Guitarra guitarra) {
        this.guitarra = guitarra;
    }

    @Override
    public String toString() {
        return "Funda{" + "codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + "Id guitarra" + getGuitarra().getCodigo() +'}';
    }

}
