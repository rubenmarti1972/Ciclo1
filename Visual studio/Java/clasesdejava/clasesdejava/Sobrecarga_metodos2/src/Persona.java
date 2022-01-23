public public class Persona{
    /*************
     * Atributos
     ************/
    private String nombre;
    private String apellido;
    private String cedula;
    private String telefono;
    private int edad;
    private String profesion;

    //Constructor
    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona(String nombre, String apellido, String cedula, String telefono, int edad, String profesion){
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.telefono = telefono;
        this.edad = edad;
        this.profesion = profesion;
    }

    public Persona(){
        this.initVariables();
    }

    public void initVariables(){
        this.nombre = "";
        this.apellido = "";
        this.cedula = "";
        this.telefono = "";
        this.edad = -1;
        this.profesion = "";
    }

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

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    
}
class Persona {
    
}
