/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal2;

/**
 *
 * @author Risvandiani
 */
public class KonversiSuhu2 extends KonversiSuhu {
    double fahrenheit = 100;
    
    public double fahrenheitToReamur(){
        return ((fahrenheit-32))*4/9;
    }
}
