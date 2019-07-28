import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.filter.ElementFilter;
import org.jdom2.input.SAXBuilder;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class ReadXML {

    public static void main(String[] args) {
        readXMLDocument();
    }

    private static void readXMLDocument() {
        SAXBuilder parser = new SAXBuilder();
        Document xmlDoc;
        try {
            xmlDoc = parser.build(new File("Books.xml"));
            System.out.println("Books:");

            // Получаем список всех элементов book, которые
            // содержит корневой элемент
            List elements = xmlDoc.getRootElement()
                    .getContent(new ElementFilter("book"));

            // Для каждого элемента head получаем значение атрибута
            // id и текст вложенных элементов name и department
            Iterator iterator = elements.iterator();
            while (iterator.hasNext()) {
                Element book = (Element) iterator.next();
                String name = book.getChildText("name");
                String year = book.getChildText("year");
                System.out.println(name + ": " + year);
            }
        } catch (JDOMException | IOException e) {
            e.getMessage();
        }
    }
}
