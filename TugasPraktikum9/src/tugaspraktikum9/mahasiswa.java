/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspraktikum9;

/**
 *
 * @author Risvandiani
 */
public class mahasiswa {
    private String NIM, Nama, Alamat,mataKuliah,rata;
    public mahasiswa(String NIM, String Nama, String Alamat,String mataKuliah,String rata) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.mataKuliah = mataKuliah;
        this.rata = rata;
    }
    public String getAlamat() {
        return Alamat;
    }
    public String getNIM() {
        return NIM;
    }
    public String getNama() {
        return Nama;
    }
    public String getmataKuliah() {
        return mataKuliah;
    }
    public String getrata() {
        return rata;
    }
}
