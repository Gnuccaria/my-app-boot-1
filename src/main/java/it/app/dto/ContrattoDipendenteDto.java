package it.app.dto;

import java.util.Date;

import it.app.model.RuoloDipendente;


public class ContrattoDipendenteDto {

    private Integer Id;
	private String tipo;
    private Integer oreContratto;
	private Date dataAssunzione;
	private Date dataScadenzaContratto;
	private RuoloDipendente ruoloDipendente;
	
	public RuoloDipendente getRuoloDipendente() {
		return ruoloDipendente;
	}
	public void setRuoloDipendente(RuoloDipendente ruoloDipendente) {
		this.ruoloDipendente = ruoloDipendente;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Integer getOreContratto() {
		return oreContratto;
	}
	public void setOreContratto(Integer oreContratto) {
		this.oreContratto = oreContratto;
	}
	public Date getDataAssunzione() {
		return dataAssunzione;
	}
	public void setDataAssunzione(Date dataAssunzione) {
		this.dataAssunzione = dataAssunzione;
	}
	public Date getDataScadenzaContratto() {
		return dataScadenzaContratto;
	}
	public void setDataScadenzaContratto(Date dataScadenzaContratto) {
		this.dataScadenzaContratto = dataScadenzaContratto;
	}
	
	
}
