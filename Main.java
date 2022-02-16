package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double tutar, kdvOrani = 0.18, kdvOrani2 = 0.08;

        System.out.print("Tutar Giriniz :");
        tutar = scanner.nextDouble();

        System.out.println("KDV'li Fiyat = " + (tutar > 1000 ? tutar * (1 + kdvOrani2) : tutar * (1 + kdvOrani)));
        System.out.println("KDV Tutarı = " + (tutar > 1000 ? tutar * kdvOrani2 : tutar * kdvOrani));
    }
}
