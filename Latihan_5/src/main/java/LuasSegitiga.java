/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Risvandiani
 */
import java.util.Scanner;
public class LuasSegitiga {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double alas,tinggi;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukan Panjang Alas :");
        alas = input.nextDouble();
        
        System.out.println("Masukan Panjang Tinggi :");
        tinggi = input.nextDouble();
        
        double luas = (alas*tinggi)/2;
        System.out.println("Luas Segitiga adalah :" + luas);
    }
    
}