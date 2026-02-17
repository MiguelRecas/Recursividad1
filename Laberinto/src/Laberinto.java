public class Laberinto {

    public static char[][] laberinto = {
            { '#', '#', '#', '#', '#', '#', '#', '#', '#', '#' },
            { '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#' },
            { '#', ' ', '#', '#', '#', '#', '#', '#', ' ', '#' },
            { '#', ' ', '#', ' ', ' ', ' ', ' ', '#', ' ', '#' },
            { '#', ' ', '#', ' ', '#', '#', ' ', '#', ' ', '#' },
            { '#', ' ', '#', ' ', '#', 'S', ' ', '#', ' ', '#' },
            { '#', ' ', '#', ' ', '#', '#', ' ', '#', ' ', '#' },
            { '#', ' ', ' ', ' ', ' ', ' ', ' ', '#', ' ', '#' },
            { '#', '#', '#', '#', '#', '#', '#', '#', '#', '#' },
 
    };

    public static int [] incrementoX = {0, 1, 0, -1};
    public static int [] incrementoY = {-1, 0, 1, 0};

    public static void mostrarLaberinto(){
        for(int i = 0; i < laberinto.length; i++){
            for(int j = 0; j < laberinto[i].length; j++){
                System.out.print(laberinto[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static boolean buscar (int x, int y){

        for(int i = 0; i < 4; i++){
            int nx = x + incrementoX[i];
            int ny = y + incrementoY[i];

            if (laberinto[nx][ny] == 'S'){
                return true;
            }

            if(laberinto[nx][ny] == ' '){
                laberinto[nx][ny] = 'x';
                if(buscar(nx, ny)){
                    laberinto[nx][ny] = '*';
                    return true;
                }
            
            }
        }
        return false;

    }
}
    

