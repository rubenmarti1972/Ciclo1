//Paquete al cual pertenece la clase
package modelo;

public class Persona{
    /**************
     * Atributos
    *************/
    private String nombre;
    private String apellido;
    private String email;

    /**************
     * Constructor
    *************/
    public Persona(String nombre, String apellido, String email){
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }

    public Persona(){
        
    }

    /**************
     * Getters
     * and
     * Setters
    *************/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Acciones

}
  

