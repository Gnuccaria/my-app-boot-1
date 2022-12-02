package it.app.dto;


import it.app.model.ContrattoDipendente;

public class RuoloDipendenteDto {
	
	
	private Integer id;
	private String inquadramento;
	private String descrizione;
	private String livello;
	private ContrattoDipendente contratto;
	
	public String getLivello() {
		return livello;
	}
	public void setLivello(String livello) {
		this.livello = livello;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getInquadramento() {
		return inquadramento;
	}
	public void setInquadramento(String inquadramento) {
		this.inquadramento = inquadramento;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public ContrattoDipendente getContratto() {
		return contratto;
	}
	public void setContratto(ContrattoDipendente contratto) {
		this.contratto = contratto;
	}
}
