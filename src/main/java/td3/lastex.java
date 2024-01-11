/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package td3;

import javax.lang.model.SourceVersion;

/**
 *
 * @author ayman
 */

 interface IEmploye {
    String getNom();
    String getPrenom();
    double gains();
    String toString();
}
class Patron implements IEmploye {
    private String nom;
    private String prenom;
    private double salaire;

    public Patron(String nom, String prenom, double salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
    }
    public String getNom() {
        return nom;
    }

    @Override
    public String getPrenom() {
        return prenom;
    }

    @Override
    public double gains() {
        return salaire;
    }

    @Override
    public String toString() {
        return "Nom : " + getNom() + ", Prénom : " + getPrenom() + ", Salaire : " + salaire;
    }
}
 class TravailleurCommission implements IEmploye {
    private String nom;
    private String prenom;
    private double salaire;
    private double commission;
    private int quantite;

    public TravailleurCommission(String nom, String prenom, double salaire, double commission) {
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
        this.commission = commission;
        this.quantite = 0;
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public String getPrenom() {
        return prenom;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    @Override
    public double gains() {
        return salaire + (commission * quantite);
    }

    @Override
    public String toString() {
        return "Nom : " + getNom() + ", Prénom : " + getPrenom() + ", Salaire : " + salaire + ", Commission : " + commission;
    }
}
class TravailleurHoraire implements IEmploye {
    private String nom;
    private String prenom;
    private double retribution;
    private double heures;

    public TravailleurHoraire(String nom, String prenom, double retribution) {
        this.nom = nom;
        this.prenom = prenom;
        this.retribution = retribution;
        this.heures = 0.0;
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public String getPrenom() {
        return prenom;
    }

    public double getHeures() {
        return heures;
    }

    public void setHeures(double heures) {
        this.heures = heures;
    }

    @Override
    public double gains() {
        return retribution * heures;
    }

    @Override
    public String toString() {
        return "Nom : " + getNom() + ", Prénom : " + getPrenom() + ", Rétribution : " + retribution + ", Heures : " + heures;
    }
}
// TestEmploye.java
public class lastex {
    public static void main(String[] args) {
        IEmploye patron = new Patron("ALawi", "Ahmed", 5000.0);
        IEmploye travailleurCommission = new TravailleurCommission("Yauobi", "Ilyas", 2000.0, 15.0);
        IEmploye travailleurHoraire = new TravailleurHoraire("Hajji", "Samir", 30.0);

        ((TravailleurCommission) travailleurCommission).setQuantite(70);
        ((TravailleurHoraire) travailleurHoraire).setHeures(120);
        System.out.println(patron);
        System.out.println("Salaire du patron : " + patron.gains());
        System.out.println(travailleurCommission);
        System.out.println("Salaire du travailleur à la commission : " + travailleurCommission.gains());
        System.out.println(travailleurHoraire);
        System.out.println("Salaire du travailleur horaire : " + travailleurHoraire.gains());
    }
}


