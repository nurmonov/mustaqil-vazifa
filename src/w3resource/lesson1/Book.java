package w3resource.lesson1;

import java.util.Scanner;

public class Book {
    private String title;
    private  String author;
    private int pagej;

    public Book() {
    }
    public void print(){
        System.out.println("title: "+getTitle()+"\naotor: "+getAuthor()+"\npagej: "+getPagej());
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPagej() {
        return pagej;
    }

    public void setPagej(int pagej) {
        this.pagej = pagej;
    }

    public static class testBook {
        public static void main(String[] args) {
            Book book = new Book();
            Scanner scanner=new Scanner(System.in);

            book.setTitle(scanner.nextLine());
            book.setAuthor(scanner.nextLine());
            book.setPagej(scanner.nextInt());
            book.print();
        }
    }
}
