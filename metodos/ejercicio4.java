package metodos;

public class ejercicio4 {
    public float CCE(float radio, int eleccion){
        float total = 0;
        switch (eleccion){
            case 1:
                total = (float) ((2*3.1416)*radio);
                return total;
            case 2:
                total = (float) (3.1416*(radio*radio));
                return total;
            case 3:
                total = (float) (4*3.1416*(radio*radio*radio));
                return total;
            default:
                return total;
        }
    }
}
