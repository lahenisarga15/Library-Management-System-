public class Main {

    public static void main(String[] args) {

        Library library = new Library();

        // Creating books
        Book book1 = new Book(101, "Java Programming", "James Gosling");
        Book book2 = new Book(102, "Clean Code", "Robert C. Martin");
        Book book3 = new Book(103, "Effective Java", "Joshua Bloch");

        // Creating users
        User user1 = new User(1, "Nisarga");
        User user2 = new User(2, "Priyanka");

        // Adding books
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Adding users
        library.addUser(user1);
        library.addUser(user2);

        // Display data
        library.displayBooks();
        library.displayUsers();

        // Issue book
        System.out.println("\n--- Issue Book ---");
        library.issueBook(101, 1);

        // Display books after issue
        library.displayBooks();

        // Try issuing the same book again
        System.out.println("\n--- Issue Same Book Again ---");
        library.issueBook(101, 2);

        // Return book
        System.out.println("\n--- Return Book ---");
        library.returnBook(101);

        // Display final status
        library.displayBooks();
    }
}
