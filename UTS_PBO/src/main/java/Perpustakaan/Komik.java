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
public class Komik extends Buku{
    String namaKarakter;
    Komik(String judul,int tahunTerbit,String namaKarakter, int tebalBuku){
        super(judul,tahunTerbit);
        this.namaKarakter = namaKarakter;
        this.tebalBuku = tebalBuku;
    }
    @Override
    public String toString() {
        return "Komik[judul= "+ super.getPenerbit() + ", tahun terbit= "+ super.getTahunTerbit() + ", karakter utama= " + namaKarakter + ","+tebalBuku+"lembar="+super.cekKetebalan()+"]";
    }
}
