/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package td3;

/**
 *
 * @author ayman
 */
public class ex3 {
    public static void main(String[] args) {
     Centre c=new Centre(2,4,"A");
        c.affiche();
        Cercle cl=new Cercle(1,5,"B",2);
        cl.affiche();
    }
}
class Point2 {
public Point2(int x, int y) {
this.x = x;
this.y = y;
}
public void affCoord() {
System.out.println("Coordonnees : " + x + " " + y);
}
public void affiche() {
System.out.println("Coordonnees : " + x + " " + y);
}
private int x, y;
}
class Centre extends Point2{
   String nom;
    public Centre(int x, int y,String nom) {
        super(x, y);
        this.nom=nom;
    }
    public void affNom(){
    System.out.println("le nom de centre est : "+nom);
    }
    public void affiche(){
     System.out.println("le nom de centre est : "+nom);
     affCoord();
    
    }
}
class Cercle extends Centre{
     int rayon;
     public  Cercle(int x,int y,String nom,int rayon){
         super(x,y,nom);
         this.rayon=rayon;
     }
     
     public void affCercle(){
         affiche();
         System.out.println("rayon :"+this.rayon);

     }}
