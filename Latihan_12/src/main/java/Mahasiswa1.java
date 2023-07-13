/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Risvandiani
 */
public class Mahasiswa1 {
    double Absen, Tugas, UTS, UAS, NA;
    
    public double NilaiAkhir (double Absen,double Tugas, double UTS,double UAS){
        this.Absen = (Absen*0.1);
        this.Tugas = (Tugas*0.2);
        this.UTS = (UTS*0.3);
        this.UAS = (UAS*0.4);
        NA = (this.Absen + this.Tugas + this.UTS +this.UAS);
        return NA;
    }
    public char grade(double NA){
        return 0;
    }
}