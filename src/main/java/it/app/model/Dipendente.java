package it.app.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import net.bytebuddy.utility.nullability.NeverNull;

@Table(name = "dipendente")
@Entity
public class Dipendente {
//definire stato (attivo-non attivo(boolean)tabella correlata)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@NeverNull
	@Column
	private String nome;
	@NeverNull
	@Column
	private String sesso;
	@NeverNull
	@Column
	private String cognome;
	@NeverNull
	@Column(name = "luogo_nascita")
	private String luogoNascita;
	@NeverNull
	@Column(name = "data_nascita")
	private Date dataNascita;
	@NeverNull
	@Column(name = "codice_fiscale")
	private String codiceFiscale;
	@NeverNull
	@Column
	private String residenza;
	@NeverNull
	@Column
	private String indirizzo;
	@NeverNull
	@Column
	private String email;
	@NeverNull
	@Column(name = "num_cellulare")
	private String numeroCellulare;

	@Column(name = "tel_casa")
	private String telefonoCasa;
	@NeverNull

	@OneToOne
	@JoinColumn(name = "status_id", referencedColumnName = "id")
	private StatusGenerale statusGenerale;

	@OneToOne
	@JoinColumn(name = "contratto_id", referencedColumnName = "id")
	private ContrattoDipendente contrattoDipendente;

	@OneToOne
	@JoinColumn(name = "azienda_id", referencedColumnName = "id")
	private AziendaDipendente aziendaDipendente;

	@OneToOne
	@JoinColumn(name = "ore_id", referencedColumnName = "id")
	private OrarioDipendente orarioDipendente;
	

	public Integer getId() {
		return id;
	}

	public StatusGenerale getStatusGenerale() {
		return statusGenerale;
	}

	public void setStatusGenerale(StatusGenerale statusGenerale) {
		this.statusGenerale = statusGenerale;
	}

	public ContrattoDipendente getContrattoDipendente() {
		return contrattoDipendente;
	}

	public void setContrattoDipendente(ContrattoDipendente contrattoDipendente) {
		this.contrattoDipendente = contrattoDipendente;
	}

	public AziendaDipendente getAziendaDipendente() {
		return aziendaDipendente;
	}

	public void setAziendaDipendente(AziendaDipendente aziendaDipendente) {
		this.aziendaDipendente = aziendaDipendente;
	}

	public OrarioDipendente getOrarioDipendente() {
		return orarioDipendente;
	}

	public void setOrarioDipendente(OrarioDipendente orarioDipendente) {
		this.orarioDipendente = orarioDipendente;
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

	public String getNumeroCellulare() {
		return numeroCellulare;
	}

	public void setNumeroCellulare(String numeroCellulare) {
		this.numeroCellulare = numeroCellulare;
	}

	public String getTelefonoCasa() {
		return telefonoCasa;
	}

	public void setTelefonoCasa(String telefonoCasa) {
		this.telefonoCasa = telefonoCasa;
	}

}
