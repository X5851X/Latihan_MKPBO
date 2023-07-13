/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5;

/**
 *
 * @author Risvandiani
 */
public class RankingKelas {
    String Nama1;
    double Nilai1;
    String Nama2;
    double Nilai2; 
    String NamaJuara;
    double NilaiJuara;
    
    RankingKelas(String inputNama1, double Nilai1, String inputNama2, double Nilai2){
        this.Nama1 = inputNama1;
        this.Nama2 = inputNama2;
        this.Nilai1 = Nilai1;
        this.Nilai2 = Nilai2;
    }
    
    public void getJuara(){
        if(this.Nilai1 < this.Nilai2){
            System.out.println("Juaranya adalah "+this.Nama2);
        }else if(this.Nilai2 < this.Nilai1){
            System.out.println("Juaranya adalah "+this.Nama1);
        }else{
            System.out.println("Nilai Keduanya Sama");
        }
    }
    
}
