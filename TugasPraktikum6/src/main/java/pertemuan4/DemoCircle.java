/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

/**
 *
 * @author Risvandiani
 */
public class DemoCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Circle cr = new Circle (2,3,5);
    Circle cr1 = new Circle (2,3);
    
    System.out.println("Lingkaran Konstruktor 3 Parameter");
    System.out.println("Keliling Lingkaran: "+cr.keliling());
    System.out.println("Luas Lingkaran: "+cr.luas());
    
    System.out.println("Lingkaran Konstruktor 2 Parameter");
    System.out.println("Keliling Lingkaran: "+cr1.keliling());
    System.out.println("Luas Lingkaran: "+cr1.luas());
    }
    
}
