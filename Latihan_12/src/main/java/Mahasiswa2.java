/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Risvandiani
 */
public class Mahasiswa2 extends Mahasiswa1{

    @Override
    public char grade(double NA){
        if(NA>=80){
            return 'A';
        }else if(NA>=65){
            return 'B';
        }else if(NA>=56){
            return 'C';
        }else if(NA>=40){
            return 'D';
        }else{
            return 'E';
        }
    } 
}
