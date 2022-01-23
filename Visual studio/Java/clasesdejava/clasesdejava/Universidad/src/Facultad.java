public class Facultad {
    private String nombre;
    private String codigo;
    private Universidad universidad;
    public Facultad(String nombre,String codigo, Universidad universidad){
        this.nombre = nombre;
        this.codigo = codigo;
        this.universidad =universidad;
    }



    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public void crear_materia(){
        Materia ObjMateria = new Materia ("Física","12345");
        this.materias.add (objMateria)
    }
}
