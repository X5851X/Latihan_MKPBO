/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Risvandiani
 */
public class CekBilangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[]bilangan={9,3,7,8,2,4}; //deklarasi array dan objek
        
        //menampilkan bilangan di atas (sebelum dicek)
        System.out.println("Sebelum dicek: ");
        for(int i=0;i<bilangan.length;i++){
            System.out.printf("%d ", bilangan[i]);
        }System.out.println("\n");
        
        //membandingkan bilangan
        for(int i=0;i<bilangan.length;i++){
            for (int j=i+1;j<bilangan.length;j++){ 
                if(bilangan[i]>bilangan[j]){
                    int temp    = bilangan[i];
                    bilangan[i] = bilangan[j];
                    bilangan[j] = temp;
                }
            }
        }
        
        //tampilkan bilangan setelah dicek
        System.out.println("Setelah dicek: ");
        for(int i=0;i<bilangan.length;i++){
            System.out.printf("%d ", bilangan[i]);
        }
    }
}