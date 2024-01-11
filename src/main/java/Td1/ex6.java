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

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la valeur entière A : ");
        int a = scanner.nextInt();

        System.out.print("Entrez la valeur entière B : ");
        int b = scanner.nextInt();

        int signeProduit = Integer.signum(a) * Integer.signum(b);

        if (signeProduit == 0) {
            System.out.println("Le produit de A et B est nul.");
        } else if (signeProduit > 0) {
            System.out.println("Le produit de A et B est positif.");
        } else {
            System.out.println("Le produit de A et B est négatif.");
        }

        scanner.close();
    }
}