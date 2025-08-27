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
    private List<AccesoriosGuitarra> accesorios;

    //Constructor
    public Guitarra(String codigo, String nombre, String marca, double precio, int stock,
            String tipo, String materialCuerpo) {
        super(codigo, nombre, marca, precio, stock);
        this.tipo = tipo;
        this.materialCuerpo = materialCuerpo;
        this.accesorios = new ArrayList<>();
    }

    //metodos
    @Override
    public double calcularValor() {
        double valor = getPrecio();
        for (AccesoriosGuitarra accesorio : accesorios) {
            valor += accesorio.calcularValor();
        }
        return valor;
    }

    public void agregarAccesorio(AccesoriosGuitarra accesorio) {
        accesorios.add(accesorio);
    }

    public void eliminarAccesorio(AccesoriosGuitarra accesorio) {
        accesorios.remove(accesorio);
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

    public List<AccesoriosGuitarra> getAccesorios() {
        return Collections.unmodifiableList(accesorios);
    }

    public void setAccesorios(List<AccesoriosGuitarra> accesorios) {
        this.accesorios = accesorios;
    }

    @Override
    public String toString() {
        return super.toString() + "tipo=" + tipo + ", materialCuerpo=" + materialCuerpo + ", accesorios=" + accesorios + '}';
    }

}
