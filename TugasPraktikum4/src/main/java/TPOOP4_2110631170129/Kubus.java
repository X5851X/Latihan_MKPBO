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
public class Kubus extends BangunRuang{
    private int s;
    
    public Kubus(int s){
        this.s = s;
    }
    
    @Override
    public int hitungluas() {//L = 6*((s*s))
        return 6*((this.s*this.s));
    }

    @Override
    public int hitungkeliling() {//K = 12*((s))
        return 12*((this.s));
    }
    
    
}
