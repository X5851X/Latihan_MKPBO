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
public class Diskon {
    public void potongan (int total){
        if (total<50000){
            int dc = (int) (total * 0.05);
            System.out.println("Besar potongan Rp. "+dc);
            System.out.println("-------------------------------------------");
            System.out.println("Jumlah yang harus dibayarkan Rp. "+(total-dc));
        }else if (total>=50000){
            int dc = (int) (total * 0.2);
            System.out.println("Besar potongan Rp. "+dc);
            System.out.println("-------------------------------------------");
            System.out.println("Jumlah yang harus dibayarkan Rp. "+(total-dc));
        }
    }
}
