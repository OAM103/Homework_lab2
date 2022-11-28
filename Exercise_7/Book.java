

public class Book {
    String name;
    int year;
    String author;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public int getYear() { return year; }
    public void setYear(int year) {
        this.year = year;
    }


    public Book(String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }
    public String toString(){
        return  "Name: " + name +  "; Author: " + author +"; Year: " + year + " | ";
    }

}
