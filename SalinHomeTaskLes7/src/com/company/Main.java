package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ввелите название, автора и содержание книги");
	Book Book1 = new Book ();
	Book1.settitle(in.nextLine());
	Book1.setauthor(in.nextLine());
	Book1.setcontent(in.nextLine());
        System.out.println(Book1.gettitle() +" " + Book1.getauthor() + " " + Book1.getcontent());
    }
}