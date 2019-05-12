package com.sda.algorytmy;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj dwie liczby calkowite: ");
        int a = scan.nextInt();
        int b = scan.nextInt();

        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }System.out.println(a);
    }
}