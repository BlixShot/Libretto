package application.libretto.model;

import java.time.LocalDate;

public class TestEsame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Esame e = new Esame("1", "tdp", "corvo");
		System.out.println(e);
		//e.getVoto();
		e.supera(30, LocalDate.now());
		System.out.println(e);
		e.getVoto();
		System.out.println(e.getVoto());
	}

}
