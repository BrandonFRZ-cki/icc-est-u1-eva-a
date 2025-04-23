package Controllers;

import Models.Book;

public class LibroController {
    public void sortByName(Book[] books){//Descendente (Z-A) y Seleccion
        int n= books.length;
        int minIndex;
        Book aux;
        for (int i = 0; i < n; i++) {
            minIndex = i;
            for (int j = 1; j < n; j++) {
                if (books[i].getName().compareTo(books[minIndex].getName())< 0){
                    minIndex=j;
                }
            }
            if (minIndex!=i) {
                aux = books[i];
                books[i] = books[minIndex];
                books[minIndex]=aux;
            }
        }
    }
    public Book searchByName(Book[] books ,String nombre){//Binaria
        int bajo=0;
        int alto = books.length-1;
        int central;
        while (bajo<=alto){
            central = (alto+bajo)/2;
            if(books[central].getName().equalsIgnoreCase(nombre)){
                return books[central];
            }
            if (books[bajo].getName().compareTo(books[central].getName())< 0){

            }
        }
        return null;
    }
}
