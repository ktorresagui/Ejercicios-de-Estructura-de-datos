package main;

public class Cancion {
    private final String titulo;    
    private final double duracion;  
    private final String artista;   

    public Cancion(String titulo, double duracion, String artista) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.artista = artista;
    }

    public String obtenerTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Duración: " + duracion + " minutos, Artista: " + artista;
    }
}
