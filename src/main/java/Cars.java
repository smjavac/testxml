import org.jdom2.Element;

public class Cars {
    private String name;
    private String year;
    private String body;
    private String engine;
    private String transmission;

    public Cars(String name, String year, String body,
                String engine, String transmission) {
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
