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
public class Mahasiswa3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner(System.in);
    Mahasiswa2 mhs = new Mahasiswa2();
    
    //(Nim Mahasiswa,Nama Mahasiswa, Nilai Absen [10%],
    //Nilai Tugas [20%], Nilai UTS[30%], Nilai UAS[40%])
    System.out.println("Nim Mahasiswa   : ");
    String nim = input.nextLine();
    System.out.println("Nama Mahasiswa  : ");
    String nama = input.nextLine();
    System.out.println("Nilai Absen [10%]  : ");
    double Absen = input.nextDouble();
    System.out.println("Nilai Tugas [20%]  : ");
    double Tugas = input.nextDouble();
    System.out.println("Nilai UTS [30%]    : ");
    double UTS = input.nextDouble();
    System.out.println("Nilai UAS [40%]    : ");
    double UAS = input.nextDouble();
      
    System.out.println("---------------------------------------------------");
    double NilaiAkhir = mhs.NilaiAkhir(Absen,Tugas,UTS,UAS);
    System.out.println("Nilai Akhir: "+NilaiAkhir);
    
    var grade = mhs.grade(NilaiAkhir);
    System.out.println("Grade: "+grade);
    }
}
    