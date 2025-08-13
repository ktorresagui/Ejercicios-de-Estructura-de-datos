package main;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            Tienda tiendaMusica = new Tienda();
            
            // Crear álbum predeterminado con "Por Verte Feliz"
            Album albumParras = new Album("Éxitos Los Parras", "Los Parras");
            albumParras.agregarCancion(new Cancion("Por Verte Feliz", 2.5, "Los Parras"));
            tiendaMusica.agregarAlbum(albumParras);
            
            // Menú interactivo
            int opcion;
            do {
                System.out.println("\n--- TIENDA DE MÚSICA ---");
                System.out.println("1. Agregar álbum");
                System.out.println("2. Agregar canción a un álbum");
                System.out.println("3. Buscar canción");
                System.out.println("4. Salir");
                System.out.print("Elige una opción: ");
                opcion = entrada.nextInt();
                entrada.nextLine(); // limpiar buffer
                
                switch (opcion) {
                    case 1 -> {
                        System.out.print("Título del álbum: ");
                        String tituloAlbum = entrada.nextLine();
                        System.out.print("Artista del álbum: ");
                        String artistaAlbum = entrada.nextLine();
                        tiendaMusica.agregarAlbum(new Album(tituloAlbum, artistaAlbum));
                        System.out.println("Álbum agregado.");
                    }
                    
                    case 2 -> {
                        System.out.print("Título del álbum donde agregar la canción: ");
                        String albumBuscado = entrada.nextLine();
                        boolean encontrado = false;
                        for (Album album : tiendaMusica.listaAlbumes) {
                            if (album.titulo.equalsIgnoreCase(albumBuscado)) {
                                System.out.print("Título de la canción: ");
                                String tituloCancion = entrada.nextLine();
                                System.out.print("Duración en minutos (ej. 2.5): ");
                                double duracionCancion = entrada.nextDouble();
                                entrada.nextLine();
                                System.out.print("Artista: ");
                                String artistaCancion = entrada.nextLine();
                                album.agregarCancion(new Cancion(tituloCancion, duracionCancion, artistaCancion));
                                System.out.println("Canción agregada.");
                                encontrado = true;
                                break;
                            }
                        }
                        if (!encontrado) {
                            System.out.println("Álbum no encontrado.");
                        }
                    }
                    
                    case 3 -> {
                        System.out.print("Ingresa el título de la canción a buscar: ");
                        String tituloBusqueda = entrada.nextLine();
                        Cancion cancionEncontrada = tiendaMusica.buscarCancionPorTitulo(tituloBusqueda);
                        if (cancionEncontrada != null) {
                            System.out.println("Canción encontrada: " + cancionEncontrada);
                        } else {
                            System.out.println("Canción no encontrada.");
                        }
                    }
                    
                    case 4 -> System.out.println("Saliendo del sistema...");
                    
                    default -> System.out.println("Opción inválida.");
                }
            } while (opcion != 4);
        }
    }
}
