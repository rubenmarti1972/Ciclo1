import java.security.SecureRandom;

public class Decremento {
    public static void main(String[] args) throws Exception {
        //ncrementable();
        matrices();
    }
    public static void incrementable() {
        int contador = 0;        
        System.out.println(contador++);
        System.out.println(contador);
        //incrementable
        ++contador;
        //postincrementable
        contador++;
        //decremento
        --contador;
        //postdecremento
        contador--;
    }
    public static void arreglos() {
        // Crear arreglo de tipo entero con tamaño 5
        int[] numeros = new int[5];
        // Guardar valores en el arreglos
        /*
         * numeros[0] = 5; numeros[1] = 10; numeros[2] = 15; numeros[3] = 8; numeros[4]
         * = 11;
         */
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (i * 2);
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        String[] palabras = new String[2];
        palabras[0] = "Hola";
        palabras[1] = "Mundo";
        for (int i = 0; i < palabras.length; i++) {
            System.out.print(palabras[i] + " ");
        }
    }
    public static void matrices(){
        //Crear matriz de números enteros
        
        SecureRandom random = new SecureRandom();
        int[][] numeros = new int[3][4];
        //Guardar números
        /*
        numeros[0][0] = 1;
        numeros[0][1] = 2;
        numeros[0][2] = 3;
        numeros[0][3] = 4;
        */
        //Recorremos las filas de la matriz
        for(int i = 0; i < numeros.length; i++){
            //Recorremos las columnas de la matriz
            for(int j = 0; j < numeros[i].length; j++){
                numeros[i][j] = 1 + random.nextInt(10);
            }
        }
        //Mostrar matriz
        for(int i = 0; i < numeros.length; i++){
            //Recorremos las columnas de la matriz
            for(int j = 0; j < numeros[i].length; j++){
                System.out.print(numeros[i][j]+"\t");
            }
            System.out.println("");
        }
    }
}