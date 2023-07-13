/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3;

/**
 *
 * @author Risvandiani
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    mahasiswa mhs = new mahasiswa();
    
    mhs.nama = "Risfa";
    System.out.println(mhs.nama);
    
    mhs.setNPM("2110631170129");
    
    mhs.kelas = "3E";
    System.out.println(mhs.kelas);
    
    mhs.jurusan = "Informatika";
    System.out.println(mhs.jurusan);
    }
    
}
