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
public class DemoKonversiSuhu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    KonversiSuhu KS = new KonversiSuhu();
    System.out.println("Celcius ke Fahrenheit   = "+KS.celciusToFahrenheit());
    System.out.println("Celcius ke Reamur       = "+KS.celciusToReamur()+"\n");
    
    KonversiSuhu2 KS2 = new KonversiSuhu2();
    System.out.println("Celcius ke Fahrenheit   = "+KS2.celciusToFahrenheit());
    System.out.println("Celcius ke Reamur       = "+KS2.celciusToReamur());
    System.out.println("Fahrenheit ke Reamur    = "+KS2.fahrenheitToReamur());
    }
    
}
