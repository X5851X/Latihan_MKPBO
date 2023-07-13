package Soal3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Risvandiani
 */
public class Bingo {

    public static void main (String[] args) {
	for (int claps = 0; claps <= 5; claps++) {
	    System.out.println("VERSE " + (claps + 1));
	    System.out.println("");
	    System.out.println("There was a farmer who had a dog,");
	    System.out.println("And Bingo was his name-o."); 
	    for (int times = 0; times < 3; times++) {
		switch(claps) {
		    case 5: System.out.print("CLAP! ");
		    case 4: System.out.print("CLAP! ");
		    case 3: System.out.print("CLAP! ");
		    case 2: System.out.print("CLAP! ");
		    case 1: System.out.print("CLAP! ");
		}
		switch(claps) {
		    case 0: System.out.print("B ");
		    case 1: System.out.print("I ");
		    case 2: System.out.print("N ");
		    case 3: System.out.print("G ");
		    case 4: System.out.print("O ");
		}
		System.out.println(",");
	    }
	    System.out.println("And Bingo was his name-o.");
	    System.out.println("");
	}
    }
}