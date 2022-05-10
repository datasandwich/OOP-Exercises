public class Library {
    public static void main(String[] args) {
        Author author = new Author("John Johnson","jj@gmail.com",'m');
        Book book = new Book("Barry Botter And The Philosopher Getting Stoned",author,5.50,15);

        System.out.println(book.getAuthor());
        System.out.println(book.getName());
        System.out.println(book.getPrice());
        System.out.println(book.getQty());
    }
}
