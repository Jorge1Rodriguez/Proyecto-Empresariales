/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unibague.poctiendainstrumentos.service;

import com.unibague.poctiendainstrumentos.view.IObserver;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jorge
 */
public class ServicioObserver {

    List<IObserver> ventanas = new ArrayList<>();
    private static ServicioObserver instancia;

    private ServicioObserver() {
    }

    public void agregarVentana(IObserver gui) {
        ventanas.add(gui);
    }

    public void eliminarVentana(IObserver gui) {
        ventanas.remove(gui);
    }

    public void actualizar() {
        if (!ventanas.isEmpty()) {
            for (IObserver gui : ventanas) {
                gui.actualizar();
            }
        }
    }

    public static ServicioObserver getInstance() {
        if (instancia == null) {
            instancia = new ServicioObserver();
        }
        return instancia;
    }
}
