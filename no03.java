package UASPL;

import java.util.Scanner;

public class no03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        System.out.println(" "); //masukkan 10 angka
        for (int i = 0; i < 10; i++) {
            if (scanner.nextInt() % 5 == 0) {
                count++;
            }
        }

        System.out.println("Banyak angka kelipatan 5 ada = " + count);
    }
}

