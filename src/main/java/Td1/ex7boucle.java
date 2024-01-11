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

public class ex7boucle {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Saisir le nombre de lignes : ");
        int nombreLignes = scanner.nextInt();

        // Affichage du triangle
        for (int i = 1; i <= nombreLignes; i++) {
            // Affichage des chiffres de 1 à i pour chaque ligne
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}