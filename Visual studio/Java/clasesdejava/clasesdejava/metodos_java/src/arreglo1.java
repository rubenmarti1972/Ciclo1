/*Cree un arreglo de tamaño N donde el tamaño es dado por el usuario,
    llene el arreglo con valores ingresados por el usuario.
    *Cree un mètodo para crear el arreglo y pedir los datos por teclado
    *Cree otro método para mostrar los datos del arreglo.
    */
import java.security.SecureRandom;
import java.util.Scanner;
public class Arreglo1 {
    public static void main(String[] args) throws Exception {
        //ncrementable();
        crear();
        
    }
    
    public static void crear(){

        try (Scanner entrada = new Scanner(System.in)){
            int numeros[];
            System.out.println("Por favor ingrese número el tamaño del arreglo: ");        
            tamaño = entrada.nextInt();
            numeros = new int[tamaño];    
            for (int k = 0; i < numeros.length; k++){
                System.out.println("Por favor ingrese el valor  :"+ k);  
                numeros[k]= entrada.nextInt();    
            }
            mostrar_datos(numeros);

        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("Error al capturar los datos");
        }
        public static void mostrar_datos(int[] numeros){
            for(int k = 0; i < numeros.length; k++){
                System.out.printf("numeros[%d]: %d", k, numeros[k]);
                System.out.println("");
            }
        }
    
        
        
        
    }
}