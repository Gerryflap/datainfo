package nl.utwente.di;

import java.util.HashMap;
import java.util.Random;

/**
 * Created by gerben on 20-4-15.
 */
public class Quoter {
    HashMap<String, Double> books;

    public Quoter(){
        books = new HashMap<>();
    }

    public void addBook(String isbn, double price){
        books.put(isbn, price);
    }

    public double getBookPrice(String isbn) {
        Double result = books.get(isbn);
        if(result == null){
            return 0;
        }
        else {
            return result;
        }
    }

}
