public class App {
    public static void main(String[] args) throws Exception {
        AvionCarga objAvionCarga = new AvionCarga("Azul", "RJH213", 580);
        System.out.println("--------AVION DE CARGA-------------");
        objAvionCarga.cargar();
        objAvionCarga.despegar();
        objAvionCarga.aterrizar();
        objAvionCarga.descargar();

        System.out.println("");
        
        AvionMilitar objAvionMilitar = new AvionMilitar("Gris", "MIL123", 6);
        System.out.println("--------AVION MILITAR-------------");
        objAvionMilitar.despegar();
        objAvionMilitar.identificar_objetivo(false);
        objAvionMilitar.identificar_objetivo(true);
        objAvionMilitar.aterrizar();
    }
}
