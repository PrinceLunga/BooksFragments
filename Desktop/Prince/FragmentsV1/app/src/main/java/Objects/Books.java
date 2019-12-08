package Objects;

import java.util.ArrayList;
import java.util.List;

public class Books {

    private List<Book> list = new ArrayList();

    public Books()
    {
        for(String [] arr : data) list.add(new Book(arr[0], arr[1]));
    }

    public List<Book> getBooks()
    {
        return list;
    }

    private static  final String [][] data = {
            {"Java 1", "Java Basics"},
            {"Java 2", "Java Basics in More deatails"},
            {"Java 3", "JIntroduction to Java "},
            {"Java 4", "Java in Action"},
            {"Java 5", "Introduction to Advance Java"},
            {"Java 6", "Advance Java in more details"},
    };
}
