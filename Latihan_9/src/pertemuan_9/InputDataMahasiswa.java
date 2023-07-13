/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan_9;

/**
 *
 * @author Risvandiani
 */
import java.util.ArrayList;
public class InputDataMahasiswa {
    ArrayList<Mahasiswa> listmahasiswa; 
    
    public InputDataMahasiswa() { 
        listmahasiswa = new ArrayList (); 
    }
    public void insertData(String NIM, String Nama, String Alamat) { 
        Mahasiswa mhs = new Mahasiswa(NIM, Nama, Alamat); 
        listmahasiswa.add(mhs); 
    }
    public ArrayList<Mahasiswa> getALL() { 
        return listmahasiswa; 
    }
 
    public void deleteData(int index) {
        listmahasiswa.remove(index);
    } 
}