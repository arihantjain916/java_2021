class library{
    String [] books;
    int no_of_books;

    library(){
        books = new String[100];
        no_of_books = 0;
    }
    void addbooks(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println("Book " + book + " has been added ");
        System.out.println();
    }
    void availableboooks(){
        for (String book : this.books) {
            if(book == null){
                continue;
            }
            System.out.println("* " + book);
        }
    }
    void issuebooks(String book){
        for (int i = 0;i<books.length; i++) {
            if(book == this.books[i]){
                System.out.println("The book named " + this.books[i] + " has been issued.");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("Please enter correct book name.");
    }
    void returnbook(String book){
        addbooks(book);
    }
}


public class LMS {
    public static void main(String[] args) {
        library lb = new library();
        lb.addbooks("Learn with Java");
        lb.addbooks("Learn with C");
        lb.addbooks("Learn with Python");
        lb.addbooks("Learn with JavaScript");
        lb.issuebooks("Learn with C");
        System.out.println();
        lb.returnbook("C");
        System.out.println("Available Books are:");
        lb.availableboooks();
    }
}
