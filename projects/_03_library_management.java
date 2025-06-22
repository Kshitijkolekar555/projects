import java.util.SplittableRandom;

class Library {
    // ANSI color codes
    public static final String RESET = "\u001B[0m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String RED = "\u001B[31m";
    // You have to implement a Library using Java Class Library
    // Methods: addBook, issueBook, returnBook, showAvailableBooks
    // Properties: Array to store the available books,
    // Array to store the issued books
String[] book;
int no_of_books;
public Library(){
    this.book=new String[1000];
    no_of_books=0;
}

public void addBook(String b){
    this.book[no_of_books]=b;
    no_of_books++;
    System.out.println(YELLOW+b+RESET+" has been added!");
}

public void issueBook(String b){
    for (int i = 0; i < this.book.length; i++) {
        if (this.book[i]!=null && this.book[i].equals(b)){
            System.out.println(YELLOW+b+RESET+" this book has been issued.");
            this.book[i]=null;//When this.book[i] is null, calling .equals()
            // on it throws a NullPointerException.
            return;
        }
    }
    System.out.println("This book does not exist");
}
public void returnBook(String b){
    for (int i = 0; i <this.book.length ; i++) {
        if(this.book[i]==null) {
            this.book[i] = b;
            System.out.println(YELLOW+" \""+ this.book[i]+RESET +"\""+ " this book has been successfully returned to the library");
            return;
        }
    }

}
public void showAvailBook(){
    System.out.println("\nAvaiable books are :");
    int i=1;
    for (String element:this.book){
        if(element==null){
            continue;
        }
        System.out.println(i+") "+YELLOW+ element+RESET);
        i++;
    }

}

}
public class _51 {
    public static void main(String[] args) {


        Library centralLibrary=new Library();
        centralLibrary.addBook("Rich Dad Poor Dad");
        centralLibrary.addBook("Algorithm");
        centralLibrary.addBook("C++");
        centralLibrary.addBook("Think and grow Rich ");
        centralLibrary.addBook("Seven habbits of highly effective people");
        centralLibrary.showAvailBook();
        centralLibrary.issueBook("Algorithm");
        centralLibrary.showAvailBook();
        centralLibrary.issueBook("haay");
        centralLibrary.showAvailBook();
        System.out.println(centralLibrary.book.length);
        centralLibrary.returnBook("Algorithm");
        centralLibrary.showAvailBook();


    }
}