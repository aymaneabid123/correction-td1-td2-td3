/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Td1;

/**
 *
 * @author ayman
 */

public class ex6boucle {
    public static void main(String[] args) {
        int total = 15 ;
        System.out.println("Les combinaisons d'entiers entre 1 et 9 qui ajoutent jusqu'à 15 sont :");

        for (int i = 1 ; i <= 9 ; i++){
            for (int j = 1 ; j <= 9 ; j++){
                for (int k = 1 ; k  <= 9  ; k++){
                    if (i + j + k == total){
                        System.out.println(i + " + " + j + " + " + k + " = " + total);
                    }
                }
            }
        }
    }
}
