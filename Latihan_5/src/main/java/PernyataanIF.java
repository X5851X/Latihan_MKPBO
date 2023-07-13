/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Risvandiani
 */

public class PernyataanIF {
    public static void main(String[] args) {
        int diskon,totalBelanja = 500000;
        if(totalBelanja >=100000){
            diskon = totalBelanja/10;
        }else{
            diskon=0;
        }
        System.out.println("Diskon = " + diskon);
        
    }
    
}