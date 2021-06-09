package Vjezba;

import javax.swing.JOptionPane;

public class ZadaciZaVjezbanje {

	public static void main(String[] args) {
		
		/* 1 zadatak 
		  For example assigning grades (A, B, C) based on percentage obtained by a student.
			if the percentage is above 90, assign grade A
			if the percentage is above 75, assign grade B
			if the percentage is above 65, assign grade C*/
		 
		int ocjena;
		
		ocjena = Integer.parseInt(JOptionPane.showInputDialog("koliki je postotak student imao na ispitu"));
		if(ocjena>90) {
			System.out.println("assign grade A");
		}else if (ocjena>75 && ocjena<90) {
			System.out.println("assign grade B");
		}else {
			System.out.println("assign grade C");
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
