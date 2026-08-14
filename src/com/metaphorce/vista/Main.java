package com.metaphorce.vista;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean execution = true;
        Scanner scanner = new Scanner(System.in);
        int seleccion = 0;

        System.out.println("CARTELERA CINE MORELIA");
        while(execution){
            System.out.println("Ingresa tu eleccion:");
            System.out.println("1.- Crear pelicula");
            System.out.println("2.- Mostrar peliculas");
            System.out.println("3.- Eliminar pelicula");
            System.out.println("4.- Activar pelicula");
            System.out.println("5.- Desactivar pelicula");
            System.out.println("6.- Mostrar peliculas disponibles");
            System.out.println("7.- Mostrar peliculas no disponibles");
            System.out.println("8.- Salir");
            seleccion = scanner.nextInt();
            if (seleccion == 1){

            }

        }
    }
}