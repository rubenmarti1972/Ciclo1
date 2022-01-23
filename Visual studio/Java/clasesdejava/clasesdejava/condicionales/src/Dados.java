/*Desarrolle un método de juegos de dados. Debe hacer que el mètodo lance
    un dado 20 veces y debe mostrar de forma tabulada los resultados de 
    cada lanzamiento de la siguiente manera:
        lanzamiento_1   lanzamiento_2   lanzamiento_3   ...5
        ...
        ...
        ...
    
    Nota: Recuerde que un dado tiene 6 caras.
*/
import java.security.SecureRandom;
import java.util.Scanner;
public class Dados{
public static void main(String[] args) throws Exception {
        //ncrementable();
        crear();
        
    }
 
    
    public static void crear(){

            int numeros[];
            SecureRandom random = new SecureRandom();
            
            for (int k = 0; k < numeros.length; k++){
                numeros[k] = 1 + random.nextInt(6);
            }
            mostrar_datos(numeros);
        }
    }
        public static void mostrar_datos(int[] numeros){
            for(int k = 0; k < numeros.length; k++){
                System.out.printf("numeros[%d]: %d", k, numeros[k]);
                System.out.println("");
            }
        }
    
}
