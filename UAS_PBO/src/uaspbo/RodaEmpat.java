/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uaspbo;

/**
 *
 * @author Risvandiani
 */
public class RodaEmpat extends AngkutanDarat{
    public RodaEmpat(String nama){
        super(nama);
    }
    
    @Override
    public String toString(){
        return this.getClass().getSimpleName()+"[Nama"+this.nama+"]";
    }
}
