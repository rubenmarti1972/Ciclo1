public class App {
    public static void main(String[] args) throws Exception {
        
        Profesor objProfesor = new Profesor("Raúl", 1875000);
        Profesor objProfesor1 = new Profesor("Pedro", 1755600);
        //Añadir Cursos
        objProfesor.addCurso( new Curso("Física") );
        objProfesor.addCurso( new Curso("Química"));
        objProfesor.addCurso( new Curso("Biología"));
        objProfesor1.addCurso( new Curso("Historia") );
        objProfesor1.addCurso( new Curso("Sociales"));
        objProfesor1.addCurso( new Curso("Ética"));

        //Crear objeto colegio
        Colegio objColegio = new Colegio();
        //Añadir profesor al colegio
        objColegio.contratarProfe(objProfesor);
        
        System.out.println(objColegio.liquidarNominaProfe(objProfesor));
        
        
        //System.out.println(objColegio.pagosDeUnProfesor(objProfesor));

        //System.out.println(objColegio.deduccionesDeUnProfesor(objProfesor));
    }
}

