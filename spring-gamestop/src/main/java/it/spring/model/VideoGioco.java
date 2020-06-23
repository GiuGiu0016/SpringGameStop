package it.spring.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class VideoGioco {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
	
	public String titolo;
	public double prezzo;
	
	@Enumerated(EnumType.STRING)
	public ClassificazionePegi pegi;
	
	@Enumerated(EnumType.STRING)
	public CategoriaVideogioco categoria;
		
	public VideoGioco() {
			
	}
	
	public VideoGioco(Long id,String titolo, double prezzo, ClassificazionePegi pegi, CategoriaVideogioco categoria) {
		super();
		this.id = id;
		this.titolo = titolo;
		this.prezzo = prezzo;
		this.pegi = pegi;
		this.categoria = categoria;
	}



	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public ClassificazionePegi getPegi() {
		return pegi;
	}

	public void setPegi(ClassificazionePegi pegi) {
		this.pegi = pegi;
	}

	public CategoriaVideogioco getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaVideogioco categoria) {
		this.categoria = categoria;
	}
	
	
	
	
	
	
	
}
