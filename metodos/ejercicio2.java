package metodos;

public class ejercicio2 {
    public float areaPerimetro(float cat1, float cat2, int eleccion){
        float total = 0;
        switch (eleccion) {
            case 1:
                total = (float) ((cat1 * 2) + (cat2 * 2));
                return total;
            case 2:
                total = (float) (cat1 * cat2);
                return total;
            default:
                return total;
        }
    }
}
