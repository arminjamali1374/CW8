public class BookArray {


    public static void main(String[] args) {
        Book book1=new Fiction("first");
        Book book2= new Fiction("SECOND");
        Book book3= new Fiction("three");
        Book book4= new Fiction("four");
        Book book5= new Fiction("five");
        Book book6= new NonFiction("SIX");
        Book book7= new NonFiction("SEVEN");
        Book book8= new NonFiction("EIGHT");
        Book book9= new NonFiction("NINE");
        Book book10= new NonFiction("THEN");

        Book []books= {book1,book2,book3,book4,book5,book6,book7,book8,book9,book10};

        for (int i = 0; i < books.length ; i++) {
            System.out.println(books[i].getTitle()+" price is " + books[i].getPrice());
        }
    }

}
