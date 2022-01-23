/*****************
 * Autor:
 * Fecha:
 * Ciudad:
 * Descripción:
 ******************/
public class Materia {
    /****************
     * Atributos
     ***************/
    private String nombre;
    private String codigo;

    /****************
     * Constructor
     ***************/
    public Materia(String nombre, String codigo){
        this.nombre = nombre;
        this.codigo = codigo;
    }

    /****************
     * Consultores
     * Getters
     ***************/
    public String getNombre(){
        return this.nombre;
    }

    public String getCodigo(){
        return this.codigo;
    }

     /****************
     * Modificadores
     * Setters
     ***************/
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
}
