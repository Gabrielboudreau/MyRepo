public class bookrun {
    public static void main(String[] args) {
        Book book1 = new Book("The Hobbit", "J. R. R. Tolkien", "George Allen & Unwin", "21 September 1937");
        Encyclopedia encyclopedia1 = new Encyclopedia("The Illustrated Encyclopedia of the Universe",
                "Ian Ridpath", "Watson-Guptill", "2001", "2nd", 384);

        book1.printInfo();
        System.out.println();
        encyclopedia1.printInfo();
    }
}