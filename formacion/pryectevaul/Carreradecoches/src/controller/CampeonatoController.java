package controller;

import ejercicio.Campeonato;
import ejercicio.Carrera;
import ejercicio.Coche;

import java.util.ArrayList;
import java.util.Scanner;

public class CampeonatoController {

        // -------------------------
        // VARIABLES PÚBLICAS
        // -------------------------
        public Campeonato campeonato;
        public CarreraController carreraController;

        // -------------------------
        // CONSTRUCTOR
        // -------------------------
        public CampeonatoController(Campeonato campeonato, CarreraController carreraController) {
            this.campeonato = campeonato;
            this.carreraController = carreraController;   // ✔ CORRECTO
        }


    // -------------------------
        // MÉTODO PRINCIPAL DEL CAMPEONATO
        // -------------------------
        public void iniciarCampeonato() {

            int numCarreras = campeonato.numCarreras;
            ArrayList<Coche> coches = campeonato.listaCam;

            // Inicializar puntos totales
            for (Coche c : coches) {
                c.puntos = 0;
            }

            Scanner entrada = new Scanner(System.in);

            // Bucle de carreras
            for (int carrera = 1; carrera <= numCarreras; carrera++) {

                System.out.println("\n=== CARRERA " + carrera + " ===");

                // Pedir km de la carrera
                System.out.print("Introduce los km de la carrera: ");
                int kmCarrera = Integer.parseInt(entrada.nextLine());

                // Resetear km, último avance, puntos de la carrera
                for (Coche c : coches) {
                    c.km=0;
                    c.ultimoAvance=0;
                    c.puntosCarrera=0;
                }

                // Simular carrera
                Carrera carreraObj = new Carrera(coches, kmCarrera, null);
                carreraController.simularCarrera(carreraObj);
                ArrayList<Coche> resultado = carreraObj.listaCorredores;


                // Mostrar km de la carrera
                System.out.println("Kilómetros de la carrera: " + kmCarrera);

                // Mostrar datos del ganador
                Coche ganador = resultado.get(0);
                System.out.println("Ganador: " + ganador.piloto + " (" + ganador.marca + " " + ganador.modelo + ")");


                // Asignar puntos
                asignarPuntos(resultado);

                // Mostrar clasificación provisional
                mostrarClasificacionProvisional(coches);
            }

            // Clasificación final
            mostrarClasificacionFinal(coches);
        }

        // -------------------------
        // ASIGNAR PUNTOS
        // -------------------------
        public void asignarPuntos(ArrayList<Coche> resultado) {

            int[] puntos = {10, 8, 6};

            for (int i = 0; i < resultado.size(); i++) {
                if (i < puntos.length) {
                    resultado.get(i).puntosCarrera = puntos[i];  // puntos de cada carrera
                    resultado.get(i).puntos += puntos[i];        // puntos acumulados
                }
            }
        }

        // -------------------------
        // CLASIFICACIÓN PROVISIONAL
        // -------------------------
        public void mostrarClasificacionProvisional(ArrayList<Coche> coches) {

            System.out.println("\n=== CLASIFICACIÓN PROVISIONAL ===");

            coches.sort((a, b) -> b.puntosCarrera - a.puntosCarrera);

            System.out.printf("%-15s %-15s %-15s %-10s\n", "Piloto", "Marca", "Modelo", "Puntos");

            for (Coche c : coches) {
                System.out.printf("%-15s %-15s %-15s %-10d\n", c.piloto, c.marca, c.modelo, c.puntosCarrera);

            }
        }

        // -------------------------
        // CLASIFICACIÓN FINAL
        // -------------------------
        public void mostrarClasificacionFinal(ArrayList<Coche> coches) {

            System.out.println("\n=== CLASIFICACIÓN FINAL ===");

            coches.sort((a, b) -> b.puntos - a.puntos);

            System.out.printf("%-15s %-15s %-15s %-10s\n", "Piloto", "Marca", "Modelo", "Puntos");

            for (Coche c : coches) {
                System.out.printf("%-15s %-15s %-15s %-10d\n", c.piloto, c.marca, c.modelo, c.puntos);

            }

            System.out.println("\nCAMPEÓN: " +coches.get(0).piloto+ "|" +coches.get(0).marca+ "|"  +coches.get(0).modelo+ "|" +coches.get(0).puntos);
        }
    }
