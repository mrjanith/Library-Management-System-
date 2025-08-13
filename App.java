import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


class App {
// ---------------  **Maximum Array Sizes**  --------------------
    static final int MAX_MEMBERS = 200;
    static final int MAX_BOOKS = 300;
    static final int MAX_BORROWING_TRANSACTIONS = 500;
    static final int MAX_RESERVATIONS = 100;



// ----------------------------------------   Member Entity ------------------------------------------------
    static int[] memberIds = new int[MAX_MEMBERS];
    static String[] memberNames = new String[MAX_MEMBERS];
    static String[] memberAddresses = new String[MAX_MEMBERS];
    static String[] memberPhoneNumbers = new String[MAX_MEMBERS];
    static String[] memberMembershipTypes = new String[MAX_MEMBERS];
    static int memberCount = 0;

// ----------------------------------------   Book Entity   ------------------------------------------------
    static String[] bookIds = new String[MAX_BOOKS];
    static String[] bookTitles = new String[MAX_BOOKS];
    static String[] bookAuthors = new String[MAX_BOOKS];
    static String[] bookGenres = new String[MAX_BOOKS];
    static int[] bookPublicationYears = new int[MAX_BOOKS];
    static int[] bookCopiesTotal = new int[MAX_BOOKS];
    static int[] bookCopiesAvailable = new int[MAX_BOOKS];
    static int bookCount = 0;


// ----------------------------------------   Borrowing Transaction Entity   ------------------------------------------------
    static int[] transactionIds = new int[MAX_BORROWING_TRANSACTIONS];
    static int[] transactionMemberIds = new int[MAX_BORROWING_TRANSACTIONS];
    static String[] transactionBookIds = new String[MAX_BORROWING_TRANSACTIONS];
    static String[] transactionBorrowDates = new String[MAX_BORROWING_TRANSACTIONS];
    static String[] transactionDueDates = new String[MAX_BORROWING_TRANSACTIONS];
    static String[] transactionReturnDates = new String[MAX_BORROWING_TRANSACTIONS];
    static double[] transactionFineAmounts = new double[MAX_BORROWING_TRANSACTIONS];
    static int transactionCount = 0;

// ----------------------------------------   Reservation Entity   ------------------------------------------------
    static int[] reservationIds = new int[MAX_RESERVATIONS];
    static int[] reservationMemberIds = new int[MAX_RESERVATIONS];
    static String[] reservationBookIds = new String[MAX_RESERVATIONS];
    static String[] reservationDates = new String[MAX_RESERVATIONS];
    static String[] reservationStatuses = new String[MAX_RESERVATIONS];
    static int reservationCount = 0;




    static Scanner scanner = new Scanner(System.in);

// Method to initialize sample data
    static void initializeSampleData() {

        // Sample members
        memberIds[0] = 1;
        memberNames[0] = "Alice Smith";
        memberAddresses[0] = "123 Elm St";
        memberPhoneNumbers[0] = "555-1234";
        memberMembershipTypes[0] = "Regular";
        

        memberIds[1] = 2;
        memberNames[1] = "Bob Johnson";
        memberAddresses[1] = "456 Oak St";
        memberPhoneNumbers[1] = "555-5678";
        memberMembershipTypes[1] = "Ultimate";


        memberIds[2] = 3;
        memberNames[2] = "Charlie Brown";
        memberAddresses[2] = "789 Pine St";
        memberPhoneNumbers[2] = "555-8765";
        memberMembershipTypes[2] = "Regular";
        

        memberIds[3] = 4;
        memberNames[3] = "David Wilson";
        memberAddresses[3] = "321 Maple St";
        memberPhoneNumbers[3] = "555-4321";
        memberMembershipTypes[3] = "Premium";
        

        memberIds[4] = 5;
        memberNames[4] = "Eva Green";
        memberAddresses[4] = "654 Cedar St";
        memberPhoneNumbers[4] = "555-9876";
        memberMembershipTypes[4] = "Guest";

        memberCount = 5; // Total members initialized



        // Sample books
        bookIds[0] = "B001";
        bookTitles[0] = "Effective Java";
        bookAuthors[0] = "Joshua Bloch";
        bookGenres[0] = "Programming";
        bookPublicationYears[0] = 2018;
        bookCopiesTotal[0] = 5;
        bookCopiesAvailable[0] = 3;
       

        bookIds[1] = "B002";
        bookTitles[1] = "Atomic Habits";
        bookAuthors[1] = "James Clear";
        bookGenres[1] = "Self-help";
        bookPublicationYears[1] = 2018;
        bookCopiesTotal[1] = 4;
        bookCopiesAvailable[1] = 2;

        bookIds[2] = "B003";
        bookTitles[2] = "Harry Potter and the Sorcerer's Stone";
        bookAuthors[2] = "J.K. Rowling";
        bookGenres[2] = "Fantasy";
        bookPublicationYears[2] = 1997;
        bookCopiesTotal[2] = 3;
        bookCopiesAvailable[2] = 1;

        bookIds[3] = "B004";
        bookTitles[3] = "The Great Gatsby";
        bookAuthors[3] = "F. Scott Fitzgerald";
        bookGenres[3] = "Classic";
        bookPublicationYears[3] = 1925;
        bookCopiesTotal[3] = 2;
        bookCopiesAvailable[3] = 0;

        bookIds[4] = "B005";
        bookTitles[4] = "To Kill a Mockingbird";
        bookAuthors[4] = "Harper Lee";
        bookGenres[4] = "Classic";
        bookPublicationYears[4] = 1960;
        bookCopiesTotal[4] = 4;
        bookCopiesAvailable[4] = 2;

        bookIds[5] = "B006";
        bookTitles[5] = "Scooby-Doo";
        bookAuthors[5] = "Hanna-Barbera";
        bookGenres[5] = "Children";
        bookPublicationYears[5] = 1951;
        bookCopiesTotal[5] = 3;
        bookCopiesAvailable[5] = 1;


        bookIds[6] = "B007";
        bookTitles[6] = "Tintin";
        bookAuthors[6] = "Hergé";
        bookGenres[6] = "Adventure";
        bookPublicationYears[6] = 1957;
        bookCopiesTotal[6] = 5;
        bookCopiesAvailable[6] = 3;

        bookIds[7] = "B008";
        bookTitles[7] = "Queen of the Black Coast";
        bookAuthors[7] = "René Goscinny";
        bookGenres[7] = "Adventure";
        bookPublicationYears[7] = 1960;
        bookCopiesTotal[7] = 4;
        bookCopiesAvailable[7] = 2;

        bookIds[8] = "B009";
        bookTitles[8] = "The Catcher in the Rye";
        bookAuthors[8] = "J.D. Salinger";
        bookGenres[8] = "Classic";
        bookPublicationYears[8] = 1951;
        bookCopiesTotal[8] = 3;
        bookCopiesAvailable[8] = 1;

        bookIds[9] = "B010";
        bookTitles[9] = "The Hobbit";
        bookAuthors[9] = "J.R.R. Tolkien";
        bookGenres[9] = "Fantasy";
        bookPublicationYears[9] = 1937;
        bookCopiesTotal[9] = 5;
        bookCopiesAvailable[9] = 2;

        bookCount = 10; // Total books initialized


        // Sample borrowing transactions
        transactionIds[0] = 1;
        transactionMemberIds[0] = 1; // Alice Smith
        transactionBookIds[0] = "B001";
        transactionBorrowDates[0] = "2023-01-15";
        transactionDueDates[0] = "2023-01-22";
        transactionReturnDates[0] = "2023-01-22";
        transactionFineAmounts[0] = 100.00;

        transactionIds[1] = 2;
        transactionMemberIds[1] = 2; // Bob Johnson
        transactionBookIds[1] = "B002";
        transactionBorrowDates[1] = "2023-02-10";
        transactionDueDates[1] = "2023-02-17";
        transactionReturnDates[1] = "2023-02-17";
        transactionFineAmounts[1] = 100.00;

        transactionIds[2] = 3;
        transactionMemberIds[2] = 3; // Charlie Brown
        transactionBookIds[2] = "B003";
        transactionBorrowDates[2] = "2023-03-05";
        transactionDueDates[2] = "2023-03-12";
        transactionReturnDates[2] = "2023-03-12";
        transactionFineAmounts[2] = 100.00;

        transactionCount = 3;

        System.out.println("Sample data initialized successfully.");
        System.out.println();
    }


// Method to display the main menu
    static void displayMainMenu() {
        System.out.println("\nLibrary Management System");
       
        System.out.println("1. Manage Members");
        System.out.println("2. Manage Books");
        System.out.println("3. Borrowing Operations");
        System.out.println("4. Reservation");
        System.out.println("5. Generate Reports");
        System.out.println("6. Exit");
        System.out.println();
        System.out.print("Enter your choice: ");
    }



    // -------------------------------------------------------      Member Management     --------------------------------------------------------





    static void manageMembers() {
        while (true) {
            System.out.println("\nMember Management");
            System.out.println("1. Add Member");
            System.out.println("2. View All Members");
            System.out.println("3. Search Member");
            System.out.println("4. Update Members");
            System.out.println("5. Back to Main Menu");
            System.out.print("Enter your choice: ");

            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    addMember();
                    break;
                case 2:
                    viewMembers();
                    break;
                case 3:
                    searchMember();
                    break;
                case 4:
                    updateMember();
                    break;
                case 5:
                    return; // Go back to main menu
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }



    // Method to add a new member
    static void addMember() {
        if (memberCount >= MAX_MEMBERS) {
            System.out.println("Member limit reached. Cannot add more members.");
            return;
        }

        System.out.print("Enter Member ID: ");
        int memberId = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        for (int i = 0; i < memberCount; i++) {
            if (memberIds[i] == memberId) {
                System.out.println("Member ID already exists. Please enter a unique ID.");
                return;
            }
        }

        System.out.print("Enter Member Name: ");
        String memberName = scanner.nextLine();

        System.out.print("Enter Member Address: ");
        String memberAddress = scanner.nextLine();

        System.out.print("Enter Member Phone Number: ");
        String memberPhoneNumber = scanner.nextLine();

        System.out.print("Enter Membership Type (Regular/Premium/Ultimate/Guest): ");
        String membershipType = scanner.nextLine();

        // Add member details to arrays
        memberIds[memberCount] = memberId;
        memberNames[memberCount] = memberName;
        memberAddresses[memberCount] = memberAddress;
        memberPhoneNumbers[memberCount] = memberPhoneNumber;
        memberMembershipTypes[memberCount] = membershipType;

        memberCount++;
        System.out.println("Member added successfully.");
        
    }


    // Method to view all members
    static void viewMembers() {
        if (memberCount == 0) {
            System.out.println("No members found.");
            return;
        }

        System.out.println("\n==== MEMBER LIST ====");
        System.out.printf("%-10s %-20s %-30s %-15s %-15s\n", "Member ID", "Name", "Address", "Phone Number", "Membership Type");
        System.out.println("--------------------------------------------------------------------------------------------------");

        for (int i = 0; i < memberCount; i++) {
            System.out.printf("%-10d %-20s %-30s %-15s %-15s\n",
                    memberIds[i], memberNames[i], memberAddresses[i], memberPhoneNumbers[i], memberMembershipTypes[i]);
        }

    }
    


    // Method to search for a member
    static void searchMember() {
        if (memberCount == 0) {
            System.out.println("No members found.");
            return;
        }

        System.out.print("Enter Member ID to search: ");
        int memberId = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        for (int i = 0; i < memberCount; i++) {
            if (memberIds[i] == memberId) {
                System.out.println("\nMember found:");
                System.out.printf("ID: %d\n", memberIds[i]);
                System.out.printf("Name: %s\n", memberNames[i]);
                System.out.printf("Address: %s\n", memberAddresses[i]);
                System.out.printf("Phone Number: %s\n", memberPhoneNumbers[i]);
                System.out.printf("Membership Type: %s\n", memberMembershipTypes[i]);
                return;
            }
        }

        System.out.println("Member not found.");
    }




    // Method to update member details
    static void updateMember() {
        System.out.print("Enter Member ID to update: ");
        int memberId = scanner.nextInt();
        scanner.nextLine(); // Consume newline character



        for (int i = 0; i < memberCount; i++) {

            System.out.println();
            System.out.println("Current details for Member ID " + memberId + ":");
            System.out.println();
            System.out.printf("Name: %s\n", memberNames[i]);
            System.out.printf("Address: %s\n", memberAddresses[i]);
            System.out.printf("Phone Number: %s\n", memberPhoneNumbers[i]);
            System.out.printf("Membership Type: %s\n", memberMembershipTypes[i]);
            System.out.println();

            if (memberIds[i] == memberId) {
                System.out.println("Enter new Member Name: (or enter to keep current) ");
                String newName = scanner.nextLine();
                if (!newName.trim().isEmpty()) {
                    memberNames[i] = newName;
                }

                System.out.println("Enter new Member Address: (or enter to keep current) ");
                String newAddress = scanner.nextLine();
                if (!newAddress.trim().isEmpty()) {
                    memberAddresses[i] = newAddress;
                }

                System.out.println("Enter new Member Phone Number: (or enter to keep current) ");
                String newPhoneNumber = scanner.nextLine();
                if (!newPhoneNumber.trim().isEmpty()) {
                    memberPhoneNumbers[i] = newPhoneNumber;
                }

                System.out.println("Enter new Membership Type (Regular/Premium/Ultimate/Guest): ");
                String newMembershipType = scanner.nextLine();
                if (!newMembershipType.trim().isEmpty()) {
                    memberMembershipTypes[i] = newMembershipType;
                }

                System.out.println("Member details updated successfully.");
                return;
            }
        }

        System.out.println("Member ID not found.");
    }




// ---------------------------------------------------------   BOOKS MANAGEMENT -----------------------------------------------------------------------------


    static void manageBooks() {
        while (true) {
            System.out.println("\n==== Book Management ====");
            System.out.println();
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Search Book");
            System.out.println("4. Update Book");
            System.out.println("5. Manage Availability");
            System.out.println("6. Back to Main Menu");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    viewAllBooks();
                    break;
                case 3:
                    searchBook();
                    break;
                case 4:
                    updateBook();
                    break;
                case 5:
                    bookAvailabilityManagement();
                    break;
                case 6:
                    return; // Go back to main menu
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }



// Method to add books

    static void addBook() {

        if (bookCount >= MAX_BOOKS) {
            System.out.println("Cannot add more books. Maximum limit reached.");
            return;
        }

        System.out.println("Enter Book ID: ");
        String bookId = scanner.nextLine();

        for (int i = 0; i < bookCount; i++) {
            if (bookIds[i].equals(bookId)) {
                System.out.println("Book ID already exists. Please enter a unique ID.");
                return;
            }
        }

        System.out.println("Enter Book Title: ");
        String title = scanner.nextLine();

        System.out.println("Enter Book Author: ");
        String author = scanner.nextLine();

        System.out.println("Enter Book genre: ");
        String genre = scanner.nextLine();

        System.out.println("Enter Book Publication Year: ");
        int publicationYear = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        System.out.println("Enter Total Copies: ");
        int totalCopies = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        bookCount++;

        System.out.println("Book added successfully.");

    }



// Method to View ALL Books

    static void viewAllBooks() {

        if (bookCount == 0) {
            System.out.println("No books available.");
            return;
        }

        System.out.println("==== List of All Books ====");

        System.out.println();
        System.out.printf("%-15s %-30s %-20s %-15s %-20s %-15s%n", 
          "Book ID", "Title", "Author", "Genre", "Publication Year", "Copies Available");
        System.out.println("----------------------------------------------------------------------------------------------------");


        for (int i = 0; i < bookCount; i++) {
            System.out.printf("%-15s %-30s %-20s %-15s %-20d %-15d%n", 
              bookIds[i],
              bookTitles[i],
              bookAuthors[i],
              bookGenres[i],
              bookPublicationYears[i],
              bookCopiesAvailable[i]);
        }
    }


// Method to search for a book
    static void searchBook() {
        if (bookCount == 0) {
            System.out.println("No books available for search.");
            return;
        }

        System.out.println("Enter Book ID to search: ");
        String bookId = scanner.nextLine();

        for (int i = 0; i < bookCount; i++) {
            if (bookIds[i].equals(bookId)) {
                System.out.println("Book found:");
                System.out.printf("%-15s %-30s %-20s %-15s %-20d %-15d%n",
                        bookIds[i],
                        bookTitles[i],
                        bookAuthors[i],
                        bookGenres[i],
                        bookPublicationYears[i],
                        bookCopiesAvailable[i]);
                return;
            }
        }

        System.out.println("Book not found.");
    }



// Method to Update Books
    static void updateBook() {
        System.out.println("Enter Book ID to update: ");
        String bookId = scanner.nextLine();

        for (int i = 0; i < bookCount; i++) {
            if (bookIds[i].equals(bookId)) {
                System.out.println("Current details for Book ID " + bookId + ":");
                System.out.printf("Title: %s\n", bookTitles[i]);
                System.out.printf("Author: %s\n", bookAuthors[i]);
                System.out.printf("Genre: %s\n", bookGenres[i]);
                System.out.printf("Publication Year: %d\n", bookPublicationYears[i]);
                System.out.printf("Copies Available: %d\n", bookCopiesAvailable[i]);
                System.out.println();

                System.out.println("Enter new Title (or press Enter to keep current): ");
                String newTitle = scanner.nextLine();
                if (!newTitle.trim().isEmpty()) {
                    bookTitles[i] = newTitle;
                }

                System.out.println("Enter new Author (or press Enter to keep current): ");
                String newAuthor = scanner.nextLine();
                if (!newAuthor.trim().isEmpty()) {
                    bookAuthors[i] = newAuthor;
                }

                System.out.println("Enter new Genre (or press Enter to keep current): ");
                String newGenre = scanner.nextLine();
                if (!newGenre.trim().isEmpty()) {
                    bookGenres[i] = newGenre;
                }

                System.out.println("Enter new Publication Year (or press Enter to keep current): ");
                String publicationYearInput = scanner.nextLine();
                if (!publicationYearInput.trim().isEmpty()) {
                    int newPublicationYear = Integer.parseInt(publicationYearInput);
                    bookPublicationYears[i] = newPublicationYear;
                }

                System.out.println("Enter new Copies Available (or press Enter to keep current): ");
                String copiesAvailableInput = scanner.nextLine();
                if (!copiesAvailableInput.trim().isEmpty()) {
                    int newCopiesAvailable = Integer.parseInt(copiesAvailableInput);
                    bookCopiesAvailable[i] = newCopiesAvailable;
                }

                System.out.println("Book details updated successfully.");
                return;
            }
        }

        System.out.println("Book ID not found.");

        
    }



    // Method to Book Available Management
    static void bookAvailabilityManagement() {

        if (bookCount == 0) {
            System.out.println("No books available for management.");
            return;
        }
        System.out.println("==== BOOK AVAILABILITY MANAGEMENT ====");
        System.out.println("1. Add Book Copies");
        System.out.println("2. Remove Book Copies");
        System.out.println("3. Track Book Copies");
        System.out.println("4. Back to Main Menu");
        System.out.println();

        System.out.println("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        switch (choice) {
            case 1:
                addBookCopies();
                break;
            case 2:
                removeBookCopies();
                break;
            case 3:
                trackBookCopies();
                break;
            case 4:
                return;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    // Method to add book copies
    static void addBookCopies() {
        System.out.println("==== ADD BOOK COPIES ====");
        System.out.println();
        System.out.println("Enter Book ID: ");
        String bookId = scanner.nextLine();

        for (int i = 0; i < bookCount; i++) {
            if (bookIds[i].equals(bookId)) {
                System.out.println("Current Copies Available: " + bookCopiesAvailable[i]);
                System.out.println();
                System.out.println("Enter number of copies to add: ");
                int copiesToAdd = scanner.nextInt();
                scanner.nextLine(); // Consume newline character
                bookCopiesAvailable[i] += copiesToAdd;
                System.out.println("Book copies added successfully.");
                bookCopiesTotal[i] += copiesToAdd; // Update total copies as well
                System.out.println();
                System.out.println("Current Copies in Library: " + bookCopiesAvailable[i]);
                return;
            }
        }

        System.out.println("Book ID not found.");
    }

    // Method to remove Copies
    static void removeBookCopies() {
        System.out.println("==== REMOVE BOOK COPIES ====");
        System.out.println();
        System.out.println("Enter Book ID: ");
        String bookId = scanner.nextLine();

        for (int i = 0; i < bookCount; i++) {
            if (bookIds[i].equals(bookId)) {
                System.out.println("Current Copies Available: " + bookCopiesAvailable[i]);
                System.out.println();
                System.out.println("Enter number of copies to remove: ");
                int copiesToRemove = scanner.nextInt();
                scanner.nextLine(); // Consume newline character
                if (copiesToRemove > bookCopiesAvailable[i]) {
                    System.out.println("Cannot remove more copies than available.");
                } else {
                    bookCopiesAvailable[i] -= copiesToRemove;
                    bookCopiesTotal[i] -= copiesToRemove;
                    System.out.println("Book copies removed successfully.");
                    System.out.println();
                    System.out.println("Current Copies in Library: " + bookCopiesAvailable[i]);
                }
                return;
            }
        }

        System.out.println("Book ID not found.");
    }


    // Method to track book copies
    static void trackBookCopies() {
        System.out.println("==== TRACK BOOK COPIES ====");
        System.out.println();
        System.out.println("Enter Book ID: ");
        String bookId = scanner.nextLine();

        for (int i = 0; i < bookCount; i++) {
            if (bookIds[i].equals(bookId)) {
                System.out.println("Current Copies Available: " + bookCopiesAvailable[i]);
                System.out.println("Total Copies in Library: " + bookCopiesTotal[i]);
                return;
            }
        }

        System.out.println("Book ID not found.");
    }





// ----------------------------------------------------------- Borrowing Operations ------------------------------------------------------------------------------------

    static void manageBorrowingOperations() {
        if (bookCount == 0) {
            System.out.println("No books available for borrowing.");
            return;
        } 

        if (memberCount == 0) {
            System.out.println("No members available for borrowing.");
            return;
        }

        System.out.println("==== BORROWING OPERATIONS ====");
        System.out.println();

        while (true) {
            // Display borrowing menu options
            System.out.println("1. Borrow Book");
            System.out.println("2. Return Book");
            System.out.println("3. Back to Main Menu");
            System.out.print("Enter your choice: ");

            // Get user input
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    borrowBook();
                    break;
                case 2:
                    //returnBook();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }



    // Method to Borrrow Books

    static void borrowBook() {
      int borrowBookCount = 1;

      while (borrowBookCount <= 3) {
        System.out.println("==== BORROW BOOK ====");
        System.out.println();

        System.out.print("Enter Member ID: ");
        int memberId = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        // Check if member exists
        
        boolean memberFound = false;
        for (int i = 0; i < memberCount; i++) {
            if (memberIds[i] == memberId) {
                memberFound = true;
                break;
            }
        }

        if (!memberFound) {
            System.out.println("Member ID not found.");
            return;
        }

        System.out.print("Enter Book ID to borrow: ");
        String bookId = scanner.nextLine();

        boolean bookFound = false;
        for (int i = 0; i < bookCount; i++) {
            if (bookIds[i].equals(bookId)) {
                bookFound = true;
                if (bookCopiesAvailable[i] <= 0) {
                    System.out.println("No copies available for this book.");
                    return;
                }
                break;
            }
        }

        if (!bookFound) {
            System.out.println("Book ID not found.");
            return;
        }

        // Create a new borrowing transaction
        transactionIds[transactionCount] = transactionCount + 1; // Incremental transaction ID
        transactionMemberIds[transactionCount] = memberId;
        transactionBookIds[transactionCount] = bookId;

        // Get current date as borrow date
        transactionBorrowDates[transactionCount] = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")); // Placeholder for current date
        transactionDueDates[transactionCount] = LocalDate.now().plusDays(14).format(DateTimeFormatter.ofPattern("yyyy-MM-dd")); // Placeholder for due date
        transactionReturnDates[transactionCount] = ""; // Not returned yet
        transactionFineAmounts[transactionCount] = 0.0; // No fine initially

        // Update book availability
        for (int i = 0; i < bookCount; i++) {
            if (bookIds[i].equals(bookId)) {
                bookCopiesAvailable[i]--;
                break;
            }
        }

        transactionCount++;
        System.out.println("Book borrowed successfully.");
        System.out.println();

        if (borrowBookCount == 3) {
          System.out.println("You have reached the maximum number of borrow attempts.");
          return;
        }else if (borrowBookCount == 2) {
            System.out.println("You can borrow one more book. (or If you don't want to borrow more books, you can return to the main menu. Press -1)");
            System.out.println();
            System.out.println("If you want to borrow more books, please press Enter.");
            String input = scanner.nextLine();

            if (!input.isEmpty()) {
                borrowBookCount++;
                continue;
            }else if (input.equals("-1")) {
                return; // Exit borrowing operation
            }

        }else if (borrowBookCount == 1) {
            System.out.println("You can borrow two more books. (or If you don't want to borrow more books, you can return to the main menu. Press -1)");
            System.out.println();
            System.out.println("If you want to borrow more books, please press Enter.");
            String input = scanner.nextLine();
            if (!input.isEmpty()) {
                borrowBookCount++;
                continue;
            }else if (input.equals("-1")) {
                return; // Exit borrowing operation 
            }

        

      }

      }

    }


    // Method to Return Books

    static void returnBook() {
        if (transactionCount == 0) {
            System.out.println("No borrowing transactions found.");
            return;
        }

        System.out.println("==== RETURN BOOK ====");
        System.out.println();

        System.out.print("Enter Member ID: ");
        int memberId = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        // Check if member exists
        boolean memberFound = false;
        for (int i = 0; i < memberCount; i++) {
            if (memberIds[i] == memberId) {
                memberFound = true;
                break;
            }
        }

        if (!memberFound) {
            System.out.println("Member ID not found.");
            return;
        }

        System.out.print("Enter Book ID to return: ");
        String bookId = scanner.nextLine();

        boolean transactionFound = false;
        for (int i = 0; i < transactionCount; i++) {
            if (transactionMemberIds[i] == memberId && transactionBookIds[i].equals(bookId) && transactionReturnDates[i].isEmpty()) {
                transactionFound = true;

                // Set return date to current date
                transactionReturnDates[i] = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));

                // Calculate fine if any
                LocalDate dueDate = LocalDate.parse(transactionDueDates[i], DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                LocalDate returnDate = LocalDate.parse(transactionReturnDates[i], DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                if (returnDate.isAfter(dueDate)) {
                    long daysLate = returnDate.toEpochDay() - dueDate.toEpochDay();
                    transactionFineAmounts[i] = daysLate * 100.0; // Assuming a fine of $100 per day late
                    System.out.printf("Book returned late. Fine amount: $%.2f%n", transactionFineAmounts[i]);
                } else {
                    transactionFineAmounts[i] = 0.0; // No fine
                    System.out.println("Book returned on time. No fine.");
                }

                // Update book availability
                for (int j = 0; j < bookCount; j++) {
                    if (bookIds[j].equals(bookId)) {
                        bookCopiesAvailable[j]++;
                        break;
                    }
                }

                System.out.println("Book returned successfully.");
                return;
            }
        }

        if (!transactionFound) {
            System.out.println("No borrowing record found for this book and member.");
        }
    }




// ------------------------------------------------------------- RESERVATION System Module -----------------------------------------------------------------------------------


    static void manageReservation() {


    while (true) {
        System.out.println("\n==== Reservation Management ====");
        System.out.println("1. Add Reservation");
        System.out.println("2. View All Reservations");
        System.out.println("3. Cancel Reservation");
        System.out.println("4. Back to Main Menu");
        
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        switch (choice) {
            case 1:
                addReservation();
                break;
            case 2:
                viewAllReservations();
                break;
            case 3:
                cancelReservation();
                break;
            case 4:
                return; // Go back to main menu
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }


    }



    static void addReservation() {
    System.out.println("==== ADD RESERVATION ====");
    System.out.println();

    System.out.print("Enter Member ID: ");
    int memberId = scanner.nextInt();
    scanner.nextLine(); // Consume newline character

    // Check if member exists
    boolean memberFound = false;
    for (int i = 0; i < memberCount; i++) {
        if (memberIds[i] == memberId) {
            memberFound = true;
            break;
        }
    }

    if (!memberFound) {
        System.out.println("Member ID not found.");
        return;
    }

    System.out.print("Enter Book ID to reserve: ");
    String bookId = scanner.nextLine();

    boolean bookFound = false;
    for (int i = 0; i < bookCount; i++) {
        if (bookIds[i].equals(bookId)) {
            bookFound = true;
            break;
        }
    }

    if (!bookFound) {
        System.out.println("Book ID not found.");
        return;
    }

    reservationIds[reservationCount] = reservationCount + 1; // Incremental reservation ID
    reservationBookIds[reservationCount] = bookId;
    reservationMemberIds[reservationCount] = memberId;
    reservationDates[reservationCount] = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")); // Current date as reservation date
    reservationStatuses[reservationCount] = "Active";
    reservationCount++;

    // Add reservation logic here
    // For simplicity, we will just print a confirmation message
    System.out.println("Reservation added successfully for Member ID " + memberId + " and Book ID " + bookId);


    }   



    static void viewAllReservations() {
        if (reservationCount == 0) {
            System.out.println("No reservations found.");
            return;
        }

        System.out.println("==== ALL RESERVATIONS ====");
        for (int i = 0; i < reservationCount; i++) {
            System.out.println("Reservation ID: " + reservationIds[i]);
            System.out.println("Member ID: " + reservationMemberIds[i]);
            System.out.println("Book ID: " + reservationBookIds[i]);
            System.out.println("Reservation Date: " + reservationDates[i]);
            System.out.println("Status: " + reservationStatuses[i]);
            System.out.println("-------------------------");
            System.out.println();
        }

        
    }

    static void cancelReservation() {
        if (reservationCount == 0) {
            System.out.println("No reservations found.");
            return;
        }

        System.out.println("==== CANCEL RESERVATION ====");
        System.out.println();

        System.out.print("Enter Reservation ID to cancel: ");
        int reservationId = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        boolean reservationFound = false;
        for (int i = 0; i < reservationCount; i++) {
            if (reservationIds[i] == reservationId) {
                reservationFound = true;
                reservationStatuses[i] = "Cancelled"; // Update status to cancelled
                System.out.println("Reservation cancelled successfully.");
                return;
            }
        }

        if (!reservationFound) {
            System.out.println("Reservation ID not found.");
        }

    }





// -----------------------------------------------------   REPORT GENERATION   -----------------------------------------------------

    static void generateReports() {
        System.out.println("\n====== REPORT GENERATION ======");
        System.out.println("1. Library Statistics");
        System.out.println("2. Member Activity Report");
        System.out.println("3. Popular Books Report");
        System.out.println("4. Overdue Books Report");
        System.out.println("5. Back to Main Menu");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        switch (choice) {
            case 1:
                generateLibraryStatistics();
                break;
            case 2:
                generateMemberActivityReport();
                break;
            case 3:
                generatePopularBooksReport();
                break;
            case 4:
                generateOverdueBooksReport();
                break;
            case 5:
                return; // Go back to main menu
            default:
                System.out.println("Invalid choice. Please try again.");
        }


    }


// Method to generate library statistics report
static void generateLibraryStatistics() {
    System.out.println("\n====== LIBRARY STATISTICS ======");
    System.out.println("Total Members: " + memberCount);
    System.out.println("Total Books: " + bookCount);
    System.out.println("Total Borrowed Books: " + borrowedBookCount);
    System.out.println("Total Reservations: " + reservationCount);
    System.out.println("===============================");
}





// ---------------------------------------------------------   MAIN APPLICATION   -----------------------------------------------------------------------------



    public static void main(String[] args) {

        initializeSampleData();
        System.out.println("==== WELCOME TO THE LIBRARY MANAGEMENT SYSTEM ====");
        System.out.println();

        

        while (true) {

            // Display menu options
            displayMainMenu();

            // Get user input
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    manageMembers();
                    break;
                case 2:
                    manageBooks();
                    break;
                case 3:
                    manageBorrowingOperations();
                    break;
                case 4:
                    manageReservation();
                    break;
                case 5:
                    generateReports();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }



    }
}