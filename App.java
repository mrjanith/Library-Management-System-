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
    int memberCount = 0;

// ----------------------------------------   Book Entity   ------------------------------------------------
    static String[] bookIds = new String[MAX_BOOKS];
    static String[] bookTitles = new String[MAX_BOOKS];
    static String[] bookAuthors = new String[MAX_BOOKS];
    static String[] bookGenres = new String[MAX_BOOKS];
    static int[] bookPublicationYears = new int[MAX_BOOKS];
    static int[] bookCopiesTotal = new int[MAX_BOOKS];
    static int[] bookCopiesAvailable = new int[MAX_BOOKS];
    int bookCount = 0;


// ----------------------------------------   Borrowing Transaction Entity   ------------------------------------------------
    static int[] transactionIds = new int[MAX_BORROWING_TRANSACTIONS];
    static int[] transactionMemberIds = new int[MAX_BORROWING_TRANSACTIONS];
    static String[] transactionBookIds = new String[MAX_BORROWING_TRANSACTIONS];
    static String[] transactionBorrowDates = new String[MAX_BORROWING_TRANSACTIONS];
    static String[] transactionDueDates = new String[MAX_BORROWING_TRANSACTIONS];
    static String[] transactionReturnDates = new String[MAX_BORROWING_TRANSACTIONS];
    static double[] transactionFineAmounts = new double[MAX_BORROWING_TRANSACTIONS];
    int transactionCount = 0;

// ----------------------------------------   Reservation Entity   ------------------------------------------------
    static int[] reservationIds = new int[MAX_RESERVATIONS];
    static int[] reservationMemberIds = new int[MAX_RESERVATIONS];
    static String[] reservationBookIds = new String[MAX_RESERVATIONS];
    static String[] reservationDates = new String[MAX_RESERVATIONS];
    static String[] reservationStatuses = new String[MAX_RESERVATIONS];
    int reservationCount = 0;


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
        
        borrowMemberIds[0] = 1;
        borrowBookIds[0] = "B001";
        borrowDates[0] = "2023-01-15";
        returnDates[0] = "2023-01-22";

        borrowMemberIds[1] = 2;
        borrowBookIds[1] = "B002";
        borrowDates[1] = "2023-02-10";
        returnDates[1] = "2023-02-17";

        borrowMemberIds[2] = 3;
        borrowBookIds[2] = "B003";
        borrowDates[2] = "2023-03-05";
        returnDates[2] = "2023-03-12";

        borrowMemberIds[3] = 4;
        borrowBookIds[3] = "B004";
        borrowDates[3] = "2023-04-01";
        returnDates[3] = "2023-04-08";

        borrowMemberIds[4] = 5;
        borrowBookIds[4] = "B005";
        borrowDates[4] = "2023-05-20";
        returnDates[4] = "2023-05-27";

    }







    public static void main(String[] args) {

        initializeSampleData();

        while (true) {


        }



    }
}