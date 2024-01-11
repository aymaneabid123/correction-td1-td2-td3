/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package td2;

/**
 *
 * @author ayman
 */
public class ex5 {
    public static void main(String[] args){
        Rectangle r1=new Rectangle(15,14);
          System.out.println(r1);
        
        
    }
}
class Rectangle{
private int longeur,largeur;

    public Rectangle() {
    }

    public Rectangle(int longeur, int largeur) {
        this.longeur = longeur;
        this.largeur = largeur;
    }
    public Rectangle(Rectangle r){
    this(r.getLargeur(),r.getLongeur());
    }

    public int getLongeur() {
        return longeur;
    }

    public void setLongeur(int longeur) {
      if(longeur>0)
        this.longeur = longeur;
    }

    public int getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) {
        if(largeur>0)
        this.largeur = largeur;
    }
    public double perimetre(){
   return  2*(longeur+largeur);
    }
      public double air(){
   return  largeur*longeur;
    }
        public String iscarre(){
            String a="non";
  if(largeur==longeur){a="oui";}
            return  a;
        }
        public String toString(){
        return "perometre : "+perimetre()+" "+"air: "+" "+air()+"  "+"iscarre: "+iscarre();
        }
}
