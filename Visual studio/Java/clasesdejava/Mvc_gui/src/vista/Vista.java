package vista;

import java.util.Scanner;

import controlador.ControladorPersona;
import modelo.Persona;

public class Vista {
    //Atributos
    private ControladorPersona controlador;

    //Constructor
    public Vista(){
        this.controlador = new ControladorPersona();
    }


    public void formulario(){
        //Solicitar datos 
        try (Scanner entrada = new Scanner(System.in)){
            
            System.out.println("Ingrese el nombre: ");
            String nombre = entrada.next();

            System.out.println("Ingrese el apellido: ");
            String apellido = entrada.next();

            System.out.println("Ingrese el email: ");
            String email = entrada.next();

            this.controlador.registrar_persona(nombre, apellido, email);

        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e);
        }
    }

    public void mostrar_info(){

        for(int i = 0; i < this.controlador.getPersonas().size(); i++){
            Persona objPersona = this.controlador.getPersonas().get(i);
            System.out.println("---------Persona--------");
            System.out.println("Nombre: "+objPersona.getNombre());
            System.out.println("Apellido: "+objPersona.getApellido());
            System.out.println("Email: "+objPersona.getEmail());
        }

    }

    
}
