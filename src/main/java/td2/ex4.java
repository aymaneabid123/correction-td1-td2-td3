/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package td2;

/**
 *
 * @author ayman
 */
public class ex4 {
     public static void main(String[] args) {
     Temps t1=new Temps(0,59,3);
      System.out.println(t1.toString());
     t1.ajoutersec(3600);
      System.out.println(t1);
     }}
 class Temps{
    private int s,m,h;

        public int getS() {
            return s;
        }

        public void setS(int s) {
            this.s = s;
        }

        public int getM() {
            return m;
        }

        public void setM(int m) {
            this.m = m;
        }

        public int getH() {
            return h;
        }

        public void setH(int h) {
            this.h = h;
        }

        public Temps() {
        }

        public Temps(int s, int m) {
            this.s = s;
            this.m = m;
        }

        public Temps(int s, int m, int h) {
            this.s = s;
            this.m = m;
            this.h = h;
        }
        public Temps(Temps t){
        this(t.getS(),t.getM(),t.getH());
        }
        public void ajouterheuers(int heuer){
          h+=heuer;
       
        }
             public void ajoutermin(int minut){
          m=m+minut;
          if(m>59){
              int d=m/60;
             h+=d;
              m=m%60;
          }
             }
  public void ajoutersec(int second){
  s=s+second;
  if(s>59){
   int d1=s/60;
      m=m+d1;
      int d2=m/60;
      h=h+d2;
      m=m%60;
      s=s%60;
  }
}
     public String toString(){
    return "l'heure: "+h+",minute: "+m+" "+",second "+s;
    }
 }
    

    
    
    