/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal3;

/**
 *
 * @author Risvandiani
 */
import java.util.Scanner;
public class IMTBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner (System.in);
    NilaiIMT i = new NilaiIMT();
    
    System.out.println("------------------------------------------");
    System.out.println("Program untuk menentukan kriteria kegemukan \n dengan menggunakan indeks massa tubuh \n\t\t (IMT)");
    System.out.println("------------------------------------------");
    
    System.out.println("\n_____________________________________");
    System.out.println("|Nilai IMT      |Kriteria           |");
    System.out.println("|_______________|___________________|");
    System.out.println("|18.4 ke bawah  |Berat Badan Kurang |");
    System.out.println("|18.5 - 24.9    |Berat Badan Ideal  |");
    System.out.println("|25 - 29.9      |Berat Badan Lebih  |");
    System.out.println("|30 - 39.9      |Gemuk              |");
    System.out.println("|40 ke atas     |Sangat Gemuk       |");
    System.out.println("_____________________________________\n");
    
    System.out.println("Berat Badan(kg) : ");
    double bb = input.nextDouble();
    System.out.println("Tinggi Badan(m) : ");
    double tb = input.nextDouble();
    System.out.println("------------------------------------------");
    double IMT = i.IMT(bb,tb);
    System.out.println("Nilai IMT: "+IMT);
    i.NilaiIMT(IMT);
    }
}
