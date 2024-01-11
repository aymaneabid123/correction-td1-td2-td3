/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package td2;

/**
 *
 * @author ayman
 */
public class ex2 {
    public static void main(String[] args) {
        
         Point a = new Point();
        a.setA("b");
        a.setX(5);
        a.setY(6);
        System.out.println(a.toString());
    }
    }
   

 class Point {
   private double x;
    private double y;
    String A;
    public Point(){}

        public String getA() {
            return A;
        }

        public void setA(String A) {
            this.A = A;
        }
        public double getX() {
            return x;
        }

        public void setX(double x) {
            this.x = x;
        }

        public double getY() {
            return y;
        }

        public void setY(double y) {
            this.y = y;
        }
    
    public double Norme(){
    return Math.sqrt((x*x)+Math.pow(y, 2));
    }
    public String toString(){
    return "le nom de point est "+A+",les coordonnes de point est "+x+" "+y+" "+",la norm est "+this.Norme();
    }
}

