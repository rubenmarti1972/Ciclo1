package vista;

import javax.swing.JButton;
//javax.swing -> elementos de la interfaz gráfica
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controlador.ControladorPersona;
import modelo.Persona;

// java.awt -> características y esquemas para la interfaz gráfica
import java.awt.*;
//java.awt.event -> contiene los eventos de la interfaz gráfica
import java.awt.event.*;

public class VistaFormulario extends JFrame {
    /*************
     * Atributos
     ************/
    // JLabel -> Muestra texto
    private JLabel lblNombre;
    private JLabel lblApellido;
    private JLabel lblEmail;
    private JLabel lblBuscar;
    // JTextField -> Campos de texto
    private JTextField txtNombre;
    private JTextField txtApellido;
    private JTextField txtEmail;
    private JTextField txtBuscar;
    // JButton -> botón
    private JButton btnGuardar;
    private JButton btnBuscar;
    // controlador
    private ControladorPersona controladorPersona;

    /***************
     * Constructor
     **************/
    public VistaFormulario() {
        this.controladorPersona = new ControladorPersona();
        /******************************
         * Configuración de la Ventana
         ******************************/
        // Indicamos el titulo de la ventana
        this.setTitle("Formulario de registro");
        this.setBounds(100, 400, 400, 200);
        // Indicar la finalización por defecto del programa
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Crear un GridLayout 4 filas - 2 columnas, espacio de 5 pixeles entre filas y
        // columnas
        GridLayout gLayout = new GridLayout(4, 2, 5, 5);
        // Crear contenedor central
        Container centerContainer = new Container();
        centerContainer.setLayout(gLayout);
        // Añadir el esquema (Borderlayout) a la ventana
        // BorderLayout -> NORTH, SOUTH, WEST, EAST, CENTER
        // Espacio entre cada coordenada de 5 pixeles (5,5)
        this.getContentPane().setLayout(new BorderLayout(5, 5));

        /******************************
         * 
         * Inicializar los atributos y añadirlos a la ventana
         * 
         ******************************/
        /************************************
         * 
         * ELEMENTOS DEL CONTENEDOR SUPERIOR
         *
         ************************************/
        // Crear gridlayout -> 1 fila, 3 columnas, espacio de 5 pixeles
        GridLayout northLayout = new GridLayout(1, 3, 5, 5);
        // Crear contenedor superior
        Container northContainer = new Container();
        // Agregar el layout al contenedor
        northContainer.setLayout(northLayout);
        // Inicializar elementos gráficos y añadirlos al contenedor
        this.lblBuscar = new JLabel("Buscar por apellido: ");
        northContainer.add(this.lblBuscar);
        this.txtBuscar = new JTextField();
        northContainer.add(this.txtBuscar);
        this.btnBuscar = new JButton("Buscar");
        northContainer.add(this.btnBuscar);

        /************************************
         * 
         * ELEMENTOS DEL CONTENEDOR CENTRAL
         *
         ************************************/

        // PRIMERA FILA
        // primera columna
        this.lblNombre = new JLabel("Nombre: ");
        centerContainer.add(this.lblNombre);
        // segunda columna
        this.txtNombre = new JTextField();
        centerContainer.add(this.txtNombre);

        // SEGUNDA FILA
        // primera columna
        this.lblApellido = new JLabel("Apellido: ");
        centerContainer.add(this.lblApellido);
        // segunda columna
        this.txtApellido = new JTextField();
        centerContainer.add(this.txtApellido);

        // TERCERA FILA
        // primera columna
        this.lblEmail = new JLabel("Email: ");
        centerContainer.add(this.lblEmail);
        // segunda columna
        this.txtEmail = new JTextField();
        centerContainer.add(this.txtEmail);

        // CUARTA FILA
        // primera columna
        centerContainer.add(new JLabel());
        // segunda columna
        this.btnGuardar = new JButton("Guardar");
        centerContainer.add(this.btnGuardar);

        /************************
         * MANEJADOR DE EVENTOS
         ***********************/
        this.btnGuardar.addActionListener(new ActionListener() {
            // Método manejador de eventos
            public void actionPerformed(ActionEvent evt) {
                // Acciones a desencadenar a partir de un click
                System.out.println("Click!");
                guardar();
            }
        });

        /************************
         * MANEJADOR DE EVENTOS PARA btnBuscar
         ************************/
        this.btnBuscar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                buscar_persona();
            }
        });

        /******************************
         * Añadir elementos a la ventana
         ******************************/

        /*
         * this.add(new Button("NORTH"), BorderLayout.NORTH); this.add( new
         * Button("SOUTH"), BorderLayout.SOUTH ); this.add( new Button("WEST"),
         * BorderLayout.WEST ); this.add( new Button("EAST"), BorderLayout.EAST);
         * this.add(new Button("CENTER"), BorderLayout.CENTER);
         */
        this.add(northContainer, BorderLayout.NORTH);
        this.add(centerContainer, BorderLayout.CENTER);
    }

    // Acciones de la clase
    public void guardar() {
        String nombre = this.txtNombre.getText();
        String apellido = this.txtApellido.getText();
        String email = this.txtEmail.getText();

        this.controladorPersona.registrar_persona(nombre, apellido, email);
        this.limpiar_campos();
        JOptionPane.showMessageDialog(this, "¡Datos guardados con éxito!");
    }

    public void limpiar_campos() {
        this.txtNombre.setText("");
        this.txtApellido.setText("");
        this.txtEmail.setText("");
    }

    public void buscar_persona() {
        // Capturar la info del campo buscar
        String buscar = txtBuscar.getText();
        System.out.println(buscar);

        Persona objPersona = controladorPersona.buscar_persona(buscar);
        System.out.println(objPersona.getNombre());
        // Añadir los valores del objeto a los campos
        txtNombre.setText(objPersona.getNombre());
        txtApellido.setText(objPersona.getApellido());
        txtEmail.setText(objPersona.getEmail());
    }

}






