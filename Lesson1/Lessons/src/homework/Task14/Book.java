//Ստեղծել Book Կլաս, որը պետք է ունենա title, Author author, pages, publishYear ,price, genre,
// ընդ որում Գրիք ստեղծելու համար պարտադիր դաշտերն են միայն
//Title, author, publishYear։
// Մնացած դաշտերը կարող են ունենալ լռելյայն արժեքներ կամ լրացվել setter մեթոդներով։
package homework.Task14;

public class Book {

    private String title;
    private Author author;
    private int pages;
    private int publishYear;
    private double price;
    private String genre;

    Book(String title,Author author,int publishYear){
        this.title = title;
        this.author = author;
        this.publishYear = publishYear;
    }
    //get methods
    public String getTitle(){
        return title;
    }
    public Author getAuthor(){
        return author;
    }
    public int getPublishYear(){
        return publishYear;
    }

    public double getPrice() {
        return price;
    }

    public int getPages() {
        return pages;
    }

    public String getGenre() {
        return genre;
    }

    //seter

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

}
