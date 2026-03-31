package homework.task14;

/*
Ստեղծեք օժանդակ (helper / utility) Կլաս, որտեղ կլինեն մեթոդներ՝
Մեթոդ 1
Ստուգել Եթե pages > 400 վերադարձնել true
Մեթոդ 2
Մեթոդը պետք է վերադարձնի կարդալու ընդհանուր ժամանակը րոպեներով։(1 էջ =3ր)
Մեթոդ 3
Պետք է արտածի Գրքի ամբողջական ինֆորմացիան՝
Մեթոդ 4
Պետք է ստանա Գրքերի զանգված ու Հեղինակ և վերադարձնի մինայն տվյալ հեղինակի գրքերը
 */
public class Helper {


    public boolean pageCountTextExtends400(Book book) {
        return book.getPages() > 400;
    }

    public int readingTimer(Book book) {
        return book.getPages() * 3;
    }

    public void printBookInfo(Book book) {
        System.out.println("Author " + book.getAuthor());
        System.out.println("Title " + book.getTitle());
        System.out.println("Genre " + book.getGenre());
        System.out.println("Price " + book.getPrice());
        System.out.println("PublishYear " + book.getPublishYear());
        System.out.println("Pages " + book.getPages());
    }

    public Book[] returnAuthorBook(Book[] books, String authorName) {
        int k = 0;
        Book[] bookArray = new Book[0];

        for (int i = 0; i < books.length; i++) {
            if (books[i].getAuthor().getName().equals(authorName)) {

                if (k == bookArray.length) {
                    Book[] newArray = new Book[bookArray.length + 1];
                    for (int j = 0; j < bookArray.length; j++) {
                        newArray[j] = bookArray[j];
                    }
                    bookArray = newArray;
                }
                bookArray[k++] = books[i];
            }
        }
        Book[] result = new Book[k];
        for (int j = 0; j < result.length; j++) {
            result[j] = bookArray[j];
        }
        return result;
    }
}
