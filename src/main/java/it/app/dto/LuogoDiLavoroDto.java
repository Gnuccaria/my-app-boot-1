package it.app.dto;

public class LuogoDiLavoroDto {

	
	private Integer id;
	private String citta;
	private String indirizzo;
	private Integer civico;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCitta() {
		return citta;
	}
	public void setCitta(String citta) {
		this.citta = citta;
	}
	public String getIndirizzo() {
		return indirizzo;
	}
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}
	public Integer getCivico() {
		return civico;
	}
	public void setCivico(Integer civico) {
		this.civico = civico;
	}
}
