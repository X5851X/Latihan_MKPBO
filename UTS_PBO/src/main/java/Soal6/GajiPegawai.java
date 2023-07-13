package Soal6;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Risvandiani
 */
public class GajiPegawai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HitungGaji hg1 = new HitungGaji (20,5);
        System.out.println( hg1);
        HitungGaji hg2 = new HitungGaji ();
        System.out.println(hg2);
        
        hg1.setHari(24);
        hg1.setLamaMasa(5); //tahun bekerja
        System.out.println(hg1); // toString()
        System.out.println("Jumlah hari kerja: " + hg1.getHari());
        System.out.println("Masa kerja (tahun): " + hg1.getMasa());
        System.out.printf("Total gaji yang diterima adalah: %d", hg1.getGaji());
    }
}

   
