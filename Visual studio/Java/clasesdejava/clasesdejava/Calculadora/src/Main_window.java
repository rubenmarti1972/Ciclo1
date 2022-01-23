
/************************************************************
 * Autor: Rubén Antonio Martínez Patiño
 * Fecha: 25 de Agosto de 2021
 * Ciudad: Cúcuta
 * Descripción: Diseño de la interfaz gráfica ...
 * MISIONTIC 2022
 * Reto 4
 *************************************************************/
//javax.swing -> elementos de la interfaz gráfica
import javax.swing.*;

// java.awt -> características y esquemas para la interfaz gráfica
import java.awt.*;
//java.awt.event -> contiene los eventos de la interfaz gráfica


public class Main_window extends JFrame {
    /*************
     * Atributos
     ************/

    //Etiquetas
    private JLabel lblContratarProfe;
    private JLabel lblNombre;
    private JLabel lblSalario;
    //Cajas de texto
    private JTextField txtNombre;
    private JTextField txtSalario;
    //Botones
    private JButton btnLiquidacionNomina;
    private JButton btnLiquidacionPrestaciones;
    private JButton btnAgregarCurso;
    private JButton btnContratar;

    // JLabel -> Muestra texto

    public Main_window(){
        //Configuración de la ventana principal
        this.setTitle("Main_Window");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(0, 0, 700, 500);
        getContentPane().setLayout(null);

        //Panel contratar profesor
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(new Color(204, 204, 204));
        lblContratarProfe = new JLabel("Contratar Profesor");
        
        panel.add(lblContratarProfe, BorderLayout.NORTH);

        //Panel contenedor del formulario central del panel 'Contratar profesor'
        JPanel formulario = new JPanel(new GridLayout(4, 1, 20, 20));
        formulario.setBackground(new Color(204, 204, 204));
        lblNombre = new JLabel("Nombre");
        formulario.add(lblNombre);
        txtNombre = new JTextField(12);
        formulario.add(txtNombre);
        lblSalario = new JLabel("Salario");
        formulario.add(lblSalario);
        txtSalario = new JTextField(12);
        formulario.add(txtSalario);
        
        panel.add(formulario, BorderLayout.CENTER);
        btnContratar = new JButton("Contratar");
        panel.add( new JPanel().add(btnContratar), BorderLayout.SOUTH );
        panel.setBounds(40, 40, 200, 200);
        //Panel contenedor de las opciones
        JPanel panelOpciones = new JPanel( new GridLayout(3, 1, 10, 10));
        panelOpciones.setBounds(360, 40, 300, 200);
        //Inicializar los botones
        btnLiquidacionNomina = new JButton("Liquidación de nómina");
        panelOpciones.add(btnLiquidacionNomina);
        btnLiquidacionPrestaciones = new JButton("Liquidación prestaciones y seguridad social");
        panelOpciones.add(btnLiquidacionPrestaciones);
        btnAgregarCurso = new JButton("Agregar curso a un profesor");
        panelOpciones.add(btnAgregarCurso);
        //añade el panel a la ventana principal
        add(panel);
        add(panelOpciones);

    }

}