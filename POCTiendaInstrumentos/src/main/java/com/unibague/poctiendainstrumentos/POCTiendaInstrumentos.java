package com.unibague.poctiendainstrumentos;

import com.unibague.poctiendainstrumentos.model.*;
import com.unibague.poctiendainstrumentos.service.*;
import com.unibague.poctiendainstrumentos.view.*; //Revisar si esto está bien


public class POCTiendaInstrumentos {
    public static void main(String[] args) {

        /*
        *   Crear la instancia de la GUI principal para que se pueda ver
        */ 

       GUIPrincipal gui = new GUIPrincipal();
       gui.setVisible(true);







        // Instancia del servicio (Singleton)
        IServicioInstrumento servicio = ServicioInstrumento.getInstancia();

        // Crear accesorios
        AccesoriosGuitarra ampli = new AccesoriosGuitarra("Amplificador", 200, "Electrónico", 1);
        AccesoriosGuitarra funda = new AccesoriosGuitarra("Funda", 50, "Protección", 1);

        // Crear una guitarra con accesorios
        Guitarra g1 = new Guitarra("G001", "Gibson Les Paul", "Gibson", 1500, 3, "Eléctrica", "Caoba");
        g1.agregarAccesorio(ampli);
        g1.agregarAccesorio(funda);

        // Crear un teclado
        Teclado t1 = new Teclado("T001", "Casio PX-160", "Casio", 600, 5, 88, true, "Alta");

        // --- Probar agregar ---
        servicio.agregarInstrumento(g1);
        servicio.agregarInstrumento(t1);

        // --- Probar listar ---
        System.out.println("=== Lista de instrumentos ===");
        for (Instrumento i : servicio.listarInstrumentos()) {
            System.out.println(i + " | Valor total: $" + i.calcularValor());
        }

        // --- Probar buscar ---
        System.out.println("\n=== Buscar instrumento con código G001 ===");
        System.out.println(servicio.buscarInstrumento("G001"));

        // --- Probar editar ---
        System.out.println("\n=== Editando stock de teclado T001 ===");
        Teclado tecladoEditado = new Teclado("T001", "Casio PX-160", "Casio", 600, 10, 88, true, "Alta");
        servicio.editarInstrumento("T001", tecladoEditado);
        System.out.println(servicio.buscarInstrumento("T001"));

        // --- Probar eliminar ---
        System.out.println("\n=== Eliminando guitarra G001 ===");
        servicio.eliminarInstrumento("G001");
        for (Instrumento i : servicio.listarInstrumentos()) {
            System.out.println(i);
        }

        // --- Probar métodos de teclado (preset) ---
        System.out.println("\n=== Probando presets del teclado ===");
        t1.guardarPreset("Rock");
        t1.cargarPreset("Rock");
        t1.cargarPreset("Jazz"); // este no existe
    }
}
