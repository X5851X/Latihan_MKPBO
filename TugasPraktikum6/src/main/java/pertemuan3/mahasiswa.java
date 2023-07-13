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
public class mahasiswa {
    String nama = "Risfa";
    private String npm = "123456789";
    public String kelas = "AB";
    protected String jurusan = "TI";
    
    private void getNPM(){
        System.out.println(this.npm);
    }
    void setNPM (String inputNPM){
        this.npm = inputNPM;
        getNPM();
    }
}
