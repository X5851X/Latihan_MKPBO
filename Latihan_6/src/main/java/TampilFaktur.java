/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Risvandiani
 */
public class TampilFaktur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Faktur fkt1 = new Faktur ("A101", "Pensil Hijau", 77, 750);
    System.out.println(fkt1);
    
    fkt1.setJumlah(99);
    fkt1.setHargaSatuan(900);
    System.out.println(fkt1);
    System.out.println("ID: " + fkt1.getID());
    System.out.println("Nama Barang: " + fkt1.getNama());
    System.out.println("Jumlah Barang: "+fkt1.getJumlah());
    System.out.println("Harga Satuan: "+fkt1.getHargaSatuan());
    
    System.out.println("Total Adalah: "+fkt1.getTotal());
    }
    
}
