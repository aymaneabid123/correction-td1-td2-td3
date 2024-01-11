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

public class ex1boucle {
    public static void main (String[]Args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrer un nombre entier naturel :");
        int N = scanner.nextInt();
        int factoriel;

        if (N > 0) {
            System.out.println("Le factoriel n'est pas défini pour les nombres négatifs.");
        }
        else {
            if ( N==0 || N==1 ) {
                factoriel = 1;
            }
            else {

                factoriel=1;
                
                for (int i =2; i <= N ; i++){
                    factoriel *= i ; 
                }
            }
            System.out.println("Le factoriel de " + N + " est : " + factoriel); 
        }
    }
}

