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
public class ex9boucle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Saisir un nombre entier : ");
        int nombre = scanner.nextInt();

        int somme = 0;

        // Parcourir chaque chiffre du nombre
        while (nombre != 0) {
            somme += nombre % 10; // Ajouter le chiffre actuel à la somme
            nombre /= 10; // Supprimer le chiffre actuel du nombre
        }
        System.out.println("La somme des chiffres est : " + somme);
    }
}
