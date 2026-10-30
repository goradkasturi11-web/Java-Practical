
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class Book {
    int id;
    String title;
    String author;

    // Constructor
    Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }
}

public class LibraryManagementSystem {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Book> books = new ArrayList<>();
        HashMap<Integer, Book> bookMap = new HashMap<>();

        int choice;

        do {
            System.out.println("\n1. Add Book");
            System.out.println("2. Display Book");
            System.out.println("3. Search Book");
            System.out.println("4. Update Book");
            System.out.println("5. Delete Book");
            System.out.println("6. Exit");

            System.out.println("Enter your Choice:");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                // Add Book
                case 1: {
                    System.out.println("Enter Details of book:");

                    System.out.println("Book ID:");
                    int id = sc.nextInt();
                    sc.nextLine();

                    if (bookMap.containsKey(id)) {
                        System.out.println("Book ID already exists");
                        break;
                    }

                    System.out.println("Book Title:");
                    String title = sc.nextLine();

                    System.out.println("Book Author:");
                    String author = sc.nextLine();

                    Book book = new Book(id, title, author);

                    books.add(book);
                    bookMap.put(id, book);

                    System.out.println("Book added Successfully");
                    break;
                }

                // Display Book
                case 2: {
                    if (books.isEmpty()) {
                        System.out.println("Book not Found");
                    } else {
                        for (Book b : books) {
                            System.out.println("Book ID: " + b.id);
                            System.out.println("Book Title: " + b.title);
                            System.out.println("Book Author: " + b.author);
                        }
                    }
                    break;
                }

                // Search Book
                case 3: {
                    System.out.println("Enter ID to find the book:");
                    int key = sc.nextInt();

                    Book b = bookMap.get(key);

                    if (b != null) {
                        System.out.println("Book Found");
                        System.out.println("Book ID: " + b.id);
                        System.out.println("Book Title: " + b.title);
                        System.out.println("Book Author: " + b.author);
                    } else {
                        System.out.println("Book not Found");
                    }
                    break;
                }

                // Update Book
                case 4: {
                    System.out.println("Enter ID to update:");
                    int key = sc.nextInt();
                    sc.nextLine();

                    Book b = bookMap.get(key);

                    if (b != null) {
                        System.out.println("Enter New Title:");
                        b.title = sc.nextLine();

                        System.out.println("Enter New Author:");
                        b.author = sc.nextLine();

                        System.out.println("Book Updated Successfully");
                    } else {
                        System.out.println("Book not Found");
                    }
                    break;
                }

                // Delete Book
                case 5: {
                    System.out.println("Enter ID to delete:");
                    int key = sc.nextInt();

                    Book b = bookMap.remove(key);

                    if (b != null) {
                        books.remove(b);
                        System.out.println("Book Deleted Successfully");
                    } else {
                        System.out.println("Book not Found");
                    }
                    break;
                }

                // Exit
                case 6: {
                    System.out.println("Exiting...");
                    break;
                }

                default: {
                    System.out.println("Invalid Choice");
                }
            }

        } while (choice != 6);

        sc.close();
    }
}
