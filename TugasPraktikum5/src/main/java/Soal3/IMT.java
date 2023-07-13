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
public class IMT {
    double imt;
    public double IMT(double bb, double tb){
        imt = bb / (tb*tb);
        return imt;
    }
    public char NilaiIMT (double imt){
        return 0;
}
}
