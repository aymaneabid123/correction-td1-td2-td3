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

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez l'heure (en format 24 heures) : ");
        int heure = scanner.nextInt();

        System.out.print("Choisissez la langue (f pour français, a pour anglais) : ");
        char langue = scanner.next().charAt(0);

        if (langue == 'f') {
            if (heure >= 0 && heure < 18) {
                System.out.println("Bonjour");
            } else if (heure >= 18 && heure <= 22) {
                System.out.println("Bonsoir");
            } else {
                System.out.println("Bonne nuit");
            }
        } else if (langue == 'a') {
            if (heure >= 0 && heure < 18) {
                System.out.println("Good Morning");
            } else if (heure >= 18 && heure <= 22) {
                System.out.println("Good Evening");
            } else {
                System.out.println("Good Night");
            }
        } else {
            System.out.println("Langue non prise en charge");
        }

        scanner.close();
    }
}
