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
public class BukuAnak extends Buku{
    int usia;
    BukuAnak(String judul, int tahunTerbit, int usia, int tebalBuku){
        super(judul,tahunTerbit);
        this.usia = usia;
        this.tebalBuku = tebalBuku;
    }
    @Override
    public String toString() {
        return "BukuAnak[judul]= "+super.getPenerbit()+", tahun terbit= "+super.getTahunTerbit() + ", batasan usia= " + usia + " tahun ke atas"+tebalBuku+"lembar="+super.cekKetebalan()+"]";
}  
}