import org.jdom2.Element;

public class Book extends Element{
    String name;
    String year;

    public String getName() {
        return name;
    }

    public String getYear() {
        return year;
    }

    public Book(String name, String year){
        this.name = name;
        this.year = year;
    }


}
