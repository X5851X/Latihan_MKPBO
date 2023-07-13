/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspraktikum9;

import java.util.ArrayList;

/**
 *
 * @author Risvandiani
 */
public class inputdataMahasiswa {
    ArrayList<mahasiswa> listmahasiswa;
    public inputdataMahasiswa() {
        listmahasiswa = new ArrayList ();
    }
    public void insertData(String NIM, String Nama, String Alamat,String mataKuliah,String rata) {
        mahasiswa mhs = new mahasiswa(NIM, Nama, Alamat,mataKuliah,rata);
        listmahasiswa.add(mhs);
    }
    public ArrayList<mahasiswa> getALL() {
        return listmahasiswa;
    }
    public void deleteData(int index) {
        listmahasiswa.remove(index);
    }
}
