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

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nombre entier a : ");
        int a = scanner.nextInt();

        System.out.print("Entrez le nombre entier b : ");
        int b = scanner.nextInt();

        System.out.println("Choisissez une opération :");
        System.out.println("1. Vérifier si la somme a + b est paire");
        System.out.println("2. Vérifier si le produit a * b est pair");
        System.out.println("3. Connaître le signe de la somme a + b");
        System.out.println("4. Connaître le signe du produit a * b");

        int choix = scanner.nextInt();

        switch (choix) {
            case 1:
                int somme = a + b;
                if (somme % 2 == 0) {
                    System.out.println("La somme a + b est paire.");
                } else {
                    System.out.println("La somme a + b n'est pas paire.");
                }
                break;

            case 2:
                int produit = a * b;
                if (produit % 2 == 0) {
                    System.out.println("Le produit a * b est pair.");
                } else {
                    System.out.println("Le produit a * b n'est pas pair.");
                }
                break;

            case 3:
                int signeSomme = Integer.signum(a + b);
                if (signeSomme == 0) {
                    System.out.println("La somme a + b est nulle.");
                } else if (signeSomme > 0) {
                    System.out.println("La somme a + b est positive.");
                } else {
                    System.out.println("La somme a + b est négative.");
                }
                break;

            case 4:
                int signeProduit = Integer.signum(a * b);
                if (signeProduit == 0) {
                    System.out.println("Le produit a * b est nul.");
                } else if (signeProduit > 0) {
                    System.out.println("Le produit a * b est positif.");
                } else {
                    System.out.println("Le produit a * b est négatif.");
                }
                break;

            default:
                System.out.println("Choix invalide.");
        }

        scanner.close();
    }
}