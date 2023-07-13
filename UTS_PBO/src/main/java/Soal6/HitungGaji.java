package Soal6;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Risvandiani
 */
public class HitungGaji {
    int hari = 26, masa = 7;
    
    HitungGaji(){
        
    }
    HitungGaji(int hari, int masa){
      this.hari = hari;
      this.masa = masa;
    }
    void setHari(int h){
      this.hari = h;  
    }
    void setLamaMasa(int m){
       this.masa = m;
    }
    int getHari(){
       return this.hari;
    }
    int getMasa(){
       return this.masa;
    }
    int getGaji(){
       if(masa<=5){
           return hari*120000;        
       }else if(masa>5 && masa<= 10){
           return hari*130000;
       }else if(masa>10){
           return hari*150000;
       }
       return masa;
    }
    public String toString(){
       return ("HitungGaji"+"["+"hari kerja="+hari+",masa kerja (tahun)="+masa+"]");
    }
}
