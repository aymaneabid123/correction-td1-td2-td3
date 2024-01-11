/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Td1;

/**
 *
 * @author ayman
 */
public class  ex10boucle {
    public static void main(String[] args) {
        for (int i = 100; i <= 999; i++) {
            int centaine = i / 100;
            int dizaine = (i % 100) / 10;
            int unite = i % 10;

            int sommeCubes = (int) (Math.pow(centaine, 3) + Math.pow(dizaine, 3) + Math.pow(unite, 3));

            if (sommeCubes == i) {
                System.out.println("Nombre cubique trouvé : " + i);
            }
        }
    }
}
