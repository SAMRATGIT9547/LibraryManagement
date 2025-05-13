import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n📚 Library Menu:");
            System.out.println("1. Add Book");
            System.out.println("2. List Books");
            System.out.println("3. Remove Book");
            System.out.println("4. Exit");

            System.out.print("Choose: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter ISBN: ");
                    String isbn = scanner.nextLine();
                    library.addBook(new Book(title, author, isbn));
                    break;
                case 2:
                    library.listBooks();
                    break;
                case 3:
                    System.out.print("Enter ISBN to remove: ");
                    String removeIsbn = scanner.nextLine();
                    library.removeBook(removeIsbn);
                    break;
                case 4:
                    System.out.println("👋 Exiting...");
                    return;
                default:
                    System.out.println("❌ Invalid choice.");
            }
        }
    }
}
