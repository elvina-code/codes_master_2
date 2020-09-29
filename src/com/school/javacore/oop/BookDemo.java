package com.school.javacore.oop;

import java.util.stream.StreamSupport;

public class BookDemo {

    public static void main(String[] args){
        Book book1 = new Book(12, "book1");
        System.out.println(book1.getPrice("regular"));
        System.out.println(book1.getPrice("student"));
    }
}
