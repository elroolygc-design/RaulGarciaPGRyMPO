package controller;

import ejercicio.Carrera;
import ejercicio.Coche;
import java.util.Collections;
import java.util.ArrayList;

public class CarreraController {
    public int puntuacion;

    public CarreraController (int puntuacion){
        this.puntuacion=puntuacion;
    }

    public void simularCarrera (Carrera carrera) {

        // Reset antes de empezar
        for (Coche c : carrera.listaCorredores) {
            c.km = 0;
            c.ultimoAvance = 0;
        }

        boolean carreraTerminada = false;
        int tiempo = 0;

        while (!carreraTerminada) {
            tiempo++;

            // 1. TODOS avanzan
            for (Coche item : carrera.listaCorredores) {
                int avanzar = (int)(Math.random() * 30) + 20;
                item.km += avanzar;
                item.ultimoAvance = avanzar;
                item.tiempoTotal = tiempo;
            }

            // 2. DESPUÉS de avanzar todos, comprobamos si alguien llegó
            for (Coche item : carrera.listaCorredores) {
                if (item.km >= carrera.kmCarrera) {
                    carreraTerminada = true;
                    break;
                }
            }
        }

         // 3. ORDENAR CON EL DESEMPATE.

        carrera.listaCorredores.sort((a, b) -> {
            // 1. Primero por km (mayor a menor)
            int cmp = Integer.compare(b.km, a.km);
            if (cmp != 0) return cmp;

            // 2. Si empatan en km → por último avance (mayor a menor)
            cmp = Integer.compare(b.ultimoAvance, a.ultimoAvance);
            if (cmp != 0) return cmp;

            // 3. Si siguen empatados → por nombre del piloto (alfabético)
            return a.piloto.compareToIgnoreCase(b.piloto);
        });

        // 4. El ganador es el primero de la lista ordenada
        carrera.ganador = carrera.listaCorredores.get(0);

        // 5. ASIGNAR PUNTOS
        for (int i = 0; i < carrera.listaCorredores.size(); i++) {
            Coche coche = carrera.listaCorredores.get(i);

            if (i == 0) coche.puntos += 10;
            else if (i == 1) coche.puntos += 8;
            else if (i == 2) coche.puntos += 6;
        }

        // 6. MOSTRAR PODIO
        System.out.println("=== PODIO DE LA CARRERA ===");

        for (int i = 0; i < 3; i++) {
            Coche c = carrera.listaCorredores.get(i);
            System.out.println((i+1) + "º: " + c.piloto + " | " + c.marca + " " + c.modelo +
                    " | KM: " + c.km + " | Puntos: " + c.puntos);
        }

    }


}