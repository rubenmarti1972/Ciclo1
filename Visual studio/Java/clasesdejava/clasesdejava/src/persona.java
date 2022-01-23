import java.util.Scanner;

public class persona {
    public static void main(String[] args) throws Exception {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese el nombre de usuario: ");
        String usuario = entrada.next();
        System.out.print("Bienvenido al Ciclo 2 "+usuario);
        
        entrada.close();
    }

}

