/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

/**
 *
 * @author Risvandiani
 */
public class overloading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    operasi2 operasi = new operasi2();
    
    int Jumlah2 = operasi.penjumlahan(3, 5);
    System.out.println(Jumlah2);
    int Jumlah3 = operasi.penjumlahan(4,5,6);
    System.out.println(Jumlah3);
    double Jumlah2IntDouble = operasi.penjumlahan(4,5.3);
    System.out.println(Jumlah2IntDouble);
    double Jumlah2Double = operasi.penjumlahan(4.5,5.3);
    System.out.println(Jumlah2Double);
    }
    
}
