package it.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import net.bytebuddy.utility.nullability.NeverNull;

@Entity
@Table(name = "ruolo")
public class RuoloDipendente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@NeverNull
	@Column
	private Integer idDipendente;// se il mio id è 17, il contratto con idDipendente 17 sarà il mio
	@NeverNull
	@Column
	private String inquadramento;
	@Column
	private String descrizione;
	@Column
	@NeverNull
	private String livello;
	@OneToOne
	@JoinColumn(name = "contratto_id", referencedColumnName = "id")
	private ContrattoDipendente contratto;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getIdDipendente() {
		return idDipendente;
	}
	public void setIdDipendente(Integer idDipendente) {
		this.idDipendente = idDipendente;
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
	public String getLivello() {
		return livello;
	}
	public void setLivello(String livello) {
		this.livello = livello;
	}
	public ContrattoDipendente getContratto() {
		return contratto;
	}
	public void setContratto(ContrattoDipendente contratto) {
		this.contratto = contratto;
	}

	

}
