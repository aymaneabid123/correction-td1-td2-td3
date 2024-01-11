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

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la moyenne de l'étudiant : ");
        double moyenne = scanner.nextDouble();

        if (moyenne >= 16) {
            System.out.println("T.Bien");
        } else if (moyenne >= 14 && moyenne < 16) {
            System.out.println("Bien");
        } else if (moyenne >= 12 && moyenne < 14) {
            System.out.println("A.Bien");
        } else if (moyenne >= 10 && moyenne < 12) {
            System.out.println("Passable");
        } else {
            System.out.println("Non admis");
        }

        scanner.close();
    }
}
