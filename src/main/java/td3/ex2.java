/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package td3;

/**
 *
 * @author ayman
 */
public class ex2 {
         public static void main(String[] args) {
             PointNom p=new PointNom();
             p.setPointNom(5, 3, "A");
             p.affCoordNom();
         }
}
class Point1 {
public void Point(int x, int y) {
this.x = x;
this.y = y;
}
public void deplace(int dx, int dy) {
x += dx;
y += dy;
}
public void affCoord() {
System.out.println("Coordonnees : " + x + " " + y);
}
private int x, y;
}
class PointNom extends Point1{
String nom;

    public String getNom() {
        return nom;
    }

    public void setNom(String Nom) {
        this.nom = Nom;
    }
    public void setPointNom(int x, int y, String nom) {
        super.Point(x, y);
        this.nom = nom;
    }
    public void affCoordNom(){
    System.out.println("nom : " + nom );
    affCoord();
    }
     
}




