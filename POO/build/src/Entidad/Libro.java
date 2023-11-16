/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author USER
 */
public class Libro {
    public int ISBN;
    public String autor;
    public int paginas;
    public Libro (){
        
    }
    public Libro (int ISNB,String autor,int paginas){
        
    }

    public int getISBN() {
        return ISBN;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", autor=" + autor + ", paginas=" + paginas + '}';
    }
    
            
}

