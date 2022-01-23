/***************************************
 * Clase que me representa a una persona
 ****************************************/
public class Persona {
    /************
     * Atributos
     ************/
    private String nombre;
    private String apellido;
    private int edad;
    private String telefono;
    private String profesion;
    private String cedula;

    /***********************************
     * Constructor
     * Recibe como parámetros:
     * nombre, apellido, edad y cédula
     *************************************/
    public Persona(String nombre, String apellido, int edad, String cedula){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cedula = cedula;
    }

    /***********************
     * Métodos consultores
     * Getters
     **********************/
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public int getEdad(){
        return edad;
    }
    public String getCedula(){
        return cedula;
    }
    public String getTelefono(){
        return telefono;
    }
    public String getProfesion(){
        return profesion;
    }

    /***************************
     * Métodos modificadores
     * Setters
     ***************************/
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    public void setProfesion(String profesion){
        this.profesion = profesion;
    }


}
