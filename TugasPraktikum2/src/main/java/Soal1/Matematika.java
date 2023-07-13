/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal1;
import Soal2.interfaceMatematika;
/**
 *
 * @author Risvandiani
 */
public class Matematika implements interfaceMatematika{
    public void pertambahan (int a, int b){
        System.out.println("Pertambahan : "+a+"+"+b+" = "+(a+b));
    }
    public void pengurangan (int a, int b){
        System.out.println("Pengurangan : "+a+"-"+b+" = "+(a-b));
    }
    public void perkalian (int a, int b){
        System.out.println("Perkalian   : "+a+"*"+b+" = "+(a*b));
    }
    public void pembagian (int a, int b){
        System.out.println("Pembagian   : "+a+"/"+b+" = "+(a/b));
    }
}
