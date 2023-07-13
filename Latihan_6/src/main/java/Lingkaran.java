/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Risvandiani
 */
public class Lingkaran {
    double r = 1.0;
    
    public Lingkaran(double r) {
       this.r = r;
    }

    Lingkaran() {

    }

    double setRad(double r){
     return this.r = r;
    }
    
    double getRad() {
     return this.r = r;
    }

    double getLuas() {
     return (3.14*this.r*this.r);
    }
    
    double getKeliling() {
      return (2*(3.14*this.r));
    }
    
    public String toString(){
        return "Lingkaran [jari-jari="+this.r+"]";
    }
}
