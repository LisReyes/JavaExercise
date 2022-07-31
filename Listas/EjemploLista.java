
import java.util.ArrayList;
import java.util.List;
public class EjemploLista {
    public static void main(String[]args){
        Pelicula p1 = new Pelicula();
        Pelicula p2 = new Pelicula();

        List<Pelicula> lista;

        lista = new ArrayList<Pelicula>();
        
        lista.add(p1);
        lista.add(p2);
        System.out.println(lista);
    }
}
