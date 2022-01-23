import java.util.Scanner;

public class Registro {

    public Registro() {
        this.solicitar_datos();
    }

    public void solicitar_datos() {
        try (Scanner entrada = new Scanner(System.in)) {
            Persona objPersona = new Persona();
            System.out.println("Por favor ingrese su nombre: ");
            objPersona.setNombre( entrada.nextLine() );

            System.out.println(objPersona.getNombre());

        } catch (Exception exc) {
            System.err.println("Error: "+exc);
        }
    }

}
