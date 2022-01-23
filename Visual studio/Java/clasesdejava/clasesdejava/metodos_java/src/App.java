import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       //double resultado =  sumar(10,2);
       solicitar_datos();


        
    }
    public static double sumar(double numero_1,double numero_2){
        double resultado =numero_1 + numero_2;
        return resultado;
    }

    public static double restar(double numero_1,double numero_2){
        double resultado =numero_1 - numero_2;
        return resultado;
    }

    public static double multiplicar(double numero_1,double numero_2){
        double resultado =numero_1 * numero_2;
        return resultado;
    }

    public static double dividir(double numero_1,double numero_2){
        double resultado =numero_1 / numero_2;
        return resultado;
    }
    public static double potenciar(double numero_1,double numero_2){
        double resultado = Math.pow(numero_1,numero_2);
        return resultado;
    }

    public static void solicitar_datos(){
        try(Scanner entrada = new Scanner(System.in)) {
            System.out.println("Por favor ingrese numero 1: ");
            double numero_1= entrada.nextDouble();
            System.out.println("Por favor ingrese numero 2: ");
            double numero_2= entrada.nextDouble();
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Potencia");
            System.out.println("6. Salir");
            System.out.print("Ingrese la operación a realizar: ");
            String opcion = entrada.next();
             
            switch (opcion){
                case "1":
                System.out.println("La suma es "+sumar(numero_1,numero_2));
                
                    break;
                case "2":
                System.out.println("La resta es "+restar(numero_1,numero_2));
                
                    break;
                case "3":
                System.out.println("La multiplicación es "+multiplicar(numero_1,numero_2));
                
                    break;
                case "4":
                if (numero_2==0){
                    System.out.println("No se puede dividir por cero");
                }
                else {
                    System.out.println("La división es "+dividir(numero_1,numero_2));
                }
                
                    break;
                case "5":
                    System.out.print("La potencia es "+potenciar(numero_1,numero_2));
                
                case "6":
                    System.out.print("Hasta luego");
                    break;
                default:
                    System.out.println("La opción es inválida");
                    break;
            }
            
            
        } catch (Exception e) {
            //TODO: handle exception
            System.err.println("Error en la entrada de datos");
            System.out.println("Debe digitar números reales");        }
    }
}

