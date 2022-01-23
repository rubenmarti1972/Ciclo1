import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
        String cadena = "5";
        //Convertir un string a un numero
        int numero = Integer.parseInt(cadena);
        numero = numero + 10;
        numero += 10;
        System.out.println("La suma es: "+numero);
        */

        //System.out.print("Por favor ingrese un string: ");
        //Entrada de datos(crear objeto Scanner)
        //Scanner entrada = new Scanner(System.in);
        //----MANIPULACIÓN DEL OBJETO----

        //Queda a la escucha de lo que ingrese el usuario
        /*
        String mensaje = entrada.next();
        System.out.println("Usted digitó: "+mensaje);
        */
        /*
        try {
            //Capturar un número
            System.out.println("Por favor ingrese número 1: ");        
            int numero_1 = entrada.nextInt();
            
            System.out.println("Por favor ingrese número 2: ");
            int numero_2 = entrada.nextInt();
            //Sumar
            int suma = numero_1 + numero_2;
            System.out.println("La sumatoria es: "+suma);
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("Error");
        }
        //Cerrar 
        entrada.close();
        //Ingrese la cantidad de números
            System.out.println("Por favor ingrese la cantidad de números a sumar: ");   
            n = entrada.nextInt();
            
            for (k = 1; k<=n; k++){*/
        //Declarar variables
        int numero_1= 0;
        float numero_2 = 0;
        float suma,resta, multiplicacion,division = 0;
        int k,n= 0;
        
        
        try (Scanner entrada = new Scanner(System.in)){
            
            
                //Capturar un número

            System.out.println("Por favor ingrese número 1: ");        
            numero_1 = entrada.nextInt();
            System.out.println("Por favor ingrese número 2: ");        
            numero_2 = entrada.nextInt();
            
            
            
                                    
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

