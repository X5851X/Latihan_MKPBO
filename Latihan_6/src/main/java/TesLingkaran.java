/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Risvandiani
 */
public class TesLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Lingkaran l1 = new Lingkaran(1.1);
        System.out.println(l1);
        Lingkaran l2 = new Lingkaran();
        System.out.println(l2);
        
        l1.setRad(2.2);
        System.out.println(l1);
        System.out.println("Jari-jari lingkaran l:" + l1.getRad());
        
        System.out.printf("Luas Lingkaran 1: %.2f%n", l1.getLuas());
        System.out.printf("Keliling Lingkaran 1: %.2f%n", l1.getKeliling());
    }
    
}
