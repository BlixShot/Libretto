package application.libretto.model;

import java.time.LocalDate;

public class Esame {

	private String codice;
	private String titolo;
	//private Docente docente;
	private String docente;
	private boolean superato;
	private int voto;
	private LocalDate data;
	
	public Esame(String codice, String titolo, String docente) {
		super();
		this.codice = codice;
		this.titolo = titolo;
		this.docente = docente;
		
		this.superato=false;
	}

	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getDocente() {
		return docente;
	}

	public void setDocente(String docente) {
		this.docente = docente;
	}

	public boolean isSuperato() {
		return superato;
	}

	public void setSuperato(boolean superato) {
		this.superato = superato;
	}

	public int getVoto() {
		if(this.superato)
			return voto;
		else
			throw new IllegalStateException("Esame non ancora superato");
	}

	public void setVoto(int voto) {
		this.voto = voto;
		
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Esame [codice=" + codice + ", titolo=" + titolo + ", docente=" + docente + ", superato=" + superato
				+ ", voto=" + voto + ", data=" + data + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codice == null) ? 0 : codice.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Esame other = (Esame) obj;
		if (codice == null) {
			if (other.codice != null)
				return false;
		} else if (!codice.equals(other.codice))
			return false;
		return true;
	} 
	
	public void supera(int voto, LocalDate data) {
		if(!this.superato) {
			this.superato=true;
			this.voto=voto;
			this.data=data;
		}
		else
			throw new IllegalStateException("Esame gia superato");
	}
	
	
	
}
