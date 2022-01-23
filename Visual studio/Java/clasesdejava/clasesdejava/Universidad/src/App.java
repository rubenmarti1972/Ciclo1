public class App {
    public static void main(String[] args) throws Exception {
        //Crear una universidad
        Universidad objUniversidad = new Universidad("UPB", "Cll 100 #12-34", "123456");
        //Matricular un estudiante
        objUniversidad.matricular_estudiante();
        //Matricular una materia al estudiante
        objUniversidad.getEstudiante(0).matricular_materia();
        //obtener la materia matriculada por el estudiante
        //String nombre = objUniversidad.getEstudiante(0).getMateria(0).getNombre();
        Materia objMateria = objUniversidad.getEstudiante(0).getMateria(0);
        System.out.println("Nombre de la materia: "+objMateria.getNombre());
        objMateria.setNombre("Cálculo integral");
        System.out.println("Nombre de la materia: "+objMateria.getNombre());
    }
    
}
