class Encyclopedia extends Book {
    private String edition;
    private int numberOfPages;

    // Constructor
    public Encyclopedia(String title, String author, String publisher, String publicationDate,
                        String edition, int numberOfPages) {
        super(title, author, publisher, publicationDate);
        this.edition = edition;
        this.numberOfPages = numberOfPages;
    }

    // Getters and setters
    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    // Overriding print method
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("   Edition: " + getEdition());
        System.out.println("   Number of Pages: " + getNumberOfPages());
    }
}