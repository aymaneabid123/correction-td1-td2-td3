/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package td3;

/**
 *
 * @author ayman
 */
public class ex4 {
    public static void main(String[] args) {
    Bâtiment b =new Bâtiment("hay elbarka");
    Maison m=new Maison(4,"hay elbarka");
    Imeuble i=new Imeuble(5,"hayelbarka");
    System.out.println(b);
    System.out.println(m);
    System.out.println(i);
    
    }
}
class Bâtiment{
private String adress;

    public Bâtiment() {
    }

    public Bâtiment(String adress) {
        this.adress = adress;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
    public String toString(){
    return "l'adress de batiment est :"+adress;
    }}
class Maison extends Bâtiment{
   int nbChambre;

    public int getNbChambre() {
        return nbChambre;
    }

    public void setNbChambre(int nbChambre) {
        this.nbChambre = nbChambre;
    }

    public Maison() {
    }

    public Maison(int nbChambre, String adress) {
        super(adress);
        this.nbChambre = nbChambre;
    }
    public String toString(){
    return "adress de maison : "+getAdress()+" "+"il contient: "+nbChambre+" chambres"; 
    }
   
}
class Imeuble extends Bâtiment{
int nbAppart;

    public int getNbAppart() {
        return nbAppart;
    }

    public void setNbAppart(int nbAppart) {
        this.nbAppart = nbAppart;
    }

    public Imeuble(int nbAppart, String adress) {
        super(adress);
        this.nbAppart = nbAppart;
    }

    public Imeuble() {
    }
    public String toString(){
    return "l'adress de l'imeuble: "+getAdress()+" "+"il containt : "+nbAppart+"  appartement";
    }


}