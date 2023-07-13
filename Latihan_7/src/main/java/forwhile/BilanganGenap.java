/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forwhile;

/**
 *
 * @author Risvandiani
 */
public class BilanganGenap {
    int i,a;
    void getBilanganFor(){
        for(i=1;i<=20;i++){
            if(i%2==0)
                System.out.println("Bilangan Genap: "+i);
        } 
    }
    void getBilanganWhile(){
        while(a<=20){
            if(a%2==0)
            System.out.println("Bilangan Genap: "+a);
            a++;
        }
    }
}
