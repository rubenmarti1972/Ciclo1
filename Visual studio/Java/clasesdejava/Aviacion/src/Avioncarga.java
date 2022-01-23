/*******************
 * MISION TIC 2022
 * UPB
 * Autor: Miguel Mejia
 *******************/
public class AvionCarga extends Avion{
    private double capacidad_carga;

    public AvionCarga(String color, String placa, double capacidad_carga) {
        super(color, placa);
        this.capacidad_carga = capacidad_carga;
    }

    //Getter and setters

    public double getCapacidad_carga() {
        return capacidad_carga;
    }
    public void setCapacidad_carga(double capacidad_carga) {
        this.capacidad_carga = capacidad_carga;
    }



    public void cargar() {
        System.out.println("Cargando");
    }
    public void descargar() {
        System.out.println("Descargando");
    }
}
