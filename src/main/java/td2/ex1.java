/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package td2;

/**
 *
 * @author ayman
 */
public class ex1 {
     public static void main(String[] args) {
       

        
      
    }
    class Point {
    private char nom;
    private double abscisse;

    
    public Point(char nom, double abscisse) {
        this.nom = nom;
        this.abscisse = abscisse;
    }
    public void affiche() {
        System.out.println("Point " + nom + " - Abscisse : " + abscisse);
    }
    public void translate(double translation) {
        abscisse += translation;
    }

   
}

}
