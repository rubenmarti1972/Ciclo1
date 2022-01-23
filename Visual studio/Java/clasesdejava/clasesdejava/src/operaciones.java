import java.util.Scanner;

public class operaciones {
    public static void main(String[] args) throws Exception {
        
        //Declarar variables
        double numero_1= 0;
        double numero_2 = 0;
        double suma,resta, multiplicacion,division = 0;
        
        
        
        try (Scanner entrada = new Scanner(System.in)){
            
            
                //Capturar un número

            System.out.println("Por favor ingrese número 1: ");        
            numero_1 = entrada.nextDouble();
            System.out.println("Por favor ingrese número 2: ");        
            numero_2 = entrada.nextDouble();
            
            
            
                                    
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("Error al capturar los datos");
        }
        //Sumar
        suma=numero_1+numero_2;
        resta=numero_1-numero_2;
        multiplicacion=numero_1*numero_2;
        if (numero_2==0){
            System.out.println("No se puede dividir por cero");
        }
        else {
            division=numero_1/numero_2;
        }
        System.out.println("La sumatoria es: "+suma);
        System.out.println("La diferencia es: "+resta);
        System.out.println("El producto es: "+multiplicacion);
        System.out.println("El cociente es: "+division);
    }

    
}


