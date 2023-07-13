/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal1;

/**
 *
 * @author Risvandiani
 */
public class MatematikaInheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Matematika M    = new Matematika();
    M.pertambahan(20, 10);
    M.pengurangan(10, 5);
    M.perkalian(10, 3);
    M.pembagian(21, 2);
    
    System.out.println("\n");
    
    Matematika2 M2  = new Matematika2();
    M2.pertambahan(20, 10);
    M2.pengurangan(10, 5);
    M2.perkalian(10, 3);
    M2.pembagian(21, 2);
    M2.modulus(12,5);
    }
}
