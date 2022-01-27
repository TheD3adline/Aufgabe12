package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int num, high;
        Scanner sc = new Scanner(System.in);
        System.out.println("Wie viele Zahlen moechten Sie abspeichern? Bitte eingeben:");
        num = sc.nextInt();
        int[] array = new int[num];
        System.out.println("Sie haben eine Speicherkapazitaet von " + num + " Zahlen ausgewaehlt.");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Bitte geben sie jetzt Zahl Nr.: " + (i + 1) + " ein: ");
            array[i] = sc.nextInt();
        }
        System.out.print("Sie haben folgende Zahlen eingegeben: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
        high = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > high) {
                high = array[i];
            }
        }
        System.out.println("Die groesste der eingelesenen Zahlen ist: " + high);

    }

}
