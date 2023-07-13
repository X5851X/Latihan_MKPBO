package Soal_2;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Risvandiani
 */
public class Nilai {
    String Nama,NIM;
    double Absen,Tugas,UTS,UAS,Akhir;
    
    void Nilai(){
        Nama    = "Risfandhiani Triara Putri";
        NIM     = "2110631170129";
        Absen   = 80*0.1;
        Tugas   = 80*0.2;
        UTS     = 80*0.3;
        UAS     = 80*0.4;
        Akhir   = Absen+Tugas+UTS+UAS;
    }
    void CetakNilai(){
        System.out.println("NIM                : "+NIM);
        System.out.println("Nama               : "+Nama);
        System.out.println("Nilai Absen[10%]   : "+Absen);
        System.out.println("Nilai Tugas[20%]   : "+Tugas);
        System.out.println("Nilai UTS[30%]     : "+UTS);
        System.out.println("Nilai UAS[40%]     : "+UAS);
        System.out.println("Nilai Akhir        : "+Akhir);
    }
}