/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5;
import java.util.Scanner;
/**
 *
 * @author Risvandiani
 */
public class NilaiBeraksi {
     public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        
        System.out.println("Masukan Nama Anda: ");
        String Nama = input.nextLine();
        System.out.println("Masukan Nilai: ");
        double Nilai = input.nextDouble();
        
        NilaiMahasiswa mahasiswa1 = new NilaiMahasiswa(Nama,Nilai);
        System.out.println("Nama Saya "+ mahasiswa1.Nama);
        System.out.println("Nilai Saya "+ mahasiswa1.Nilai);
        
        System.out.println("--------------------------------------------");
        
        System.out.println("Masukan Nama Anda: ");
        String Nama2 = input2.nextLine();
        System.out.println("Masukan Nilai: ");
        double Nilai2 = input2.nextDouble();
        
        NilaiMahasiswa mahasiswa2 = new NilaiMahasiswa(Nama2,Nilai2);
        System.out.println("Nama Saya "+ mahasiswa2.Nama);
        System.out.println("Nilai Saya "+ mahasiswa2.Nilai);
        
        System.out.println("--------------------------------------------");
        
        RankingKelas kelas1 = new RankingKelas(Nama,Nilai,Nama2,Nilai2);
        kelas1.getJuara();
    }
}
