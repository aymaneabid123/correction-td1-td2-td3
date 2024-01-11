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
public class ex8boucle {
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Saisir le nombre d'étoiles dans la rangée centrale : ");
        int nombreEtoilesCentrale = scanner.nextInt();

        afficherMotifEtoiles(nombreEtoilesCentrale);

        scanner.close();
    }

    // Fonction pour afficher le motif d'étoiles
    private static void afficherMotifEtoiles(int nombreEtoilesCentrale) {
        for (int i = 1; i <= nombreEtoilesCentrale; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = nombreEtoilesCentrale - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
