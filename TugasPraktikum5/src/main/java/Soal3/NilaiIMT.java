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
public class NilaiIMT extends IMT{
    double NilaiIMT = imt;
    @Override
    public char NilaiIMT(double imt){
    if (imt<=18.4){
        System.out.println("Kriteria: Berat Badan Kurang");
    }else if (imt>=18.5 && imt<=24.9){
        System.out.println("Kriteria: Berat Badan Ideal");
    }else if (imt>=25 && imt<=29.9){
        System.out.println("Kriteria: Berat Badan Lebih");
    }else if (imt>=30 && imt<=39.9){
        System.out.println("Kriteria: Gemuk");
    }else if (imt>=40){
        System.out.println("Kriteria: Sangat Gemuk");
    }else{
        System.out.println("Salah memasukkan berat badan atau tinggi");
    }
    return (char) imt;
    }
}
