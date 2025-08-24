/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unibague.poctiendainstrumentos.model;

/**
 *
 * @author jorge
 */
public abstract class Instrumento {

    private String codigo;
    private String nombre;
    private String marca;
    private double precio;
    private int stock;

    public Instrumento(String codigo, String nombre, String marca, double precio, int stock){
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        setPrecio(precio);
        setStock(stock);
    }

    public abstract double calcularValor();

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
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

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock < 0) {
            throw new IllegalArgumentException("Stock invalido");
        } else {
            this.stock = stock;
        }
    }

    @Override
    public String toString() {
        return "{" + "codigo=" + codigo + ", nombre=" + nombre + ", marca=" + marca + ", precio=" + precio + ", stock=" + stock ;
    }

}
