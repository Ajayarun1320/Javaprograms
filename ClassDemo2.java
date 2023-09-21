package basicprograms;

	// User class represents library users
	class User {
	    private String name;
	    private int userId;
	    private String email;
	    
	    // Constructor
	    public User(String name, int userId, String email) {
	        this.name = name;
	        this.userId = userId;
	        this.email = email;
	    }
	    
	    // Getter methods
	    public String getName() {
	        return name;
	    }
	    
	    public int getUserId() {
	        return userId;
	    }
	    
	    public String getEmail() {
	        return email;
	    }
	    
	    // Print user details
	    public void printUserInfo() {
	        System.out.println("User Name: " + name);
	        System.out.println("User ID: " + userId);
	        System.out.println("Email: " + email);
	    }
	}

	// Book class represents library books
	class Book {
	    private String title;
	    private String author;
	    private int bookId;
	    
	    // Constructor
	    public Book(String title, String author, int bookId) {
	        this.title = title;
	        this.author = author;
	        this.bookId = bookId;
	    }
	    
	    // Getter methods
	    public String getTitle() {
	        return title;
	    }
	    
	    public String getAuthor() {
	        return author;
	    }
	    
	    public int getBookId() {
	        return bookId;
	    }
	    
	    // Print book details
	    public void printBookInfo() {
	        System.out.println("Title: " + title);
	        System.out.println("Author: " + author);
	        System.out.println("Book ID: " + bookId);
	    }
	}

	// Card class represents library cards issued to users
	class Card {
	    private int cardNumber;
	    private User user;
	    
	    // Constructor
	    public Card(int cardNumber, User user) {
	        this.cardNumber = cardNumber;
	        this.user = user;
	    }
	    
	    // Getter methods
	    public int getCardNumber() {
	        return cardNumber;
	    }
	    
	    public User getUser() {
	        return user;
	    }
	    
	    // Print card details
	    public void printCardInfo() {
	        System.out.println("Card Number: " + cardNumber);
	        System.out.println("User Information:" + user);
	        user.printUserInfo();
	    }
	}

	// ReminderMessage class represents reminder messages for due books
	class ReminderMessage {
	    private String message;
	    
	    // Constructor
	    public ReminderMessage(String message) {
	        this.message = message;
	    }
	    
	    // Getter method
	    public String getMessage() {
	        return message;
	    }
	    
	    // Print reminder message
	    public void printReminder() {
	        System.out.println("Reminder Message: " + message);
	    }
	}

	public class ClassDemo2 {
	    public static void main(String[] args) {
	        // Create instances and print their details
	        User user1 = new User("John Doe", 1, "john.doe@example.com");
	        user1.printUserInfo();
	        
	        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 101);
	        book1.printBookInfo();
	        
	        Card card1 = new Card(1001, user1);
	        card1.printCardInfo();
	        
	        ReminderMessage reminder = new ReminderMessage("Your book is due soon. Please return it.");
	        reminder.printReminder();
	    }
	}

