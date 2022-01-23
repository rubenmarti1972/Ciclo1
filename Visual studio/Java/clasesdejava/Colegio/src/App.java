import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Profesor objProfe1 = new Profesor("Luz","Matemática",1810050);
        Profesor objProfe2 = new Profesor("Pedro","Inglés",1200000);
        Profesor objProfe3 = new Profesor("Juan","Historia",1755600);
        Profesor objProfe4 = new Profesor("Paula","Inglés",1755600);
        Profesor objProfe5 = new Profesor("Raúl","Ética",1200000);
    
    ArrayList <Profesor> profesores = new ArrayList <Profesor>();
    profesores.add(objProfe1);
    profesores.add(objProfe2);
    profesores.add(objProfe3);
    profesores.add(objProfe4);
    profesores.add(objProfe5);

    Profesor prof_liquidador=new Profesor("Jorge", "Contabilidad", 1500000);
    ArrayList <Double> prestaciones  =  prof_liquidador.liquidarPrestaciones (profesores);

    System.out.println ("Liquidaciones");
    for(int i = 0; i < prestaciones.size(); i++){
        System.out.println (prestaciones.get(i));
    }
    
    }
}