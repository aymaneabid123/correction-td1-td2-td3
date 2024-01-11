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

public class ex5boucle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un entier positif n : ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Veuillez entrer un entier positif.");
        } else {
            int a = 0, b = 1, resultat = 0;

            if (n == 0) {
                resultat = a;
            } else if (n == 1) {
                resultat = b;
            } else {
                for (int i = 2; i <= n; i++) {
                    resultat = a + b;
                    a = b;
                    b = resultat;
                }
            }

            System.out.println("Le " + n + "ème terme de la suite de Fibonacci est : " + resultat);
        }

        scanner.close();
    }
}
 

