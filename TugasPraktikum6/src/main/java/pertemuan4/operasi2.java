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
public class operasi2 extends operasi{
    double penjumlahan (int x, double y){
        System.out.println("ini Method jumlah ketiga");
        return (double)x + y;
    }
    double penjumlahan (double x, double y){
        System.out.println("ini Method jumlah keempat");
        return x+y;
    }
    void cetak(){
        super.cetak();
    }
}
