package xd;
import java.util.Iterator;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Libro libro1 = new Libro("cien años de soledad", "Gabriel");
        Libro libro2 = new Libro("real madrid","jefferson");
        
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        Iterator<Libro> iterator = biblioteca.iterator(); 

        while (iterator.hasNext()){
            Libro libro = iterator.next();
            System.out.println("Titulo: " + libro.getTitulo() + " " + "Autor: " + libro.getAutor());
        }

    }
}
