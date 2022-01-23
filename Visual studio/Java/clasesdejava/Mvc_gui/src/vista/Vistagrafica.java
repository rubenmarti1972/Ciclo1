package vista;

import javax.swing.JOptionPane;

import controlador.ControladorPersona;
import modelo.Persona;

public class Vistagrafica {
    //Atributos
    private ControladorPersona controlador;

    //Constructor
    public Vistagrafica(){
        this.controlador = new ControladorPersona();
    }

    public void formulario(){
        //Solicitar datos
        String nombre = JOptionPane.showInputDialog(null, "Por favor ingrese el nombre");
        String apellido = JOptionPane.showInputDialog(null, "Por favor ingrese el apellido");
        String email = JOptionPane.showInputDialog(null, "Por favor ingrese el email");
        //enviar datos al controlador
        this.controlador.registrar_persona(nombre, apellido, email);
    }

    public void mostrar_info(){
        String info = "";
        for(int i = 0; i < this.controlador.getPersonas().size(); i++){
            Persona objPersona = this.controlador.getPersonas().get(i);
            info +="--------------Persona-----------\n";
            info +="Nombre: "+objPersona.getNombre()+"\n";
            info += "Apellido: "+objPersona.getApellido()+"\n";
            info += "Email: "+objPersona.getEmail()+"\n";
            info += "--------------------------------------";
        }
        JOptionPane.showMessageDialog(null, info);
    }
}

