package it.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orario")
public class OrarioDipendente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "ore_lavorate")
	private Integer oreLavorate;
	@Column(name = "ore_permesso_usufruite")
	private Integer orePermessoUsufruite;
	@Column(name = "ore_permesso_maturate")
	private Integer orePermessoMaturate;
	@Column(name = "ore_ferie")
	private Integer oreFerie;
	@Column(name = "ore_malattia")
	private Integer oreMalattia;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

}
