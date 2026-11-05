public class Library {
    static int totalBooks = 0;
    String title;
    String author;

    public Library(String title, String author){
        totalBooks++;
        this.title = title;
        this.author = author;
    }
    public String getInfo() {
        return "Title: " + title + "Author: " + author;
    }
    public static int getTotalBooks(){
        return totalBooks;
    }
    public static void main(String[] args) {
        Library book1 = new Library("Rich Dad Poor Dad", "Robert Kiyosaki");
        Library book2 = new Library("Atomic Habits", "I forgot");

        System.out.println("Book 1 :" + book1.getInfo());
        System.out.println("Total Books: " + Library.getTotalBooks());
    }
}
