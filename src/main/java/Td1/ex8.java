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

public class ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le numéro du mois (1 à 12) : ");
        int mois = scanner.nextInt();

        if (mois >= 1 && mois <= 12) {
            int jours = 0;

            if (mois == 2) {
                System.out.print("Entrez l'année (1900 à 2100) : ");
                int annee = scanner.nextInt();

                if (annee >= 1900 && annee <= 2100) {
                    if ((annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0)) {
                        jours = 29;
                    } else {
                        jours = 28;
                    }
                } else {
                    System.out.println("Année invalide.");
                }
            } else if (mois == 4 || mois == 6 || mois == 9 || mois == 11) {
                jours = 30;
            } else {
                jours = 31;
            }

            if (jours != 0) {
                System.out.println("Le mois " + mois + " a " + jours + " jours.");
            }
        } else {
            System.out.println("Numéro de mois invalide.");
        }

        scanner.close();
    }
}
