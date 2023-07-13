/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Risvandiani
 */
public class SepedaBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Sepeda sepedaku = new Sepeda();
        SepedaGunung sg = new SepedaGunung();
        
        sepedaku.setGir(3);
        sg.setGir(3);
        sg.setSadel(1);
        
        sepedaku.gir=5;
        System.out.println(sepedaku.getGir());
        System.out.println(sg.getGir());
        System.out.println(sg.getSadel());
    }
    
}
