/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TPOOP4_2110631170129;

/**
 *
 * @author Risvandiani
 */
public class Polimorfisme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    BangunRuang BR = new BangunRuang();
    BangunRuang B = new Balok(1, 1, 1);  
    BangunRuang B1 = new Balok(1, 2);  
    BangunRuang K = new Kubus(1);
    
    BR.hitungluas();
    System.out.println("Luas Balok = "+B.hitungluas());
    System.out.println("Luas Balok = "+B1.hitungluas());
    System.out.println("Luas Kubus = "+K.hitungluas());
    
    BR.hitungkeliling();
    System.out.println("Keliling Balok = "+B.hitungkeliling()); 
    System.out.println("Keliling Balok = "+B1.hitungkeliling()); 
    System.out.println("Keliling Kubus = "+K.hitungkeliling());
    }
    
}
