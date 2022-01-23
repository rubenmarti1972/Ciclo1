import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        //Declarar variables
        double numero_1= 0;
        double numero_2 = 0;
        double sueldo=0;
        try (Scanner entrada = new Scanner(System.in)){

            System.out.println("Por favor ingrese número 1: ");        
            numero_1 = entrada.nextDouble();
            System.out.println("Por favor ingrese número 2: ");        
            numero_2 = entrada.nextDouble();
            System.out.print("Ingrese la operación a realizar: (+,-,*,/) ");
            String opcion = entrada.next();
            switch (opcion){
                case "+":
                resultado=numero_1+numero_2;
                
                    break;
                case "-":
                resultado=numero_1-numero_2;
                
                    break;
                case "*":
                resultado=numero_1*numero_2;
                
                    break;
                case "/":
                if (numero_2==0){
                    System.out.println("No se puede dividir por cero");
                }
                else {
                    resultado=numero_1/numero_2;
                }
                
                System.out.println("El resultado es "+resultado);
                    break;
                default:
                    System.out.println("La opción es inválida");
                    break;
            }
            
            
                                    
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("Error al capturar los datos");
        }
        //Sumar
        
    
        
        
    }

    
}


/*
import java.util.Scanner;

public class Punto1 {
    public static void main(String[] args) throws Exception{
        //Pedir los datos al usuario
        try (Scanner entrada = new Scanner(System.in)){
            //Solicitar el primer número
            System.out.println("Por favor ingrese el primer número:");
            double numero_1 = entrada.nextDouble();
            //Solicitar el segundo número
            System.out.println("Por favor ingrese el segundo número:");
            double numero_2 = entrada.nextDouble();
            //Solicitar el tipo de operación que quiere realizar el usuario
            System.out.println("Por favor ingrese la operación a realizar (*, -, +, /)");
            String operacion = entrada.next();
            //Variable que almacena el resultado
            double resultado;
            //Evaluar las operaciones posibles ingresadas por el usuario
            switch (operacion){
                case "+":
                    resultado = numero_1 + numero_2;
                    break;
                case "-":
                    resultado = numero_1 - numero_2;
                    break;
                case "*":
                    resultado = numero_1 * numero_2;
                    break;
                case "/":
                    resultado = numero_1 / numero_2;
                    break;
                default:
                    resultado = 0.0;
                    break;
            }
            //Mostrar resultado
            System.out.println("El resultado es: "+resultado);

        } catch (Exception e) {
            System.out.println("Error");
            //TODO: handle exception
        }
    }
}
*/