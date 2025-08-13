package main;

import java.util.ArrayList;

public class Tienda {
    ArrayList<Album> listaAlbumes;

    public Tienda() {
        this.listaAlbumes = new ArrayList<>();
    }

    public void agregarAlbum(Album album) {
        listaAlbumes.add(album);
    }

    public Cancion buscarCancionPorTitulo(String titulo) {
        for (Album album : listaAlbumes) {
            for (Cancion cancion : album.obtenerCanciones()) {
                if (cancion.obtenerTitulo().equalsIgnoreCase(titulo)) {
                    return cancion;
                }
            }
        }
        return null;
    }
}
