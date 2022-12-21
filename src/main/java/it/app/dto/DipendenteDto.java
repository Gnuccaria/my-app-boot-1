package it.app.dto;

import java.util.Date;

import it.app.model.AziendaDipendente;
import it.app.model.ContrattoDipendente;
import it.app.model.DipendenteProfilo;
import it.app.model.Stato;
import it.app.model.StatusGenerale;

public class DipendenteDto {

	private Integer id;
	private String nome;
	private String sesso;
	private String cognome;
	private String luogoNascita;
	private Date dataNascita;
	private String codiceFiscale;
	private String residenza;
	private String indirizzo;
	private String email;
	private String telefonoCellulare;
	private String telefonoCasa;
	private Stato stato;
	private DipendenteProfilo profilo;
	private ContrattoDipendente contratto;

	public ContrattoDipendente getContratto() {
		return contratto;
	}

	public void setContratto(ContrattoDipendente contratto) {
		this.contratto = contratto;
	}

	public Stato getStato() {
		return stato;
	}

	public void setStato(Stato stato) {
		this.stato = stato;
	}

	public DipendenteProfilo getProfilo() {
		return profilo;
	}

	public void setProfilo(DipendenteProfilo profilo) {
		this.profilo = profilo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSesso() {
		return sesso;
	}

	public void setSesso(String sesso) {
		this.sesso = sesso;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getLuogoNascita() {
		return luogoNascita;
	}

	public void setLuogoNascita(String luogoNascita) {
		this.luogoNascita = luogoNascita;
	}

	public Date getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	public String getResidenza() {
		return residenza;
	}

	public void setResidenza(String residenza) {
		this.residenza = residenza;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefonoCellulare() {
		return telefonoCellulare;
	}

	public void setTelefonoCellulare(String telefonoCellulare) {
		this.telefonoCellulare = telefonoCellulare;
	}

	public String getTelefonoCasa() {
		return telefonoCasa;
	}

	public void setTelefonoCasa(String telefonoCasa) {
		this.telefonoCasa = telefonoCasa;
	}

}
