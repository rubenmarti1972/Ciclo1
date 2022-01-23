import java.util.ArrayList;

public class Universidad {
    /****************
     * Atributos
     ***************/
    private String nombre;
    private String direccion;
    private String nit;
    private ArrayList<Estudiante> arrayEstudiante;
    private ArrayList<Facultad> arrayFacultad;
    
    public Universidad(String nombre, String direccion, String nit) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.nit = nit;
        this.arrayEstudiante = new ArrayList<Estudiante>();
        this.arrayFacultad = new ArrayList<Facultad>();
    }

    /*****************
     * Consultores 
     *      y
     * Modificadores
     *****************/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public ArrayList<Estudiante> getArrayEstudiante() {
        return arrayEstudiante;
    }

    public void setEstudiante(Estudiante estudiante, int pos) {
        this.arrayEstudiante.set(pos, estudiante);
    }

    public Estudiante getEstudiante(int pos){
        return this.arrayEstudiante.get(pos);
    }

    /*****************
     * Acciones
     *****************/
    public void matricular_estudiante(){
        //Construir objeto estudiante
        Estudiante objEstudiante = new Estudiante("Andrés", "Hernandez", 20, "1234");
        //Almacenar el objeto en el array
        this.arrayEstudiante.add(objEstudiante);
    }

    public void crear_facultad(){
        //crear el objeto facultad
        Facultad objFacultad = new Facultad("Ingeniería", "0987654", this);
        //Almacenar el objeto facultad
        this.arrayFacultad.add(objFacultad);
    }

}

