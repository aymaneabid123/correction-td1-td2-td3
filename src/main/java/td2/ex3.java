/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package td2;

/**
 *
 * @author ayman
 */
public class ex3 {
     public static void main(String[] args) {
     Livre livre1=new Livre();
      Livre livre2=new Livre("kalila wa dimna");
       Livre livre3=new Livre("kalila wa dimna","said naciri");
        Livre livre4=new Livre("kalila wa dimna","said naciri",1200.0);
         Livre livre5=new Livre("kalila wa dimna","said naciri",1200.0,2022);
          Livre livre6=new Livre(livre5);
          Livre livre7=new Livre();
          livre7.setTitre("yalili");
          livre7.setAuteur("saida");
          livre7.setPrix(1200.0);
       System.out.println(livre7);
     
     
     
     }
}
class Livre{
private String titre;
private String auteur;
private Double prix;
private int annee;

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

public Livre(){}
public Livre(String titre){this.titre=titre;}
 public Livre (String titre,String auteur){this.titre=titre;this.auteur=auteur;}
public Livre (String titre ,String auteur,Double prix){this.titre=titre;this.auteur=auteur;this.prix=prix;}
public Livre (String titre ,String auteur,Double prix,int annee){this.titre=titre;this.auteur=auteur;this.prix=prix;this.annee=annee;}
public Livre(Livre l) {this(l.getTitre(), l.getAuteur(),l.getPrix(), l.getAnnee());}


public String toString(){
return "livre {" +
        "titre : "+getTitre()+" "+","+
        "auteur : "+getAuteur()+" "+","+
        "le prix : "+prix+" "+","+
        "l'annee : "+annee+
        "}";
        
        

}


}
