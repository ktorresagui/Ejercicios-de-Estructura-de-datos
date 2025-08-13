public class SistemaNotas {
    public static void main(String[] args) {
        // Creamos estudiantes con sus calificaciones
        Estudiante e1 = new Estudiante("Mario", 85, 90, 78);
        Estudiante e2 = new Estudiante("Diana", 92, 88, 95);
        Estudiante e3 = new Estudiante("Ale", 60, 55, 70);
        Estudiante e4 = new Estudiante("Carlos", 100, 95, 80);
        Estudiante e5 = new Estudiante("Daniel", 88, 90, 75);
        Estudiante e6 = new Estudiante("Renata", 50, 62, 78);
        Estudiante e7 = new Estudiante("Sebas", 80, 95, 100);
        Estudiante e8 = new Estudiante("Lucas", 77, 75, 70);
        Estudiante e9 = new Estudiante("Andrea", 100, 85, 90);
        Estudiante e10 = new Estudiante("Fabiola", 50, 60, 80);
                

        // Mostrar resultados
        System.out.println("Nombre\tCal1\tCal2\tCal3\tPromedio\t Nota Final");
        mostrarEstudiante(e1);
        mostrarEstudiante(e2);
        mostrarEstudiante(e3);
        mostrarEstudiante(e4);
        mostrarEstudiante(e5);
        mostrarEstudiante(e6);
        mostrarEstudiante(e7);
        mostrarEstudiante(e8);
        mostrarEstudiante(e9);
        mostrarEstudiante(e10);
    }

    public static void mostrarEstudiante(Estudiante e) {
        System.out.println(e.nombre + "\t" + 
                           e.cal1 + "\t" + 
                           e.cal2 + "\t" + 
                           e.cal3 + "\t" + 
                           String.format("%.2f", e.getPromedio()) + "\t\t" + 
                           e.getNotaFinal());
    }
}
