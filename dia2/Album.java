package main;

import java.util.ArrayList;

public class Album {
    String titulo;              
    private final String artista;              
    private final ArrayList<Cancion> listaCanciones; 

    public Album(String titulo, String artista) {
        this.titulo = titulo;
        this.artista = artista;
        this.listaCanciones = new ArrayList<>();
    }

    public void agregarCancion(Cancion cancion) {
        listaCanciones.add(cancion);
    }

    public ArrayList<Cancion> obtenerCanciones() {
        return listaCanciones;
    }
}
