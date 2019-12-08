package Objects;

public class Book {
    private String name;
    private String text;

    public Book(String name, String text)
    {
        this.name = name;
        this.text = text;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getText()
    {
        return this.text;
    }

    public void setText(String text)
    {
        this.text = text;
    }

    public String toString()
    {
        return name;
    }



}
