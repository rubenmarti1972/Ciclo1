//Indica el paquete al cual pertenece la clase actual
//Indica el paquete al cual pertenece la clase actual
package controlador;

import java.util.ArrayList;
//Importa el paquete de la clase Persona para poderla referenciar
import modelo.Persona;

public class ControladorPersona{
    //Arreglo que almacenará muchas personas
    private ArrayList<Persona> personas;

    //Método constructor
    public ControladorPersona(){
        this.personas = new ArrayList<Persona>();
    }

    public void registrar_persona(String nombre, String apellido, String email){
        Persona objPersona = new Persona(nombre, apellido, email);
        this.personas.add(objPersona);
    }

    //Consultores y modificadores
    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }
    
    public Persona buscar_persona(String apellido){
        //Construir un objeto vacío
        Persona persona = new Persona();
        //Itera el arrayList
        for(int i = 0; i < this.personas.size(); i++){
            //Obtiene el objeto de cada posición
            Persona tempoPersona = this.personas.get(i);
            //Verifica que el objeto tenga el mismo apellido que recibió como parametro
            if(tempoPersona.getApellido().equals(apellido)){
                persona = tempoPersona;
            }
        }
        return persona;
    }
    

}


