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
public class MatematikaBeraksi {
     public static void main(String[] args) {
         // TODO code application logic here
        int pil,bil1,bil2;
        Scanner masuk = new Scanner(System.in);
        Matematika mu = new Matematika();
        System.out.println("Masukan Pilihan : 1. Pertambahan 2.Pengurangan 3.Perkalian 4.Pembagian");
        System.out.println("pilihan: "); 
        pil=masuk.nextInt();
        if(pil==1){
            System.out.println("Pertambahan"); 
            System.out.println("Angka1: ");
            bil1= masuk.nextInt();
            System.out.println("Angka2:");
            bil2=masuk.nextInt();
            System.out.println("pertambahan: "+bil1+"+"+bil2+"="+mu.pertambahan(bil1, bil2));
         }else if(pil==2){
            System.out.println("Pengurangan");
            System.out.println("Angka1: ");
            bil1= masuk.nextInt();
            System.out.println("Angka2: ");
            bil2=masuk.nextInt();
            System.out.println("pengurangan: "+bil1+"-"+bil2+"="+mu.pengurangan(bil1, bil2));
         }else if (pil==3){
            System.out.println("Perkalian");
            System.out.println("Angka1: ");
            bil1= masuk.nextInt();
            System.out.println("Angka2");
            bil2=masuk.nextInt();
            System.out.println("perkalian: "+bil1+"*"+bil2+"="+mu.perkalian(bil1, bil2));
         }else if (pil==4){
            System.out.println("Pembagian");
            System.out.println("Angka1: ");
            bil1= masuk.nextInt();
            System.out.println("Angka2: ");
            bil2=masuk.nextInt();
           System.out.println("pembagian: "+bil1+"/"+bil2+"="+mu.pembagian(bil1, bil2));
         }
          
    }
}