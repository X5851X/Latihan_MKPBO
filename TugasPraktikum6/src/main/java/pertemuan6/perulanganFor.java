package pertemuan6;

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
public class perulanganFor {
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        
        System.out.println("Masukkan Angka: ");
        int i = input.nextInt();
       
        for (i=1;i<=10;i++){                     
            if (i%2==1){
                System.out.println("Bilangan Ganjil-"+i);
            }
        }
    }
}
