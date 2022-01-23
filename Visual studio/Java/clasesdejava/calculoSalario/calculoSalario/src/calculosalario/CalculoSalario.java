package calculosalario;
import java.util.Scanner;

/*
 * @author tutorias.co
 */

public class CalculoSalario {

    /**
     * se crea el canal de entrada de datos con scanner
     */
    static Scanner entrada = new Scanner(System.in);
    static double valorHora, iva;
    static int numeroHoras;
    
    public static void main(String[] args) {
        // se instancia la clase Salario y se invocan los metodos
        System.out.print("Favor ingresar numero de horas trabajadas: ");
        numeroHoras = entrada.nextInt(); 
        System.out.print("Favor ingresar valor hora: ");
        valorHora = entrada.nextDouble(); 
        System.out.print("Favor ingresar Ret en terminos porcentuales: ");
        iva = entrada.nextDouble();
        Salario a = new Salario(numeroHoras, valorHora, iva);
        a.calcularSalario();
        a.mostrarResultado();
    }
}

// clase salario
class Salario{
    double vH, i, salario;
    int nH;
    
    Salario(int numeroHoras, double valorHora, double iva){
        nH = numeroHoras;
        vH = valorHora;
        i = iva;
    }
    public void calcularSalario(){
        salario = (nH * vH) - ((nH * vH) * (i/100));
    }
    public void mostrarResultado(){
        System.out.println("\nSALARIO NETO = " + salario);
    }
    public void mostrarResultadoGrafico(){
        javax.swing.JOptionPane.showMessageDialog(null,"\nSALARIO NETO = " + salario);
    }
}
// clase salario