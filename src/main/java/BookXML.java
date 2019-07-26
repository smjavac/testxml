

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.jdom2.*;
import org.jdom2.output.XMLOutputter;


public class BookXML {

    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        Book mybook1 = new Book("Война и мир", "1983");
        Book mybook2 = new Book("Архипелаг ГУЛАГ", "1989");
        bookList.add(mybook1);
        bookList.add(mybook2);
//        XStream xs = new XStream();
//
//        try (FileOutputStream fs = new FileOutputStream("war and peace2.xml")) {
//            xs.toXML(bookList, fs);
//        } catch (IOException ex) {
//            ex.getMessage();
//        }

        Document document = new Document();
        Element root = new Element("root");

        document.setRootElement(root);
        for (Book b: bookList) {
            Element book = new Element("book");
            Element name = new Element("name");
            name.addContent(b.getName());
            Element year = new Element("year");
            year.addContent(b.getYear());
            book.addContent(name);
            book.addContent(year);
            root.addContent(book);
        }
        XMLOutputter outputter = new XMLOutputter();

        try (FileOutputStream fs = new FileOutputStream("war and peace3.xml")) {
            outputter.output(document, fs);

        }  catch (IOException e) {
            e.getMessage();
        }

    }
}