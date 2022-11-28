package com.metanit.Exercise_7;

import java.util.*;

public class BookTest implements Comparator<Book>{

    public static void main(String[] args) {
        ArrayList<Bookshelf> Books = new ArrayList<>();
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("1 - добавить, 2 - самые старые и новые, 3 - сортировка, 4 - выход");
            int i = sc.nextInt();
            if (i == 1) {
                System.out.print("Имя: ");
                String N = sc.next();
                System.out.print("Автор: ");
                String A = sc.next();
                System.out.print("Год: ");
                int Y = sc.nextInt();
                Bookshelf k = new Bookshelf(N, A, Y);
                Books.add(k);
                System.out.println(Books);
            }
            if (i == 2) {
                Comparator C = new BookTest();
                System.out.println("Самая новая - " + Collections.min(Books, C) + ", самая старая - " + Collections.max(Books, C));
            }
            if (i == 3) {
                Comparator C = new BookTest();
                Collections.sort(Books, C);
                System.out.println(Books);
            }
            if (i == 4) {
                break;
            }
        }
    }
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getYear() - o2.getYear();
    }

}
