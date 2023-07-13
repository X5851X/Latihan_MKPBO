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
public class KonversiSuhu {
    int celcius = 100;
    
    public int celciusToFahrenheit(){
        return ((celcius/5) * 9) + 32;
    }
    public int celciusToReamur(){
        return ((celcius/5) * 4);
    }
}
