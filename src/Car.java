@MyAnnotation
public class Car {
    private int id;
    private String author;
    public String date;

    public int getId() {
        return id;
    }
    public String getAuthor() {
        return author;
    }
    public void setId(int id) {
        this.id = id;
    }
    @MyAnnotation
    public void setAuthor(String author) {
        this.author = author;
    }

    public Car(int id, String author) {
        this.id = id;
        this.author = author;
    }
    public Car() {
        this.id = id;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
