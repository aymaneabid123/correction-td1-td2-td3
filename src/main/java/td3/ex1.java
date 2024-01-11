/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package td3;

/**
 *
 * @author ayman
 */
public class ex1 {
     public static void main(String[] args) {
     PointA p=new PointA(5,6);
     p.affcoor();
     
     
     
     }
}
class Point {
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void deplace(int dx, int dy) {
        x += dx;
        y += dy;
    }

    private int x, y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
}

class PointA extends Point{
   public PointA(int x, int y) {
        super(x,y);
    }
    
public void affcoor(){
System.out.println("Coordonnees : " + getX() + " " + getY());

}

}
/*Si la classe Point ne disposait pas des méthodes getX et getY, et si ces méthodes n'étaient pas accessibles depuis la classe dérivée PointA */
