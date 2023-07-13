/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perpustakaan;

/**
 *
 * @author Risvandiani
 */
public class Buku {
    String penerbit;
    int tahunTerbit, tebalBuku;
    
    public Buku(String penerbit,int tahunTerbit) {
        this.penerbit = penerbit;
        this.tahunTerbit = tahunTerbit;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }
    
    public String cekKetebalan(){
        if (tebalBuku<=50){
            return "Tipis";
        }else if (tebalBuku>=51 && tebalBuku<=100){
            return "Sedang";
        }else{
            return "Tebal";
        }
    }
}
        


