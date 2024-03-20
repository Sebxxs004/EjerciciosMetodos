package metodos;

public class ejercicio6 {
    public static double convertirSegundos(int segundos, String tipo) {
        if (tipo.equals("dias")) {
            return segundos / (24 * 3600.0); // Convertir segundos a días
        } else if (tipo.equals("horas")) {
            return segundos / 3600.0; // Convertir segundos a horas
        } else if (tipo.equals("minutos")) {
            return segundos / 60.0; // Convertir segundos a minutos
        } else {
            System.out.println("Tipo de conversión no válido");
            return 0;
        }
    }
}
