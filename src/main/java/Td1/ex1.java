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

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Entrez la première variable : ");
        double a = scanner.nextDouble();
        System.out.print("Entrez la deuxième variable : ");
        double b = scanner.nextDouble();
        System.out.print("Entrez la troisième variable : ");
        double c = scanner.nextDouble();
        double maximum = Math.max(Math.max(a, b), c);    
        System.out.println("Le maximum des trois variables est : " + maximum);
        scanner.close();
    }
}
