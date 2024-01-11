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
public class ex2boucle {
    public static void main (String[]Args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrer un nombre entier naturel :");
        int N = scanner.nextInt();
        int somme = 0;
        for (int i = 1; i < N; i += 2) {
             somme += i;
        }
         System.out.println("La somme des entiers impairs inférieurs à " + N + " est : " + somme);
        }
    }
