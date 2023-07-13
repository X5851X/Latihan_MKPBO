package Latihan;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Risvandiani
 */
public class Lampu implements InterfaceLampu{
    int statusLampu;
    
    public void hidupkan(){
        if (statusLampu == KEADAAN_MATI){
            statusLampu = KEADAAN_HIDUP;
            System.out.println("Hidupkan Lampu! --> Lampu Hidup");
    }else{
            System.out.println("Hidupkan Lampu! --> Lampu Sudah Hidup Kok");}
    }
    public void matikan(){
        if (statusLampu == KEADAAN_HIDUP){
            statusLampu = KEADAAN_MATI;
            System.out.println("Matikan Lampu! --> Lampu Mati");
    }else{
        System.out.println("Matikan Lampu! --> Lampu Sudah Mati Kok");}
    }
}