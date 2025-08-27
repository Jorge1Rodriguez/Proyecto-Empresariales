/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unibague.poctiendainstrumentos.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author jorge
 */
public class Guitarra extends Instrumento {

    private String tipo;
    private String materialCuerpo;
    private List<Funda> fundas;

    //Constructor
    public Guitarra(String codigo, String nombre, String marca, double precio, int stock,
            String tipo, String materialCuerpo) {
        super(codigo, nombre, marca, precio, stock);
        this.tipo = tipo;
        this.materialCuerpo = materialCuerpo;
        this.fundas = new ArrayList<>();
    }

    //metodos
    @Override
    public double calcularValor() {
        double valor = getPrecio();
        for (Funda funda : fundas) {
            valor += funda.getPrecio();
        }
        return valor;
    }

    public void agregarFunda(Funda funda) {
        fundas.add(funda);
    }

    public void eliminarFunda(String codigo) {
        Funda funda = buscarFunda(codigo);
        fundas.remove(funda);
    }

    public Funda buscarFunda(String codigo) {
        for (Funda funda : fundas) {
            if (funda.getCodigo().equalsIgnoreCase(codigo)) {
                return funda;
            }
        }
        return null;
    }

    //getters y setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMaterialCuerpo() {
        return materialCuerpo;
    }

    public void setMaterialCuerpo(String materialCuerpo) {
        this.materialCuerpo = materialCuerpo;
    }

    public List<Funda> getFundas() {
        return Collections.unmodifiableList(fundas);
    }

    public void setFundas(List<Funda> fundas) {
        this.fundas = fundas;
    }

    @Override
    public String toString() {
        return super.toString() + "tipo=" + tipo + ", materialCuerpo=" + materialCuerpo + ", fundas=" + fundas + '}';
    }

}
