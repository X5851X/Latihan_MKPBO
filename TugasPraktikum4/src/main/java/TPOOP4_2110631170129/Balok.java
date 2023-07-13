/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TPOOP4_2110631170129;

/**
 *
 * @author Risvandiani
 */
public class Balok extends BangunRuang{
    private int p,l,t;
    
    public Balok(int p, int l, int t){
        this.p = p;
        this.l = l;
        this.t = t;
    }
    public Balok(int p, int l){
        this.p = p;
        this.l = l;
        t = 1;
    }
            
    @Override
    public int hitungluas() {          //L = 2*((p*l+p*t+l*t))
        return 2*((this.p*this.l)+(this.p*this.t)+(this.l*this.t));
    }

    @Override
    public int hitungkeliling() {      //K = 4*((p+l+t))
        return 4*((this.p+this.l+this.t));
    }

}
