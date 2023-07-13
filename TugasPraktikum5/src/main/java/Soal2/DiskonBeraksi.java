/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal2;

/**
 *
 * @author Risvandiani
 */
import java.util.Scanner;
public class DiskonBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Diskon diskon = new Diskon();
        Scanner input = new Scanner (System.in);
        
        System.out.println("Total pembelian Rp.=");
        int total = input.nextInt();
        diskon.potongan(total);
        
    }
    
}
