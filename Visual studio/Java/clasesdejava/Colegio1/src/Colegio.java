import java.util.ArrayList;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/************************************************************
 * Autor: Rubén Antonio Martínez Patiño
 * Fecha: 27 de Agosto de 2021
 * Ciudad: Cúcuta
 * Descripción: Clase que representa a colegio ...
 * MISIONTIC 2022
 * Reto 5
 *************************************************************/

public class Colegio{
    //Atributos
    private static final ArrayList<Profesor> profesores=new ArrayList<Profesor>();

    //Constructor
    
    //Método para liquidar prestaciones
    public  static ArrayList<Double> liquidarPrestaciones(ArrayList<Profesor> profesores){
        ArrayList<Double> arraySalarios = new ArrayList<Double>();
        //Iterar el arreglo
        for(int i = 0; i < profesores.size(); i++){
            double prima = (profesores.get(i).getSalario() * 0.0833);
            double cesantias = (profesores.get(i).getSalario() * 0.0833);
            double vacaciones = (profesores.get(i).getSalario() * 0.0416);
            double salario = prima + cesantias + (cesantias*0.012) + vacaciones;

            arraySalarios.add(salario);
        }
        return arraySalarios;
    }

    // Método para liquidar seguridad Social
    public  static ArrayList<Double> liquidarSegSocial(ArrayList<Profesor> profesores){
        ArrayList<Double> arraySalarios = new ArrayList<Double>();
       
        //Iterar el arreglo
        for(int i = 0; i < profesores.size(); i++){
            double incremento_salarial=0;
            if(profesores.get(i).getSizeCursos() > 1){
                incremento_salarial = (profesores.get(i).getSizeCursos() - 1) * 180000;
            }
            double sala1 = (profesores.get(i).getSalario() + incremento_salarial);
            double salud = (sala1 * 0.085);
            double pension = (sala1 * 0.12);
            double riesgosLaborales = (sala1 * 0.00522);
            double seguridadSocial = salud + pension + riesgosLaborales;
            
            arraySalarios.add(seguridadSocial);
            
        }
        return arraySalarios;
    }

    public  static double pagosDeUnProfesor(Profesor profesor,int diasTrabajados){
            
            int incremento_salarial = 0;
            if(profesor.getSizeCursos() > 1){
                incremento_salarial = (profesor.getSizeCursos() - 1) * 180000;
            }
            //Actualizar el salario base
            //profesor.setSalario(profesor.getSalario() + incremento_salarial);
            double salarioTotal =profesor.getSalario();
            double prima = salarioTotal * 0.0833;
            double cesantias = salarioTotal* 0.0833;
            double vacaciones = (salarioTotal - incremento_salarial)* 0.0416;
            double salario = salarioTotal+ prima + cesantias + (cesantias*0.012) + vacaciones;
            double salarioDiario =salario/30;
            //Obtener las deducciones
            //double deducciones = profesor.getSalario() * 0.08;
            //double salarioNeto = (profesor.getSalario() - deducciones);

            
 

		/*SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
 
		Date fechaInicial=dateFormat.parse ("2016-06-14");
		Date fechaFinal=dateFormat.parse("2016-11-13");
 
		int diasTrabajados=(int) ((fechaFinal.getTime()-fechaInicial.getTime())/86400000);
        */
        //diasTrabajados=152;
        double totalIngreso=salarioDiario*152;
		
        return totalIngreso;

            
        }
    
        public  static double deduccionesDeUnProfesor(Profesor profesor,int diasTrabajados){
            
            int incremento_salarial = 0;
            if(profesor.getSizeCursos() > 1){
                incremento_salarial = (profesor.getSizeCursos() - 1) * 180000;
            }
            //profesor.setSalario(profesor.getSalario() + incremento_salarial);
            double sala1 = profesor.getSalario()+incremento_salarial;
            double salud = (sala1 * 0.04);
            double pension = (sala1 * 0.04);
            double deducciones = ((salud+pension)/30*152);
            
            return deducciones;
        }

    // Método para liquidar nomina
    public static  double liquidarNominaProfe(Profesor profesor){
        //Actualizar el salario base
        //profesor.setSalario( profesor.getSalario() + incremento_salarial);
        //Obtener las deducciones
        
        int incremento_salarial = 0;
        if(profesor.getSizeCursos() > 1){
            incremento_salarial = (profesor.getSizeCursos() - 1) * 180000;
        }
        //Actualizar el salario base
        profesor.setSalario( profesor.getSalario() + incremento_salarial);
        //Obtener las deducciones
        double deducciones = profesor.getSalario() * 0.08;
        double salarioNeto = (profesor.getSalario() - deducciones);
        return salarioNeto;
    }

    //Getters and Setters

    public Profesor getProfesor(int pos) {
        return profesores.get(pos);
    }

    public int getSizeProfesores(){
        return profesores.size();
    }

    public void setProfesor(int pos, Profesor profesor) {
        this.profesores.set(pos, profesor);
    }

    //Getter  and Setters del arraylist<profesor>
    public ArrayList<Profesor> getProfesores() {
        return profesores;
    }


//    public void setProfesores(ArrayList<Profesor> profesores) {
//        this.profesores = profesores;
//   }
    
    public static void contratarProfe(Profesor profesor){
        profesores.add(profesor);
    }

}
