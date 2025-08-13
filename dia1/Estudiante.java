public class Estudiante {
    String nombre;
    double cal1;
    double cal2;
    double cal3;

    public Estudiante(String nombre, double cal1, double cal2, double cal3) {
        this.nombre = nombre;
        this.cal1 = cal1;
        this.cal2 = cal2;
        this.cal3 = cal3;
    }

    public double getPromedio() {
        return (cal1 + cal2 + cal3) / 3;
    }

    public String getNotaFinal() {
        double prom = getPromedio();
        if (prom >= 90) return "A";
        else if (prom >= 80) return "B";
        else if (prom >= 70) return "C";
        else if (prom >= 60) return "D";
        else return "F";
    }
}
