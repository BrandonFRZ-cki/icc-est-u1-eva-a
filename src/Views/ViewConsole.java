package Views;

import Models.Book;

public class ViewConsole {
    public void showMessage(String mensaje){
        System.out.println(mensaje);
    }
    public void printArreglo(Book[] libros){
        for (int i = 0; i < libros.length; i++) {
            System.out.println(libros[i]);
        }
    }
}
