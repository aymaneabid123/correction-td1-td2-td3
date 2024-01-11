/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package td2;

/**
 *
 * @author ayman
 */
public class ex6 {
    public static void main(String[] args) {
    Bank samir=new Bank(1234,200,"AB 1234");
    System.out.println(samir.avoirinf());
    System.out.println(samir.avoirsolde());
    samir.deposer(500);
     System.out.println(samir.avoirinf());
    System.out.println(samir.avoirsolde());
    samir.retier(200);
     System.out.println(samir.avoirinf());
    System.out.println(samir.avoirsolde());
    
    
}}
class Bank 
{
int NCompte;
float Solde;
String CIN;

    public Bank(int NCompte, float Solde, String CIN) {
        this.NCompte = NCompte;
        this.Solde = Solde;
        this.CIN = CIN;
    }
public void deposer(float somme){
    Solde=Solde+somme;

}
public void  retier(float somme){
 if(Solde>somme){
     Solde=Solde-somme;
            
 }
 else
  System.out.println("solde est insuffisant");
 }
public float avoirsolde(){
return Solde ;
}
public String avoirinf(){
return "numero dee compte : "+NCompte+"CIN : "+CIN;
}


}
