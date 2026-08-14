package com.metaphorce.vista;
import com.metaphorce.modelo.GestorPelicula;
import com.metaphorce.modelo.Pelicula;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean execution = true;
        int seleccion = 0;
        int id = 0;
        int index = 0;
        String nombre;
        String currentOs = System.getProperty("os.name");
        Scanner scanner = new Scanner(System.in);
        GestorPelicula cartelera = new GestorPelicula();

        System.out.println("CARTELERA CINE MORELIA");
        while(execution) {
            System.out.println("1.- Crear pelicula");
            System.out.println("2.- Mostrar peliculas");
            System.out.println("3.- Eliminar pelicula");
            System.out.println("4.- Activar pelicula");
            System.out.println("5.- Desactivar pelicula");
            System.out.println("6.- Mostrar peliculas disponibles");
            System.out.println("7.- Mostrar peliculas no disponibles");
            System.out.println("8.- Limpiar pantalla");
            System.out.println("9.- Salir");
            System.out.println("Ingresa tu eleccion: ");

            seleccion = Integer.parseInt(scanner.nextLine());
            if (seleccion == 1) {
                System.out.println("Ingresa el nombre de tu pelicula: ");
                nombre = scanner.nextLine();
                Pelicula pelicula = new Pelicula(id, nombre, true);
                id += 1;
                cartelera.agregarPelicula(pelicula);
            }
            else if (seleccion == 2) {
                cartelera.obtenerPeliculas();
            }
            else if (seleccion == 3) {
                cartelera.obtenerPeliculas();
                System.out.println("Ingresa el indice de la pelicula a eliminar: ");
                index = Integer.parseInt(scanner.nextLine());
                cartelera.eliminarPelicula(index);
            }
            else if (seleccion == 4) {
                cartelera.obtenerPeliculas();
                System.out.println("Ingresa el indice de la pelicula para ponerla disponible: ");
                index = Integer.parseInt(scanner.nextLine());
                cartelera.marcarPeliculaDisponible(index);
            }
            else if (seleccion == 5) {
                cartelera.obtenerPeliculas();
                System.out.println("Ingresa el indice de la pelicula para ponerla no disponible: ");
                index = Integer.parseInt(scanner.nextLine());
                cartelera.marcarPeliculaNoDisponible(index);
            }
            else if (seleccion == 6) {
                cartelera.obtenerPeliculasDisponibles();
            }
            else if (seleccion == 7) {
                cartelera.obtnerPeliculasNoDisponibles();
            }
            else if (seleccion == 8) {
                System.out.println(currentOs);
                if (currentOs.contains("Windows")) {
                    ProcessBuilder processBuilder = new ProcessBuilder("cmd", "/c", "cls"); // "cmd", "/c",
                    try {
                        Process startProcess = processBuilder.inheritIO().start();
                        startProcess.waitFor();
                    } catch (Exception e) {
                        System.out.println("Fail to clear screen " + e.getMessage());
                    }
                }
                else {
                    ProcessBuilder processBuilder = new ProcessBuilder("clear");
                    try {
                        Process startProcess = processBuilder.inheritIO().start();
                        startProcess.waitFor();
                    } catch (Exception e) {
                        System.out.println("Fail to clear screen " + e.getMessage());
                    }
                }
            }
            else if (seleccion == 9) {
                execution = false;
            }
            else {
                System.out.println("Disculpa, opcion invalida");
            }
        }
    }
}