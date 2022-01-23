public class App {
    public static void main(String[] args) throws Exception {
        /*
        //Construir objeto tipo Vista
        Vista objVista = new Vista();

        //Crear un formulario
        objVista.formulario();
        //Mostrar la informacio
        objVista.mostrar_info();
        

        Vistagrafica objVistaGrafica = new Vistagrafica();

        objVistaGrafica.formulario();
        objVistaGrafica.mostrar_info();
        */
        Main_window objVistaCalculadora= new Main_window();
        objVistaCalculadora.setVisible(true);

    }
}

