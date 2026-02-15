package dominio;

public class Mates {
    public static int factorial (int n){
        if(n==0){
            return 1;
        }else {
            return n*factorial(n-1);
        }
    }

    public static int contarDigito(int numero, int digito){
        if(numero==0){
            return 0;
        }

        if(numero % 10 == digito){
            return 1 + contarDigito(numero / 10, digito);
        }else{
            return contarDigito(numero / 10, digito);
        }
    }

}

