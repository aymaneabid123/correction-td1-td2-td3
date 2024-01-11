/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package td3;

/**
 *
 * @author ayman
 */
public class ex6 {
    public static void main(String[] args) {
    Rectangle r=new Rectangle(5.0,6.0,"RECTANGLE");
    Disque d =new Disque(5.0,4.0,"disque");
 
    System.out.println(d.toString());
       System.out.println(r);
    
    
    
    }
}
abstract class  Figure{
private String nom;

      protected  Figure(String nom) {
        this.nom = nom;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public  abstract double  getPerimeter();
     public  abstract double  getAire();
      public  abstract String  toString();
        public   String  toStringo(){
        return "allllll";
        
        };

}
class Disque extends Figure{
double centre;
double rayon;


    public double getCentre() {
        return centre;
    }

    public void setCentre(double centre) {
        this.centre = centre;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

       public Disque(double center,double rayon,String nom){
        super(nom);
        this.centre=centre;
        this.rayon=rayon;
    }
     
    @Override
    public double getPerimeter() {
     return 2*Math.PI*rayon;
    }

    @Override
    public double getAire() {
     return Math.PI*rayon*rayon;
    }

    @Override
    public String toString() {
     return "perimeter de disque est :"+getPerimeter()+"  "+"l'air de disque est : "+getAire();
    }
 


}
class Rectangle extends Figure{
double longeur;
double largeur;

    public double getLongeur() {
        return longeur;
    }

    public void setLongeur(double longeur) {
        this.longeur = longeur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }
 
 

       public Rectangle(double longeur,double largeur,String nom){
        super(nom);
        this.longeur=longeur;
        this.largeur=largeur;
    }
     
    @Override
 
    public double getPerimeter() {
        return 2 * (longeur + largeur);
    }

    public double getAire() {
        return longeur * largeur;
    }

    @Override
    public String toString() {
     return "perimeter de rectangle est :"+getPerimeter()+"  "+"l'air de rectangle est : "+getAire();
    }
 


}
