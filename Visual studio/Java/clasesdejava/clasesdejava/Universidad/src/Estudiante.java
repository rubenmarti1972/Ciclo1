public class Estudiante {
    /******************
     * Atributos
     ******************/
    private String nombre;
    private String apellido;
    private int edad;
    private String cedula;
    private Materia[] materia;

     /******************
     * Constructor
     ******************/
    public Estudiante(String nombre, String apellido, int edad, String cedula){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cedula = cedula;
        this.materia = new Materia[6];
    }

     /******************
     * Consultores
     ******************/
    public String getNombre(){
        return this.nombre;
    }

    public String getApellido(){
        return this.apellido;
    }

    public int getEdad(){
        return this.edad;
    }

    public String getCedula(){
        return this.cedula;
    }

    public Materia getMateria(int pos){
        return this.materia[pos];
    }

     /******************
     * Modificadores
     ******************/
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setCedula(String cedula){
        this.cedula = cedula;
    }

    public void setMateria(Materia materia, int pos){
        this.materia[pos] = materia;
    }

    /*************
     * Acciones
     *************/
    public void matricular_materia(){
        Materia objMateria = new Materia("Fisica", "1234");
        this.materia[0] = objMateria;
    }

}
