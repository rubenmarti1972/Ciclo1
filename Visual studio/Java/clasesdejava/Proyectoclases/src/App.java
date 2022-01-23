public class App {
    public static void main(String[] args) throws Exception {
        Persona Objpersona_1 = new Persona ("Juan","Pérez",20,"51630");
        Persona Objpersona_2 = new Persona ("Ana","Cuevas",25,"51631");
        System.out.println("Nombre: "+Objpersona_1.getNombre());
        System.out.println("Apellido: "+Objpersona_1.getApellido());
        System.out.println("Datos modificados");
        Objpersona_1.setNombre ("Ruben");
        Objpersona_1.setNombre ("Martínez");
        System.out.println("Nombre: "+Objpersona_1.getNombre());
        System.out.println("Apellido: "+Objpersona_1.getApellido());
        System.out.println("Persona 2");
        System.out.println("Nombre: "+Objpersona_2.getNombre());
        System.out.println("Apellido: "+Objpersona_2.getApellido());


    }
}
