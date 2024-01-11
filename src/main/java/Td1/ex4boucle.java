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

public class ex4boucle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Entrez le premier entier a : ");
        int a = scanner.nextInt();
        
        System.out.print("Entrez le deuxième entier b : ");
        int b = scanner.nextInt();

        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }

        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }

        System.out.println("The PGCD is: " + a);
    }
}
