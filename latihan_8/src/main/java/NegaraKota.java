/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Risvandiani
 */
public class NegaraKota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //list Array
        String[][]namanegara={{"Amerika","Inggris","Jepang","Perancis"},
                              {"Indonesia","Iran","Irak"}};
        String[][]ibukota={{"Teheran","Bekasi","Jakarta"},
                           {"Bantar Gebang","Tokyo"}};
        //Akses Array
        System.out.println("Ibukota "+namanegara[1][0]+" adalah "+ibukota[0][2]);
        System.out.println("Ibukota "+namanegara[0][2]+" adalah "+ibukota[1][1]);
        System.out.println("Ibukota "+namanegara[1][1]+" adalah "+ibukota[0][0]);
    }
    
}
