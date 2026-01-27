package com.reflection.retrieveannotationsatruntime;
public class ReadAnnotation {

    public static void main(String[] args) {

        Class cls = Book.class;

        Author author = (Author) cls.getAnnotation(Author.class);

        System.out.println("Author Name is");
        System.out.println(author.name());
    }
}
