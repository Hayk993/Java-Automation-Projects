package homework.task14;

public class Main {
    public static void main(String[] args) {
        Author myAuthor = new Author("Tumanyan", 1869);
        Author myAuthor1 = new Author("Saryan", 1869);

        Book book1 = new Book("Չարի վերջը", myAuthor, 1900);
        Book book2 = new Book("jkh", myAuthor, 1900);
        Book book6 = new Book("bnbj", myAuthor, 1900);
        Helper helper = new Helper();
        Book book3 = new Book("Gevorg Marzpetuni", myAuthor1, 1900);
        Book book4 = new Book("Java", myAuthor1, 1900);
        Book book5 = new Book("C#", myAuthor1, 1900);
        Book[] book = {book1,book2,book3,book4,book5,book6};
        Book [] sortBooks = helper.returnAuthorBook(book,"Tumanyan");
        for (int i = 0; i < sortBooks.length; i++) {
            System.out.println(sortBooks[i].getTitle());
        }
    }
}
