import org.jdom2.Element;

public class Cars extends Element {
    String name;
    String year;
    String body;
    String engine;
    String transmission;

    public Cars(String name, String year, String body, String engine, String transmission) {
        this.year = year;
        this.name = name;
        this.body = body;
        this.engine = engine;
        this.transmission = transmission;
    }

    public String getName() {
        return name;
    }

    public String getYear() {
        return year;
    }

    public String getBody() {
        return body;
    }

    public String getEngine() {
        return engine;
    }

    public String getTransmission() {
        return transmission;
    }
}
