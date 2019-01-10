package com.home.datastructures.hashtable;

public class Main {

    public static void main(String[] args) {
        HashTable table = new HashTable(15);

        System.out.println("-----Insert-----");
        table.insert("Romania");
        table.insert("United Kingdom");
        table.insert("Germany");
        table.insert("Sweden");
        table.insert("Denmark");
        table.insert("Italy");
        table.insert("Spain");
        table.insert("France");
        table.insert("Russia");
        table.insert("Tanzania");
        System.out.println("-----End of inserting-----");
        System.out.println(" ");

        table.display();
        System.out.println(" ");

        System.out.println("-----Find-----");
        System.out.println(table.find("Italy"));
        System.out.println(table.find("Poland"));
        System.out.println(table.find("Romania"));
        System.out.println(table.find("Croatia"));
        System.out.println("-----End of finding-----");
    }
}
