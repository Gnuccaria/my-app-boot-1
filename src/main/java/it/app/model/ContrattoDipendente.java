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

@Entity
@Table(name = "contratto")
public class ContrattoDipendente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	@Column
	@NeverNull
	private String codiceFiscale;
	@Column
	@NeverNull
	private String tipo;
	@Column
	@NeverNull
	private Integer oreContratto;
	@Column
	@NeverNull
	private Date dataAssunzione;
	@Column
	private Date dataScadenzaContratto;
	@Column
	@NeverNull
	private Float retribuzione;
	@OneToOne
	@JoinColumn(name = "ruolo_id", referencedColumnName = "id") 
	private RuoloDipendente ruoloDipendente;
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getCodiceDipendente() {
		return codiceFiscale;
	}
	public void setCodiceDipendente(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
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
	public Float getRetribuzione() {
		return retribuzione;
	}
	public void setRetribuzione(Float retribuzione) {
		this.retribuzione = retribuzione;
	}
	public RuoloDipendente getRuoloDipendente() {
		return ruoloDipendente;
	}
	public void setRuoloDipendente(RuoloDipendente ruoloDipendente) {
		this.ruoloDipendente = ruoloDipendente;
	}

}
