import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import javax.xml.transform.TransformerException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestXML {

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException, XMLStreamException, TransformerException {
        XMLOutputFactory factory = XMLOutputFactory.newFactory();
        XMLStreamWriter writer = factory.createXMLStreamWriter(new FileOutputStream("war and peace.xml"));
        try {
            writer.writeStartDocument("UTF-8", "1.0");

            writer.writeStartElement("root");

            writer.writeStartElement("book");

            writer.writeStartElement("name");
            writer.writeCharacters("Война и мир");
            writer.writeEndElement();  // name

            writer.writeStartElement("year");
            writer.writeCharacters("1983");
            writer.writeEndElement();  // year

            writer.writeEndElement(); //book1

            writer.writeStartElement("book");

            writer.writeStartElement("name");
            writer.writeCharacters("Архипелаг ГУЛАГ");
            writer.writeEndElement(); // name

            writer.writeStartElement("year");
            writer.writeCharacters("1989");
            writer.writeEndElement(); //year

            writer.writeEndElement(); // book2
            writer.writeEndElement();  //root

            writer.writeEndDocument();
        } finally {
            if (writer != null) {
                writer.close();
            }
        }

    }
}