package it.app.dto;

import java.util.Date;

import it.app.model.Dipendente;

public class RapportinoDto {

	private Integer id;
	
	private Dipendente codiceDipendente;
	
	private Integer oreLavorate;

	private Integer orePermessoUsufruite;

	private Integer orePermessoMaturate;

	private Integer oreFerie;

	private Integer oreMalattia;
	private Date meseRiferimento;
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	public Dipendente getCodiceDipendente() {
		return codiceDipendente;
	}

	public void setCodiceDipendente(Dipendente codiceDipendente) {
		this.codiceDipendente = codiceDipendente;
	}

	public Integer getOreLavorate() {
		return oreLavorate;
	}

	public void setOreLavorate(Integer oreLavorate) {
		this.oreLavorate = oreLavorate;
	}

	public Integer getOrePermessoUsufruite() {
		return orePermessoUsufruite;
	}

	public void setOrePermessoUsufruite(Integer orePermessoUsufruite) {
		this.orePermessoUsufruite = orePermessoUsufruite;
	}

	public Integer getOrePermessoMaturate() {
		return orePermessoMaturate;
	}

	public void setOrePermessoMaturate(Integer orePermessoMaturate) {
		this.orePermessoMaturate = orePermessoMaturate;
	}

	public Integer getOreFerie() {
		return oreFerie;
	}

	public void setOreFerie(Integer oreFerie) {
		this.oreFerie = oreFerie;
	}

	public Integer getOreMalattia() {
		return oreMalattia;
	}

	public void setOreMalattia(Integer oreMalattia) {
		this.oreMalattia = oreMalattia;
	}

	public Date getMeseRiferimento() {
		return meseRiferimento;
	}

	public void setMeseRiferimento(Date meseRiferimento) {
		this.meseRiferimento = meseRiferimento;
	}

}
