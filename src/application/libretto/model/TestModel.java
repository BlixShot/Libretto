package application.libretto.model;

public class TestModel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Model m = new Model();
		m.addEsame(new Esame("a", " basi", "cimitile"));
		m.addEsame(new Esame("b", "tdo", "corvo"));
		
		System.out.println(m.trovaEsame("a"));
		System.out.println(m.trovaEsame("c"));
		
		System.out.println(m.addEsame(new Esame("b", "tdo", "corvo")));
		
		
	}

}
