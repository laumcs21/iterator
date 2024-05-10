package xd;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca implements Iterable <Libro> {
    private List<Libro> libros;

    public Biblioteca (List <Libro> libros){
        this.libros = new ArrayList<>();

    }

    public void agregarLibro(Libro libro){
        libros.add(libro);
    }


    @Override
    public Iterator<Libro> iterator(){
        return new LibrosIterator();
    }
    
    private class LibrosIterator implements Iterator <Libro>{
        private int posicion = 0;

    @Override 

    public boolean hasNext(){
        return posicion < libros.size();

    }
    
    @Override

    public Libro next(){
        return libros.get(posicion++);
    }

    @Override

    public void remove (){
        throw new UnsupportedOperationException("Remove not supported");
    }
    }
}
