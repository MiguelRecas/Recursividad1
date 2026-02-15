package aplicacion;
import dominio.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("factorial(5): " + Mates.factorial(5));

        System.out.println("Contar el digito 4 en 3443564: " + Mates.contarDigito(3443564,4));
    }
}
