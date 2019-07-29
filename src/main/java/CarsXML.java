

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jdom2.*;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;


public class CarsXML {

    public static void main(String[] args) {
        List<Cars> carsList = new ArrayList<>();
        Cars car1 = new Cars("Mercedes-Benz", "2011", "sedan", "V8", "automatic");
        Cars car2 = new Cars("BMW", "2015", "sedan", "V6", "automatic");
        Cars car3 = new Cars("Porsche", "2017", "sedan", "V6", "automatic");
        Cars car4 = new Cars("Audi", "2010", "sedan", "V6", "automatic");
        Cars car5 = new Cars("Ford", "2018", "sedan", "1.6", "manual");
        Cars car6 = new Cars("Lada", "2019", "sedan", "1.6", "manual");
        Cars car7 = new Cars("BMW", "2017", "sedan", "V12", "automatic");
        Cars car8 = new Cars("Toyota", "2019", "sedan", "V6", "automatic");
        Cars car9 = new Cars("Land Rover", "2011", "crossover", "V6", "automatic");
        Cars car10 = new Cars("Kia", "2019", "sedan", "1.6", "manual");
        carsAdd(carsList, car1, car2, car3, car4, car5);
        carsAdd(carsList, car6, car7, car8, car9, car10);
//       for (int i = 1; i <=10; i++){
//           carsList.add(car )
//       }
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
        for (Cars cars : carsList) {
            Element car = new Element("car");
            Element name = new Element("name");
            name.addContent(cars.getName());
            Element year = new Element("year");
            year.addContent(cars.getYear());
            Element body = new Element("body");
            body.addContent(cars.getBody());
            Element engine = new Element("engine");
            engine.addContent(cars.getEngine());
            Element transmission = new Element("transmission");
            transmission.addContent(cars.getTransmission());
            car.addContent(name);
            car.addContent(year);
            car.addContent(body);
            car.addContent(engine);
            car.addContent(transmission);
            root.addContent(car);
        }
        Format fmt = Format.getPrettyFormat();
        XMLOutputter outputted = new XMLOutputter(fmt);

        try (FileOutputStream fs = new FileOutputStream("Cars.xml")) {
            outputted.output(document, fs);

        } catch (IOException e) {
            e.getMessage();
        }

    }

    private static void carsAdd(List<Cars> carsList, Cars car1, Cars car2, Cars car3, Cars car4, Cars car5) {
        carsList.add(car1);
        carsList.add(car2);
        carsList.add(car3);
        carsList.add(car4);
        carsList.add(car5);
    }
}