/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Td1;

/**
 *
 * @author ayman
 */
import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un entier de trois chiffres non nuls : ");
        int n = scanner.nextInt();

        if (n >= 100 && n <= 999) {
            int centaine = n / 100;
            int dizaine = (n % 100) / 10;
            int unite = n % 10;

            if (centaine != 0 && dizaine != 0 && unite != 0) {
                System.out.println("Les nombres formés par les chiffres de " + n + " sont :");
                System.out.print(n + ", ");

                int permutation1 = centaine * 100 + dizaine * 10 + unite;
                int permutation2 = centaine * 100 + unite * 10 + dizaine;
                int permutation3 = dizaine * 100 + centaine * 10 + unite;
                int permutation4 = dizaine * 100 + unite * 10 + centaine;
                int permutation5 = unite * 100 + centaine * 10 + dizaine;
                int permutation6 = unite * 100 + dizaine * 10 + centaine;

                System.out.print(permutation1 + ", " + permutation2 + ", ");
                System.out.print(permutation3 + ", " + permutation4 + ", ");
                System.out.println(permutation5 + ", " + permutation6);
            } else {
                System.out.println("L'entier ne doit pas contenir de zéro.");
            }
        } else {
            System.out.println("L'entier doit être un nombre de trois chiffres non nuls.");
        }

        scanner.close();
    }
}
