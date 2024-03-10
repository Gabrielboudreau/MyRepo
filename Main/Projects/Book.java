class Book {
    private String title;
    private String author;
    private String publisher;
    private String publicationDate;

    // Constructor
    public Book(String title, String author, String publisher, String publicationDate) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.publicationDate = publicationDate;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    // Print method
    public void printInfo() {
        System.out.println("Book Information:");
        System.out.println("   Book Title: " + getTitle());
        System.out.println("   Author: " + getAuthor());
        System.out.println("   Publisher: " + getPublisher());
        System.out.println("   Publication Date: " + getPublicationDate());
    }
}