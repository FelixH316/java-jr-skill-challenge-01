package com.metaphorce.modelo;


import java.util.ArrayList;


public class GestorPelicula {
    // Attributes
    private ArrayList<Pelicula> listaPeliculas = new ArrayList<>();

    // Methods
    public boolean agregarPelicula(Pelicula pelicula) {
        try{
            this.listaPeliculas.add(pelicula);
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
        return true;
    }

    public boolean eliminarPelicula(Integer id){
        int index = 0;
        boolean validDelete = false;
        for(int i = 0; i < this.listaPeliculas.size(); i++) {
            if (id == this.listaPeliculas.get(i).getId()) {
                index = i;
                validDelete = true;
                break;
            }
        }
        if (validDelete){
            this.listaPeliculas.remove(index);
            return true;
        }
        else{
            return false;
        }
    }

    public void obtenerPeliculas(){
        for(int i = 0; i < this.listaPeliculas.size(); i++){
            System.out.println("Id: " + this.listaPeliculas.get(i).getId() +
                               " | Nombre: " + this.listaPeliculas.get(i).getNombre() +
                               " | Disponible: " + this.listaPeliculas.get(i).getDisponible());
        }
    }

    public void obtenerPeliculasDisponibles(){
        for(int i = 0; i < this.listaPeliculas.size(); i++){
            if (this.listaPeliculas.get(i).getDisponible())
            {
                System.out.println("Id: " + this.listaPeliculas.get(i).getId() +
                                   " | Nombre: " + this.listaPeliculas.get(i).getNombre());
            }
        }
    }

    public void obtnerPeliculasNoDisponibles(){
        for (Pelicula currentPelicula : this.listaPeliculas) {
            if (!currentPelicula.getDisponible()) {
                System.out.println("Id: " + currentPelicula.getId() +
                                   " | Nombre: " + currentPelicula.getNombre());
            }
        }
    }

    public boolean marcarPeliculaDisponible(int id){
        int index = 0;
        boolean validMovie = false;
        for(int i = 0; i < this.listaPeliculas.size(); i++) {
            if (id == this.listaPeliculas.get(i).getId()) {
                this.listaPeliculas.get(i).setDisponible(true);
                return true;
            }
        }
        return false;
    }

    public boolean marcarPeliculaNoDisponible(int id){
        int index = 0;
        boolean validMovie = false;
        for(int i = 0; i < this.listaPeliculas.size(); i++) {
            if (id == this.listaPeliculas.get(i).getId()) {
                this.listaPeliculas.get(i).setDisponible(false);
                return true;
            }
        }
        return false;
    }
}
