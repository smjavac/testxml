

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.XStream;


public class BookXML {

    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        Book book = new Book();
        book.setTitle("Война и мир");
        book.setYear(1983);
        Book book2 = new Book();
        book2.setTitle("Архипелаг ГУЛАГ");
        book2.setYear(1989);

        bookList.add(book);
        bookList.add(book2);
        XStream xs = new XStream();

        try (FileOutputStream fs = new FileOutputStream("war and peace2.xml")) {
            xs.toXML(bookList, fs);
        } catch (IOException ex) {
            ex.getMessage();
        }

    }
}