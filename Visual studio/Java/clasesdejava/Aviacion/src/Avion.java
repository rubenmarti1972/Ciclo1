public class Avion{
    private String color;
    private String placa;

    public Avion(String color, String placa){
        this.color = color;
        this.placa = placa;
    }


    public void despegar(){
        System.out.println("Despegando...");
    }

    public void aterrizar(){
        System.out.println("Aterrizando...");
    }
}
