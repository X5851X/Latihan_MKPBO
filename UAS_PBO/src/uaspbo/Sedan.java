/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uaspbo;

/**
 *
 * @author Risvandiani
 */
public class Sedan extends RodaEmpat{
    public Sedan(String nama){
        super(nama);
    }
    
    public String deskripsi(){
        return "Ini mobil sedan";
    }
    
    @Override
    public String toString(){
       return this.getClass().getSimpleName()+"["+
              this.getClass().getSuperclass().getSimpleName()+"["+
              this.getClass().getSuperclass().getSuperclass().getSimpleName()+ 
              "[Nama="+this.getClass().getSimpleName()+"]]]";
    }
}
