# Java Console Library Management System Assignment

## Course Information
- **Course:** Programming Fundamentals / Java Programming
- **Assignment Type:** Console Application Development
- **Programming Paradigm:** Procedural Programming (No OOP)
- **Duration:** 2-3 Weeks
- **Total Marks:** 100

## Assignment Overview
Students are required to develop a comprehensive Library Management System using Java console application. This assignment focuses on implementing a complete library management system using only procedural programming concepts, arrays, and fundamental programming constructs without object-oriented programming (OOP) principles.

## Learning Objectives
Upon completion of this assignment, students will be able to:
1. Apply procedural programming concepts to solve real-world library management problems
2. Implement data management using arrays and 2D arrays effectively
3. Design and develop menu-driven console applications with user-friendly interfaces
4. Handle data validation and error checking in library applications
5. Create comprehensive reporting systems for library analytics
6. Manage data relationships between multiple entities without using objects
7. Implement CRUD operations (Create, Read, Update, Delete) using procedural approaches

## System Requirements

### Database Schema
The system must manage the following entities using separate arrays:

#### Member Entity
- **Member ID** (int) - Primary Key
- **Name** (String) - Member full name
- **Address** (String) - Member address
- **Phone Number** (String) - Contact information
- **Membership Type** (String) - Regular/Premium/Student

#### Book Entity
- **Book ID** (String) - Primary Key
- **Title** (String) - Book title
- **Author** (String) - Book author
- **Genre** (String) - Book category
- **Publication Year** (int) - Year published
- **Total Copies** (int) - Total books available
- **Available Copies** (int) - Currently available books

#### Borrowing Transaction Entity
- **Transaction ID** (int) - Primary Key
- **Member ID** (int) - Foreign Key referencing Member
- **Book ID** (String) - Foreign Key referencing Book
- **Borrow Date** (String) - Date book was borrowed
- **Due Date** (String) - Return due date
- **Return Date** (String) - Actual return date (null if not returned)
- **Fine Amount** (double) - Late return fine

#### Reservation Entity
- **Reservation ID** (int) - Primary Key
- **Member ID** (int) - Foreign Key referencing Member
- **Book ID** (String) - Foreign Key referencing Book
- **Reservation Date** (String) - Date of reservation
- **Status** (String) - Active/Fulfilled/Cancelled

## Technical Constraints

### Mandatory Requirements
1. **No Object-Oriented Programming** - No classes (except main class), objects, inheritance, or encapsulation
2. **Procedural Programming Only** - Use only static methods and functions
3. **Array-Based Data Storage** - All data must be stored in arrays or 2D arrays
4. **Loop-Based Operations** - Use loops for all data processing and searching
5. **Console Interface** - Text-based menu system only
6. **No External Libraries** - Use only standard Java libraries

### Data Structure Requirements
**Maximum Array Sizes:**
- Members: 200 records
- Books: 300 records
- Borrowing Transactions: 500 records
- Reservations: 100 records

**Data Persistence:** In-memory storage only (data resets on program restart)

## Functional Requirements

### 1. Member Management Module (20 Marks)

#### 1.1 Add Member (5 marks)
- Input validation for member ID uniqueness
- Capture member details (ID, name, address, phone, membership type)
- Prevent duplicate member IDs
- Display success/error messages

#### 1.2 View All Members (3 marks)
- Display all members in tabular format
- Show member ID, name, address, phone, and membership type
- Handle empty member list scenario

#### 1.3 Search Member (4 marks)
- Search by member ID or name
- Display complete member information
- Handle member not found scenarios

#### 1.4 Update Member (8 marks)
- Find member by ID
- Allow selective field updates
- Maintain data integrity
- Confirm successful updates

### 2. Book Management Module (20 Marks)

#### 2.1 Add Book (5 marks)
- Unique book ID validation
- Input book details (ID, title, author, genre, year, copies)
- Prevent duplicate book IDs
- Display confirmation messages

#### 2.2 View All Books (3 marks)
- Tabular display of all books
- Show ID, title, author, genre, year, and availability
- Handle empty library scenarios

#### 2.3 Search Book (4 marks)
- Search by book ID, title, or author
- Display complete book information
- Handle book not found cases

#### 2.4 Update Book (4 marks)
- Modify book details except ID
- Update title, author, genre, year, and copies
- Validate input data

#### 2.5 Book Availability Management (4 marks)
- Add or remove book copies
- Track available vs total copies
- Display current availability after updates

### 3. Book Borrowing Module (25 Marks)

#### 3.1 Borrow Book (15 marks)
- Generate unique transaction IDs
- Validate member and book existence
- Check book availability
- Calculate due dates (14 days from borrow date)
- Update available copies
- Handle member borrowing limits (max 3 books)

#### 3.2 Return Book (10 marks)
- Find active borrowing transaction
- Calculate fine for late returns ($1 per day)
- Update book availability
- Record return date
- Display fine amount if applicable

### 4. Reservation System Module (15 Marks)

#### 4.1 Reserve Book (8 marks)
- Create book reservations when not available
- Validate member and book existence
- Generate unique reservation IDs
- Set reservation status as "Active"

#### 4.2 View Reservations (7 marks)
- Display all reservations by status
- Show member and book details
- Allow cancellation of reservations

### 5. Reporting Module (15 Marks)

#### 5.1 Library Statistics Report (4 marks)
- Total number of books and members
- Currently borrowed books count
- Available books count
- Total fines collected

#### 5.2 Member Activity Report (4 marks)
- List members with current borrowings
- Show borrowing history
- Calculate total fines per member

#### 5.3 Popular Books Report (4 marks)
- Books sorted by borrowing frequency
- Display borrow count for each book
- Show most and least popular genres

#### 5.4 Overdue Books Report (3 marks)
- List all overdue books
- Calculate accumulated fines
- Display member contact information for follow-up

### 6. User Interface and Navigation (5 Marks)

#### 6.1 Menu System (3 marks)
- Clear and intuitive main menu
- Proper sub-menu navigation
- Consistent interface design

#### 6.2 Error Handling (2 marks)
- Validate user inputs
- Handle invalid menu selections
- Display appropriate error messages

## Implementation Guidelines

### Data Management Strategy
1. Use separate arrays for each entity attribute
2. Implement counter variables to track current array usage
3. Create search functions for finding records by key fields
4. Maintain data relationships through foreign key references

### Menu Structure
```
Main Menu
├── 1. Manage Members
│   ├── Add Member
│   ├── View All Members
│   ├── Search Member
│   └── Update Member
├── 2. Manage Books
│   ├── Add Book
│   ├── View All Books
│   ├── Search Book
│   ├── Update Book
│   └── Manage Availability
├── 3. Borrowing Operations
│   ├── Borrow Book
│   └── Return Book
├── 4. Reservations
│   ├── Reserve Book
│   ├── View Reservations
│   └── Cancel Reservation
├── 5. Generate Reports
│   ├── Library Statistics
│   ├── Member Activity Report
│   ├── Popular Books Report
│   └── Overdue Books Report
└── 6. Exit
```

### Sample Data Requirements
Initialize the system with:
- 5 sample members with different membership types
- 10 sample books from various genres
- 2-3 sample borrowing transactions
- Display initialization confirmation message

## Evaluation Criteria

### Technical Implementation (60%)
- Correct use of arrays and loops (15%)
- Proper data validation and error handling (15%)
- Complete CRUD operations implementation (15%)
- Accurate calculations and business logic (15%)

### Functionality (25%)
- All required features implemented (10%)
- Menu navigation and user experience (8%)
- Report generation accuracy (7%)

### Code Quality (15%)
- Code organization and readability (5%)
- Proper variable naming and comments (5%)
- Efficient algorithm implementation (5%)

## Submission Requirements

### Deliverables
1. **Source Code File:** LibraryManagementSystem.java
2. **Documentation:** Assignment report with:
   - System overview and features
   - Data structure explanation
   - Sample output screenshots
   - Testing scenarios and results
   - Challenges faced and solutions

### Submission Format
- **File naming:** StudentID_LibrarySystem.zip
- **Include:** Source code, documentation, and any additional files
- **Submission deadline:** [Insert specific date]

## Testing Requirements
Students must demonstrate:
1. All menu options working correctly
2. Data validation preventing invalid inputs
3. Book borrowing and returning with fine calculations
4. Report generation with accurate calculations
5. Error handling for edge cases

## Grading Rubric

| Component | Excellent (90-100%) | Good (80-89%) | Satisfactory (70-79%) | Needs Improvement (60-69%) | Unsatisfactory (<60%) |
|-----------|-------------------|---------------|---------------------|---------------------------|---------------------|
| **Member Management** | All CRUD operations work flawlessly with proper validation | Most operations work with minor issues | Basic operations work with some validation missing | Limited functionality with several bugs | Major functionality missing |
| **Book Management** | Complete book management with availability tracking | Good book management with minor gaps | Basic book operations working | Limited book features | Poor implementation |
| **Borrowing System** | Seamless borrowing/returning with fine calculations | Good borrowing system with minor issues | Basic borrowing functionality | Limited borrowing features | Major borrowing system flaws |
| **Reporting System** | Comprehensive reports with accurate calculations | Good reports with minor calculation issues | Basic reports working | Limited reporting features | Poor or missing reports |
| **Code Quality** | Clean, well-documented, efficient code | Good code structure with minor improvements needed | Acceptable code quality | Code needs significant improvement | Poor code quality |

## Additional Resources

### Recommended Study Materials
1. **Java Arrays and Loops** - Review multidimensional arrays and nested loops
2. **Date Handling** - Working with date strings and calculations
3. **Input Validation** - Scanner class usage and error handling
4. **String Manipulation** - Formatting output and string comparisons
5. **Mathematical Operations** - Fine calculations and date arithmetic

### Development Tips
1. Start with basic menu structure before implementing features
2. Test each module independently before integration
3. Use meaningful variable names for better code readability
4. Implement data validation at input points
5. Test edge cases like empty arrays and invalid inputs
6. Consider borrowing limits and membership restrictions

### Business Rules
- **Borrowing Period:** 14 days
- **Maximum Books per Member:** 3 books
- **Fine Rate:** $1.00 per day for overdue books
- **Membership Types:** Regular, Premium, Student
- **Reservation Duration:** 7 days to claim reserved books

## Academic Integrity
This assignment must be completed individually. While students may discuss general programming concepts, sharing code or copying solutions will result in academic penalties. All submitted work must be original and properly attributed.

## Support and Questions
For technical questions or clarification on requirements, students should:
1. Review assignment guidelines thoroughly
2. Consult course materials and lecture notes
3. Use office hours for instructor assistance
4. Post general questions on course discussion forum

**Assignment Coordinator:** [Instructor Name]  
**Contact:** [Email Address]  
**Office Hours:** [Schedule]

This assignment is designed to reinforce fundamental programming concepts while building practical software development skills for library management systems. Good luck with your implementation!
