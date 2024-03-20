package metodos;

public class ejercicio5 {
    public static int convertir(int dias, int horas, int minutos) {
        int totalSegundos = 0;
        totalSegundos += dias * 24 * 60 * 60;
        totalSegundos += horas * 60 * 60;
        totalSegundos += minutos * 60;
        return totalSegundos;
    }
}
