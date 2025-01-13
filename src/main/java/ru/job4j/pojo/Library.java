package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book godfather = new Book("Godfather", 1000);
        Book java = new Book("Java for dummies", 500);
        Book dragon = new Book("How to train your dragon", 600);
        Book code = new Book("Clean code", 800);
        Book[] books = new Book[4];
        books[0] = godfather;
        books[1] = java;
        books[2] = dragon;
        books[3] = code;
        Book temp = books[0];
        books[0] = code;
        books[3] = temp;
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + ", pages: " + books[i].getPages());
        }
        System.out.println("Only books with name \" Clean code\":);");
        for (int i = 0; i < books.length; i++) {
            if ("Clean code".equals(books[i].getName())) {
                System.out.println("Book number is: " + i + ". " + books[i].getName()
                        + " with " + books[i].getPages() + " pages");
            }
        }
    }
}
