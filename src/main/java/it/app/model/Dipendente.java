package it.app.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	@Column
	private String luogoNascita;
	@NeverNull
	@Column
	private Date dataNascita;
	@NeverNull
	@Column
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
	@Column
	private String telefonoCellulare;
	@Column
	private String telefonoCasa;
	@NeverNull
	@Column
	private Stato stato;
	@NeverNull
	@OneToOne
	@JoinColumn(name = "contratto", referencedColumnName = "codiceFiscale")
	private ContrattoDipendente contratto;
	@OneToOne
	@JoinColumn(name="profilo", referencedColumnName ="codice")
	private DipendenteProfilo profilo;
    
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
	public Stato getStato() {
		return stato;
	}
	public void setStato(Stato stato) {
		this.stato = stato;
	}
	public ContrattoDipendente getContratto() {
		return contratto;
	}
	public void setContratto(ContrattoDipendente contratto) {
		this.contratto = contratto;
	}
	public DipendenteProfilo getProfilo() {
		return profilo;
	}
	public void setProfilo(DipendenteProfilo profilo) {
		this.profilo = profilo;
	}
}
