public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        Universidad universidad1  = new Universidad("Universidad Pontificia Bolivariana", 900123456, "Medellin");
        System.out.println("Nombre: " + universidad1.getNombre() + "\nNIT: " + universidad1.getNit() + "\nCiudad: " + universidad1.getCiudad());
        universidad1.setNombre("Universidad de Antioquia");
        universidad1.setCiudad("Antioquia");
        System.out.println("Nombre: " + universidad1.getNombre() + "\nNIT: " + universidad1.getNit() + "\nCiudad: " + universidad1.getCiudad());
    }
}
