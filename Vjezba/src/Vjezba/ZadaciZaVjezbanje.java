package Vjezba;

import javax.swing.JOptionPane;

public class ZadaciZaVjezbanje {

	public static void main(String[] args) {
		
		/* 1 zadatak 
		  For example assigning grades (A, B, C) based on percentage obtained by a student.
			if the percentage is above 90, assign grade A
			if the percentage is above 75, assign grade B
			if the percentage is above 65, assign grade C
		 
		int ocjena;
		
		ocjena = Integer.parseInt(JOptionPane.showInputDialog("koliki je postotak student imao na ispitu"));
		if(ocjena>90) {
			System.out.println("assign grade A");
		}else if (ocjena>75 && ocjena<90) {
			System.out.println("assign grade B");
		}else {
			System.out.println("assign grade C");
		}*/
		
		
		/*Write a Java program to get a number from the user and print whether it is positive or negative
		
		int broj;
		
		broj = Integer.parseInt(JOptionPane.showInputDialog("unesi broj"));
		
		if (broj > 0) {
			System.out.println("broj je pozitivan");
		}else if ( broj<0){
			System.out.println("broj je negativan");
		}else {
			System.out.println("broj je 0");
		}*/
		
		
		/*Take three numbers from the user and print the greatest number.*/
		
		int prviBroj, drugiBroj, treciBroj;
		
		prviBroj = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		drugiBroj = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
		treciBroj = Integer.parseInt(JOptionPane.showInputDialog("Unesi treci broj"));
		
		if (prviBroj>drugiBroj && prviBroj>treciBroj) {
			System.out.println("Najveci broj je " + prviBroj);
		}else if ( drugiBroj>treciBroj && drugiBroj>prviBroj) {
			System.out.println("Najveci broj je " + drugiBroj);
		}else if ( treciBroj>prviBroj && treciBroj>drugiBroj) {
			System.out.println("Najveci broj je " + treciBroj);
		}
		
		
		
		
	}
}
