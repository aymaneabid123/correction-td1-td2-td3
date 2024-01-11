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

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez les valeurs pour a, b et c de l'équation ax^2 + bx + c = 0 :");
        System.out.print("a : ");
        double a = scanner.nextDouble();
        System.out.print("b : ");
        double b = scanner.nextDouble();
        System.out.print("c : ");
        double c = scanner.nextDouble();
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        if (discriminant > 0) {
            double racinePos = (-b + Math.sqrt(discriminant)) / (2 * a);
            double racineNeg = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Deux racines réelles distinctes : x1 = " + racinePos + ", x2 = " + racineNeg);
        } else if (discriminant == 0) {
            double racineUnique = -b / (2 * a);
            System.out.println("Une racine réelle unique : x = " + racineUnique);
        } else {
            System.out.println("Pas de racines réelles (racines imaginaires)");
        }
        
    }
}