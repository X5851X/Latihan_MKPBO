/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6;

/**
 *
 * @author Risvandiani
 */
import java.util.Scanner;
public class perulanganDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner(System.in);
    int pilihan, ulang;
    
    do{
        System.out.println("Menu");
        System.out.println("================");
        System.out.println("1. Ayam");
        System.out.println("2. Sapi");
        System.out.println("================");
        
        System.out.println("Pilih Menu: ");
        pilihan = input.nextInt();
        
        System.out.println("Anda memilih pilihan ke- "+pilihan);
        System.out.println("ulangi? (0/1)");
        ulang = input.nextInt();
    }while(ulang==1);
    }
}
