/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uaspbo;

/**
 *
 * @author Risvandiani
 */
public class MotorMatic extends RodaDua {
    public MotorMatic(String nama) {
        super(nama);
    }
    
    public String deskripsi() {
        return "Ini motor matic injeksi";
    }
    
    public String deskripsi(String lainnya) {
        return "Ini motor matic karburator";
    }
    
@Override
public String toString() {
    String nomorVersi = "";
    if (deskripsi().equals("Ini motor matic injeksi")) {
        nomorVersi = "1";
    } else if (deskripsi().equals("Ini motor matic karburator")) {
        nomorVersi = "2";
    }

    return this.getClass().getSimpleName() + nomorVersi + "[" +
            this.getClass().getSuperclass().getSimpleName() + "[" +
            this.getClass().getSuperclass().getSuperclass().getSimpleName() +
            "[Nama=" + super.nama + "]]]";
}
}


