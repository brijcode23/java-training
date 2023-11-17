public class Book {
    private int id;
    private String name;
    private String author;
    private float price;

    // Constructor
    public Book(int id, String name, String author, float price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public float getPrice() {
        return price;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}

