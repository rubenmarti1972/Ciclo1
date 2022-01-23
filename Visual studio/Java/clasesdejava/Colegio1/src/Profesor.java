import java.util.ArrayList;

public class Profesor {
    //Atributos
    private int id;
    private String nombre;
    private ArrayList<Curso> cursos =new ArrayList<Curso>();
    private double salario;

    //Constructor
    public Profesor(String nombre, double salario){
        this.nombre = nombre;
        this.salario = salario;
        this.cursos = new ArrayList<Curso>();
    }

    //Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Curso getCurso(int pos) {
        return cursos.get(pos);
    }

    public int getSizeCursos(){
        return cursos.size();
    }

    public void setCurso(int pos, Curso curso) {
        cursos.set(pos, curso);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    //Getters and Setters del arraylist<curso> 

    public ArrayList<Curso> getCursos() {//Permite ver los datos que se encuentran en el arraylist
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {//Nos permite modificar el ultimo valor del arraylist
        this.cursos=cursos;
    }
    
    public void addCurso(Curso curso){
        this.cursos.add(curso);
    }


}