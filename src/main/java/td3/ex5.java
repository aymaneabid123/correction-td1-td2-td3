/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package td3;

/**
 *
 * @author ayman
 */
public class ex5 {
    
}
class Vehicule{
private int nbPassager;

    @Override
    public String toString() {
        return "Vehicule{" + "nbPassager=" + nbPassager + '}';
    }

    public int getNbPassager() {
        return nbPassager;
    }

    public void setNbPassager(int nbPassager) {
        this.nbPassager = nbPassager;
    }

    public Vehicule(int nbPassager) {
        this.nbPassager = nbPassager;
    }
}
class Moto extends Vehicule{
private int nbRoues=2;
/*non car le programme demande de ajouter une constructor contient nbPassager*/

    public Moto(int nbpassager,int nbroues){
        super(nbpassager);
        this.nbRoues=nbroues;

    }
}
class Avion extends Vehicule{
private int nbMoteur;

    public  Avion(int nbPassager){
      super(nbPassager);
    }
    public  Avion(int nbPassager,int nbmoteur){
        super(nbPassager);
     this.nbMoteur=nbmoteur;
    }
}
class Triporteur extends Moto{

    public Triporteur(int nbpassager, int nbroues) {
        super(nbpassager, nbroues);
    }

  



  
   
}
    
    
    


