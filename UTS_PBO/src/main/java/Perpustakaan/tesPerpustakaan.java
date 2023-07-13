/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perpustakaan;

/**
 *
 * @author Risvandiani
 */
import java.util.Scanner;
public class tesPerpustakaan {

    /**
     * @param args the command line arguments
 */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
         System.out.println("Masukan Penerbit Buku : ");
         String penerbit = input.nextLine();
         System.out.println("Masukan Tahun Terbit Buku : ");
         Integer tahunTerbit = input.nextInt();
         System.out.println("Masukan Batasan Usia Buku : ");
         Integer usia = input.nextInt();
         System.out.println("Masukan Tebal Buku : ");
         Integer tebalBuku = input.nextInt();
         System.out.println("\n");
         Scanner input2 = new Scanner(System.in);
         System.out.println("Masukan Penerbit Buku : ");
         String penerbit2 = input2.nextLine();
         System.out.println("Masukan Tahun Terbit Buku : ");
         Integer tahunTerbit2 = input2.nextInt();
         System.out.println("Masukan Batasan Usia Buku : ");
         Integer usia2 = input2.nextInt();
         System.out.println("Masukan Tebal Buku : ");
         Integer tebalBuku2 = input2.nextInt();
         System.out.println("\n");
         Scanner input3 = new Scanner(System.in);
        System.out.println("Masukan Penerbit Buku : ");
        String penerbit3 = input3.nextLine();
        System.out.println("Masukan Karakter Utama : ");
        String namaKarakter = input3.nextLine();
        System.out.println("Masukan Tahun Terbit Buku : ");
        Integer tahunTerbit3 = input3.nextInt();
        System.out.println("Masukan Tebal Buku : ");
        Integer tebalBuku3 = input3.nextInt();
        System.out.println("\n");
        Scanner input4 = new Scanner(System.in);
        System.out.println("Masukan Penerbit Buku : ");
        String penerbit4 = input4.nextLine();
         System.out.println("Masukan Karakter Utama : ");
         String namaKarakter2 = input4.nextLine();
         System.out.println("Masukan Tahun Terbit Buku : ");
         Integer tahunTerbit4 = input4.nextInt();
         System.out.println("Masukan Tebal Buku : ");
         Integer tebalBuku4 = input4.nextInt();
         System.out.println("\n");
         BukuAnak ba1 = new BukuAnak(penerbit, tahunTerbit, usia, tebalBuku);
         System.out.println(ba1);
         BukuAnak ba2 = new BukuAnak(penerbit2, tahunTerbit2, usia2, tebalBuku2);
         System.out.println(ba2);
         Komik k1 = new Komik(penerbit3, tahunTerbit3, namaKarakter, tebalBuku3);
         System.out.println(k1);
         Komik k2 = new Komik(penerbit4, tahunTerbit4, namaKarakter2, tebalBuku4);
         System.out.println(k2);
         input.close();
    }
}