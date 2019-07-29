

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.jdom2.*;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;


public class BookXML {

    public static void main(String[] args) {
        List<Cars> carsList = new ArrayList<>();
        Cars car1 = new Cars("Mercedes-Benz", "2011", "sedan", "V8", "automatic");
        Cars car2 = new Cars("BMW", "2015", "sedan", "V6", "automatic");
        Cars car3 = new Cars("Porsche", "2016", "sedan", "V6", "automatic");
        Cars car4 = new Cars("", "2015", "sedan", "V6", "automatic");
        Cars car5 = new Cars("BMW", "2015", "sedan", "V6", "automatic");
        Cars car6 = new Cars("BMW", "2015", "sedan", "V6", "automatic");
        Cars car7 = new Cars("BMW", "2015", "sedan", "V6", "automatic");
        Cars car8 = new Cars("BMW", "2015", "sedan", "V6", "automatic");
        Cars car9 = new Cars("BMW", "2015", "sedan", "V6", "automatic");
        Cars car10 = new Cars("BMW", "2015", "sedan", "V6", "automatic");
        carsList.add(car1);
        carsList.add(car2);
//        XStream xs = new XStream();
//
//        try (FileOutputStream fs = new FileOutputStream("war and peace2.xml")) {
//            xs.toXML(carsList, fs);
//        } catch (IOException ex) {
//            ex.getMessage();
//        }

        Document document = new Document();
        Element root = new Element("root");

        document.setRootElement(root);
        for (Cars b: carsList) {
            Element book = new Element("book");
            Element name = new Element("name");
            name.addContent(b.getName());
            Element year = new Element("year");
            year.addContent(b.getYear());
            book.addContent(name);
            book.addContent(year);
            root.addContent(book);
        }
        Format fmt = Format.getPrettyFormat();
        XMLOutputter outputter = new XMLOutputter(fmt);

        try (FileOutputStream fs = new FileOutputStream("Books.xml")) {
            outputter.output(document, fs);

        }  catch (IOException e) {
            e.getMessage();
        }

    }
}