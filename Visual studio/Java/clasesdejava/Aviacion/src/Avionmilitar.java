/*******************
 * MISION TIC 2022 UPB Autor: Miguel Mejia
 *******************/

public class AvionMilitar extends Avion {
    // Atributos
    private int cant_misiles;

    // Constructor
    public AvionMilitar(String color, String placa, int cant_misiles) {
        super(color, placa);
        this.cant_misiles = cant_misiles;
    }

    // Getter and Setters
    public int getCant_misiles() {
        return cant_misiles;
    }

    public void setCant_misiles(int cant_misiles) {
        this.cant_misiles = cant_misiles;
    }

    public void identificar_objetivo(boolean objetivo) {
        if (objetivo) {
            this.disparar();
        } else {
            System.out.println("No es un objetivo militar");
        }
    }

    private void disparar() {
        if (cant_misiles > 0) {
            --cant_misiles;
            System.out.println("Disparando...");
            System.out.println("Misiles actuales: " + cant_misiles);
        } else {
            System.out.println("No hay misiles disponibles");
        }
    }
}
