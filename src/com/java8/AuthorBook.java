package com.java8;

import java.util.*;
import java.util.stream.Collectors;

public class AuthorBook {

    public static void main(final String[] args) {
        final List<Book> books = getBooks();

        // Stream API 1: list all book's isbn
        final List<String> result1 = books.stream()
                .map(Book::getIsbn)
                .collect(Collectors.toList());

//        // Stream API 2: list book's name, where author is "Rick Riordan"
        books.stream()
                .filter(book -> book.getAuthors()
                        .stream().filter(bk -> bk.getFirstName().equals("Rick")
                                && bk.getFirstName().equals("Riordan"))
                        .findAny()
                        .isPresent())
                .map(Book::getName)
                .forEach(System.out::println);
//
//        // Stream API 3: Result map, where
//        // key is book type
//        // and value is a list of book names sorted by isbn
        final Map<String, List<String>> result3 = books.stream()
                .sorted(Comparator.comparing(Book::getIsbn))
                .collect(Collectors.groupingBy(Book::getType,
                        Collectors.mapping(book -> book.getName(), Collectors.toList())));


        System.out.println();
    }

    private static List<Book> getBooks() {
        final Author suzanneCollins = new Author();
        suzanneCollins.setFirstName("Suzanne");
        suzanneCollins.setLastName("Collins");

        final Author rickRiordan = new Author();
        rickRiordan.setFirstName("Rick");
        rickRiordan.setLastName("Riordan");

        final Author rickGolding = new Author();
        rickGolding.setFirstName("Rick");
        rickGolding.setLastName("Golding");

        final Book book1 = new Book();
        book1.setIsbn("11111111");
        book1.setName("Harry Potter and the Order of the Phoenix");
        book1.setType("Fantastic");
        book1.setAuthors(Collections.singletonList(suzanneCollins));

        final Book book2 = new Book();
        book2.setIsbn("22222222");
        book2.setName("The Little Prince");
        book2.setType("Fantastic");
        book2.setAuthors(Collections.singletonList(rickRiordan));

        final Book book3 = new Book();
        book3.setIsbn("33333333");
        book3.setName("Lord of the Flies");
        book3.setType("Child");
        final List<Author> authors3 = new LinkedList<>();
        authors3.add(rickGolding);
        authors3.add(rickRiordan);
        book3.setAuthors(authors3);

        final List<Book> books = new LinkedList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);

        return books;
    }

    static class Book {

        private String isbn;
        private String name;
        private String type;
        private List<Author> authors;

        public String getIsbn() {
            return isbn;
        }

        public void setIsbn(final String isbn) {
            this.isbn = isbn;
        }

        public String getName() {
            return name;
        }

        public void setName(final String name) {
            this.name = name;
        }

        public List<Author> getAuthors() {
            return authors;
        }

        public void setAuthors(final List<Author> authors) {
            this.authors = authors;
        }

        public String getType() {
            return type;
        }

        public void setType(final String type) {
            this.type = type;
        }
    }

    static class Author {

        private String firstName;
        private String lastName;

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(final String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(final String lastName) {
            this.lastName = lastName;
        }
    }
}
