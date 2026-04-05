package homework.Task11;

public class Book {
    String title;
    String author;
    int yearPublished;
    Book(String title,String author,int yearPublished){
    this.title = title;
    this.author = author;
    this.yearPublished = yearPublished;
    }
     void displayInfo(){
         System.out.println("Title " + title);
         System.out.println("Author " + author);
         System.out.println("YearPublished " + yearPublished);
     }
}
