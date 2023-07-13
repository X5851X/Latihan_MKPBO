/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Risvandiani
 */
public class Faktur {
    String ID, namaBarang;
    int jumlah, hargaSatuan;
    
    Faktur(String ID, String namaBarang, int jumlah, int hargaSatuan) {
    this.ID = ID;
    this.namaBarang = namaBarang;
    this.jumlah = jumlah;
    this.hargaSatuan = hargaSatuan;
    }
    
    String getID() {
        return this.ID;
    }
    
    String getNama() {
        return this.namaBarang;
    }

    int getJumlah() {
        return this.jumlah;
    }
    
    void setJumlah(int i) {
        this.jumlah = i;
    }

    int getHargaSatuan() {
        return this.hargaSatuan;
    }
    
    void setHargaSatuan(int i) {
        this.hargaSatuan = i;
    }
    
    int getTotal() {
        return this.jumlah*this.hargaSatuan;
    }
    
    public String toString(){
        return ("Faktur "+"[id="+ID+" namaBarang="+namaBarang+" jumlah="+jumlah+" hargaSatuan="+hargaSatuan+" jumlah="+jumlah+" hargaSatuan="+hargaSatuan+"]");
    }
}
