/*
3-> Solicitar un número por consola y mostrar si el número es par.
    Ejemplo: $ 2
             $ 2 es un número par
             --------
             $ 3
             $ 3 es un número impar

*/
import java.util.Scanner;

public class parimpar {
    public static void main(String[] args) throws Exception {
        
        //Declarar variables
        int numero_1= 0;
       
        
        
        
        try (Scanner entrada = new Scanner(System.in)){
            
            
                //Capturar un número

            System.out.println("Por favor ingrese número : ");        
            numero_1 = entrada.nextInt();
                                    
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("Error al capturar los datos");
        }
        //Sumar
        
        if ((numero_1 % 2)==0){
            System.out.println("El número "+numero_1+" es par");
        }
        else {
            System.out.println("El número "+numero_1+" es impar");
        }
        
    }

    
}