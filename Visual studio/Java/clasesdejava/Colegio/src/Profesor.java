import java.util.ArrayList;

/*******************************
 * Autor: Rubén Martínez
 * Fecha: 27/07/2021
 * Ciudad: Cúcuta
 * Descripción: Programa que realiza el calculo de prestaciones de profesores de un Colegio
 *****************************/
public class Profesor{
    /*************
     * Atributos
     *************/
    private int id;
    private String nombre;
    private String materia;
    private double salario;
    
     /*************
     * Constructor
     *************/
    public Profesor(String nombre, String materia,double salario){
        this.nombre = nombre;
        this.materia = materia;
        this.salario = salario;
    }

    /*************
     * Consultores
     * (Getters)
     *************/
    public int getId(){
        return this.id;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getMateria(){
        return this.materia;
    }

    public double getSalario(){
        return this.salario;
    }

     /*************
     * Modificadores
     * (Setters)
     *************/
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setMateria(String materia){
        this.materia = materia;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }
    
    /*************
     * Acciones
     ***********/
    public static ArrayList<Double> liquidarPrestaciones(ArrayList<Profesor> profesores){
        ArrayList<Double> arraySalarios= new ArrayList<Double>();
        if (profesores == null){
            return null;
        }
        else{
            for(int i = 0; i < profesores.size(); i++){
                double prima_servicios = (profesores.get(i).salario*0.0833);
                double cesantias  = (profesores.get(i).salario*0.0833);
                double intcesantias  = ((profesores.get(i).salario*0.0833)*0.12);
                double vacaciones  = (profesores.get(i).salario*0.0416);
                double prestaciones  = prima_servicios+cesantias+intcesantias+vacaciones;
                arraySalarios.add(prestaciones);
            
        
            }
    }
    return arraySalarios;
    }
}
