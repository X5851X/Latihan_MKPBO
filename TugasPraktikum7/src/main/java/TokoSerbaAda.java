/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Risvandiani
 */
import java.util.Scanner;
public class TokoSerbaAda {
    public static void main(String args[])
    {
        //Inisialisasi objek 
        Scanner input = new Scanner(System.in);
        //Deklarasi variabel
        int jum, i;
        int totalbayar=0;
        //Deklarasi array
        int [] harga = new int[15];
        int [] jmlhbeli = new int[15];
        int [] jmlhbayar = new int[15];
        String [] barang = new String[15];
        String [] kode = new String[15];
         
        System.out.println("TOKO SERBA ADA");
        System.out.println("******************");
         
        System.out.println("Masukkan Item Barang : ");
        jum=input.nextInt();
        
        //Memasukan elemen didalam array
        for (i=0; i<jum; i++){
            System.out.println("Data ke "+(i+1));
            System.out.println("Masukkan Kode       : ");
            kode[i]=input.next();
            System.out.println("Masukkan Jumlah Beli : ");
            jmlhbeli[i]=input.nextInt();
        
        //Memasukkan inputan barang
            switch (kode[i]) {
                case "a001":
                    barang[i]="Buku";
                    harga[i]=3000;
                break;
                case "a002":
                    barang[i]="Pensil";
                    harga[i]=4000;
                break;
                case "a003":
                    barang[i]="Pulpen";
                    harga[i]=5000;
                break;
                default:
                    System.out.println("Kode Barang Tidak Tersedia");
            }
        }
      
        System.out.println("\nTOKO SERBA ADA");
        System.out.println("************************************");
        System.out.println("No      Kode Barang     Nama Barang     Harga       Jumlah Beli     Jumlah Bayar");  
        System.out.println("================================================================================= ");          
        
        //Menampilkan seluruh elemen di dalam array
        for (i=0; i<jum;i++){ 
            jmlhbayar[i]=(jmlhbeli[i]*harga[i]);
            totalbayar+=jmlhbayar[i];
            System.out.println(i+1+"\t"+kode[i]+"\t\t"+barang[i]+"\t\t"+harga[i]+"\t\t"+jmlhbeli[i]+"\t\t"+jmlhbayar[i]); 
        }
        
        System.out.println("================================================================================= ");
          
        //Menampilkan total bayar
        System.out.println("Total Bayar\t\t\t\t\t\t\t\t"+totalbayar);
        System.out.println("================================================================================= ");
    }
}