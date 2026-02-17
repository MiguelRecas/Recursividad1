public class Main {
    public static void main(String[] args) throws Exception {
        
        if(Laberinto.buscar(1, 1)){
            Laberinto.mostrarLaberinto();
        }else{
            System.out.println("No se ha encontrado la salida");
        }
    }
}
