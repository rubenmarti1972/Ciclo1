/*

4 -> Solicite por consola el precio de un producto y muestre en pantalla
    el precio del producto mas IVA (valor del iva 20%)

*/
import javax.swing.*;
import java.util.Scanner;

public class iva {
    public static void main(String[] args) throws Exception {
        
        //Declarar variables
        double precio= 0;
        double iva = 0;
        double total =0;
        
        
        try (Scanner entrada = new Scanner(System.in)){
            //Capturar un número

            String mensaje = "ingrese un dato",str;
            str=JOptionPane.showInputDialog(null,mensaje);
            System.out.println("El dato ingresados es: "+str);        
            precio = entrada.nextDouble();
            
                                    
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("Error al capturar los datos");
        }
        iva=precio*0.2;
        total=precio+iva;
        
        System.out.println("El precio es "+precio+" El iva es"+iva);
        System.out.println("El total es "+total);
        
    }

    
}
